package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;

public class Scroller {
    private static final int DEFAULT_DURATION = 250;
    private static final int FLING_MODE = 1;
    private static final int NB_SAMPLES = 100;
    private static final int SCROLL_MODE = 0;
    private static float sViscousFluidNormalize;
    private static float sViscousFluidScale;
    private int mCurrX;
    private int mCurrY;
    private float mDeceleration;
    private float mDeltaX;
    private float mDeltaY;
    private int mDuration;
    private float mDurationReciprocal;
    private int mFinalX;
    private int mFinalY;
    private boolean mFinished;
    private boolean mFlywheel;
    private Interpolator mInterpolator;
    private int mMaxX;
    private int mMaxY;
    private int mMinX;
    private int mMinY;
    private int mMode;
    private final float mPpi;
    private long mStartTime;
    private int mStartX;
    private int mStartY;
    private float mVelocity;
    private static float DECELERATION_RATE = (float) (Math.log(0.75d) / Math.log(0.9d));
    private static float START_TENSION = 0.4f;
    private static float END_TENSION = 0.6f;
    private static final float[] SPLINE = new float[101];

    static {
        float f;
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i <= 100; i++) {
            float f4 = i / 100.0f;
            float f5 = 1.0f;
            while (true) {
                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(f5, f3, 2.0f, f3);
                float f6 = 1.0f - fM;
                f = 3.0f * fM * f6;
                f2 = fM * fM * fM;
                float fM2 = AndroidUtilities$$ExternalSyntheticOutline0.m(fM, END_TENSION, f6 * START_TENSION, f) + f2;
                if (Math.abs(fM2 - f4) < 1.0E-5d) {
                    break;
                } else if (fM2 > f4) {
                    f5 = fM;
                } else {
                    f3 = fM;
                }
            }
            SPLINE[i] = f + f2;
        }
        SPLINE[100] = 1.0f;
        sViscousFluidScale = 8.0f;
        sViscousFluidNormalize = 1.0f;
        sViscousFluidNormalize = 1.0f / viscousFluid(1.0f);
    }

    public Scroller(Context context) {
        this(context, null);
    }

    private float computeDeceleration(float f) {
        return this.mPpi * 386.0878f * f;
    }

    public static float viscousFluid(float f) {
        float f2 = f * sViscousFluidScale;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : DiffUtil.m(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f)) * sViscousFluidNormalize;
    }

    public void abortAnimation() {
        this.mCurrX = this.mFinalX;
        this.mCurrY = this.mFinalY;
        this.mFinished = true;
    }

    public boolean computeScrollOffset() {
        if (this.mFinished) {
            return false;
        }
        int iCurrentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
        int i = this.mDuration;
        if (iCurrentAnimationTimeMillis < i) {
            int i2 = this.mMode;
            if (i2 == 0) {
                float f = iCurrentAnimationTimeMillis * this.mDurationReciprocal;
                Interpolator interpolator = this.mInterpolator;
                float fViscousFluid = interpolator == null ? viscousFluid(f) : interpolator.getInterpolation(f);
                this.mCurrX = Math.round(this.mDeltaX * fViscousFluid) + this.mStartX;
                this.mCurrY = Math.round(fViscousFluid * this.mDeltaY) + this.mStartY;
            } else if (i2 == 1) {
                float f2 = iCurrentAnimationTimeMillis / i;
                int i3 = (int) (f2 * 100.0f);
                float f3 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = SPLINE;
                float f4 = fArr[i3];
                float fM = DiffUtil.m(fArr[i4], f4, (f2 - f3) / ((i4 / 100.0f) - f3), f4);
                int i5 = this.mStartX;
                int iRound = Math.round((this.mFinalX - i5) * fM) + i5;
                this.mCurrX = iRound;
                int iMin = Math.min(iRound, this.mMaxX);
                this.mCurrX = iMin;
                this.mCurrX = Math.max(iMin, this.mMinX);
                int i6 = this.mStartY;
                int iRound2 = Math.round(fM * (this.mFinalY - i6)) + i6;
                this.mCurrY = iRound2;
                int iMin2 = Math.min(iRound2, this.mMaxY);
                this.mCurrY = iMin2;
                int iMax = Math.max(iMin2, this.mMinY);
                this.mCurrY = iMax;
                if (this.mCurrX == this.mFinalX && iMax == this.mFinalY) {
                    this.mFinished = true;
                }
            }
        } else {
            this.mCurrX = this.mFinalX;
            this.mCurrY = this.mFinalY;
            this.mFinished = true;
        }
        return true;
    }

    public void extendDuration(int i) {
        int iTimePassed = timePassed() + i;
        this.mDuration = iTimePassed;
        this.mDurationReciprocal = 1.0f / iTimePassed;
        this.mFinished = false;
    }

    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        float fSqrt;
        float f;
        if (this.mFlywheel && !this.mFinished) {
            float currVelocity = getCurrVelocity();
            float f2 = this.mFinalX - this.mStartX;
            float f3 = this.mFinalY - this.mStartY;
            float fSqrt2 = (float) Math.sqrt((f3 * f3) + (f2 * f2));
            float f4 = (f2 / fSqrt2) * currVelocity;
            float f5 = (f3 / fSqrt2) * currVelocity;
            i9 = i3;
            float f6 = i9;
            if (Math.signum(f6) == Math.signum(f4)) {
                i10 = i4;
                float f7 = i10;
                if (Math.signum(f7) == Math.signum(f5)) {
                    i9 = (int) (f6 + f4);
                    i10 = (int) (f7 + f5);
                }
            }
            this.mMode = 1;
            this.mFinished = false;
            fSqrt = (float) Math.sqrt((i10 * i10) + (i9 * i9));
            this.mVelocity = fSqrt;
            double dLog = Math.log((START_TENSION * fSqrt) / 800.0f);
            this.mDuration = (int) (Math.exp(dLog / (((double) DECELERATION_RATE) - 1.0d)) * 1000.0d);
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mStartX = i;
            this.mStartY = i2;
            if (fSqrt == 0.0f) {
                f = 1.0f;
            } else {
                f = i9 / fSqrt;
            }
            float f8 = fSqrt != 0.0f ? i10 / fSqrt : 1.0f;
            double d = DECELERATION_RATE;
            double dExp = Math.exp((d / (d - 1.0d)) * dLog);
            this.mMinX = i5;
            this.mMaxX = i6;
            this.mMinY = i7;
            this.mMaxY = i8;
            float f9 = (int) (dExp * ((double) 800.0f));
            int iRound = Math.round(f * f9) + i;
            this.mFinalX = iRound;
            int iMin = Math.min(iRound, this.mMaxX);
            this.mFinalX = iMin;
            this.mFinalX = Math.max(iMin, this.mMinX);
            int iRound2 = Math.round(f9 * f8) + i2;
            this.mFinalY = iRound2;
            int iMin2 = Math.min(iRound2, this.mMaxY);
            this.mFinalY = iMin2;
            this.mFinalY = Math.max(iMin2, this.mMinY);
        }
        i9 = i3;
        i10 = i4;
        this.mMode = 1;
        this.mFinished = false;
        fSqrt = (float) Math.sqrt((i10 * i10) + (i9 * i9));
        this.mVelocity = fSqrt;
        double dLog2 = Math.log((START_TENSION * fSqrt) / 800.0f);
        this.mDuration = (int) (Math.exp(dLog2 / (((double) DECELERATION_RATE) - 1.0d)) * 1000.0d);
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartX = i;
        this.mStartY = i2;
        if (fSqrt == 0.0f) {
            f = 1.0f;
        } else {
            f = i9 / fSqrt;
        }
        if (fSqrt != 0.0f) {
        }
        double d2 = DECELERATION_RATE;
        double dExp2 = Math.exp((d2 / (d2 - 1.0d)) * dLog2);
        this.mMinX = i5;
        this.mMaxX = i6;
        this.mMinY = i7;
        this.mMaxY = i8;
        float f10 = (int) (dExp2 * ((double) 800.0f));
        int iRound3 = Math.round(f * f10) + i;
        this.mFinalX = iRound3;
        int iMin3 = Math.min(iRound3, this.mMaxX);
        this.mFinalX = iMin3;
        this.mFinalX = Math.max(iMin3, this.mMinX);
        int iRound4 = Math.round(f10 * f8) + i2;
        this.mFinalY = iRound4;
        int iMin4 = Math.min(iRound4, this.mMaxY);
        this.mFinalY = iMin4;
        this.mFinalY = Math.max(iMin4, this.mMinY);
    }

    public final void forceFinished(boolean z) {
        this.mFinished = z;
    }

    public float getCurrVelocity() {
        return this.mVelocity - ((this.mDeceleration * timePassed()) / 2000.0f);
    }

    public final int getCurrX() {
        return this.mCurrX;
    }

    public final int getCurrY() {
        return this.mCurrY;
    }

    public final int getDuration() {
        return this.mDuration;
    }

    public final int getFinalX() {
        return this.mFinalX;
    }

    public final int getFinalY() {
        return this.mFinalY;
    }

    public final int getStartX() {
        return this.mStartX;
    }

    public final int getStartY() {
        return this.mStartY;
    }

    public final boolean isFinished() {
        return this.mFinished;
    }

    public boolean isScrollingInDirection(float f, float f2) {
        return !this.mFinished && Math.signum(f) == Math.signum((float) (this.mFinalX - this.mStartX)) && Math.signum(f2) == Math.signum((float) (this.mFinalY - this.mStartY));
    }

    public void setFinalX(int i) {
        this.mFinalX = i;
        this.mDeltaX = i - this.mStartX;
        this.mFinished = false;
    }

    public void setFinalY(int i) {
        this.mFinalY = i;
        this.mDeltaY = i - this.mStartY;
        this.mFinished = false;
    }

    public final void setFriction(float f) {
        this.mDeceleration = computeDeceleration(f);
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    public int timePassed() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
    }

    public Scroller(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mMode = 0;
        this.mFinished = false;
        this.mDuration = i5;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartX = i;
        this.mStartY = i2;
        this.mFinalX = i + i3;
        this.mFinalY = i2 + i4;
        this.mDeltaX = i3;
        this.mDeltaY = i4;
        this.mDurationReciprocal = 1.0f / this.mDuration;
    }

    public Scroller(Context context, Interpolator interpolator, boolean z) {
        this.mFinished = true;
        this.mInterpolator = interpolator;
        this.mPpi = context.getResources().getDisplayMetrics().density * 160.0f;
        this.mDeceleration = computeDeceleration(ViewConfiguration.getScrollFriction());
        this.mFlywheel = z;
    }
}
