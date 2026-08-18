package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class Scroller {
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
                float f6 = ((f5 - f3) / 2.0f) + f3;
                float f7 = 1.0f - f6;
                f = 3.0f * f6 * f7;
                f2 = f6 * f6 * f6;
                float f8 = (((f7 * START_TENSION) + (END_TENSION * f6)) * f) + f2;
                if (Math.abs(f8 - f4) < 1.0E-5d) {
                    break;
                } else if (f8 > f4) {
                    f5 = f6;
                } else {
                    f3 = f6;
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

    public Scroller(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public Scroller(Context context, Interpolator interpolator, boolean z) {
        this.mFinished = true;
        this.mInterpolator = interpolator;
        this.mPpi = context.getResources().getDisplayMetrics().density * 160.0f;
        this.mDeceleration = computeDeceleration(ViewConfiguration.getScrollFriction());
        this.mFlywheel = z;
    }

    private float computeDeceleration(float f) {
        return this.mPpi * 386.0878f * f;
    }

    public final boolean isFinished() {
        return this.mFinished;
    }

    public final void forceFinished(boolean z) {
        this.mFinished = z;
    }

    public final int getCurrX() {
        return this.mCurrX;
    }

    public final int getCurrY() {
        return this.mCurrY;
    }

    public float getCurrVelocity() {
        return this.mVelocity - ((this.mDeceleration * timePassed()) / 2000.0f);
    }

    public final int getStartX() {
        return this.mStartX;
    }

    public final int getStartY() {
        return this.mStartY;
    }

    public final int getFinalY() {
        return this.mFinalY;
    }

    public boolean computeScrollOffset() {
        float interpolation;
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
                if (interpolator == null) {
                    interpolation = viscousFluid(f);
                } else {
                    interpolation = interpolator.getInterpolation(f);
                }
                this.mCurrX = this.mStartX + Math.round(this.mDeltaX * interpolation);
                this.mCurrY = this.mStartY + Math.round(interpolation * this.mDeltaY);
            } else if (i2 == 1) {
                float f2 = iCurrentAnimationTimeMillis / i;
                int i3 = (int) (f2 * 100.0f);
                float f3 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = SPLINE;
                float f4 = fArr[i3];
                float f5 = f4 + (((f2 - f3) / ((i4 / 100.0f) - f3)) * (fArr[i4] - f4));
                int i5 = this.mStartX;
                int iRound = i5 + Math.round((this.mFinalX - i5) * f5);
                this.mCurrX = iRound;
                int iMin = Math.min(iRound, this.mMaxX);
                this.mCurrX = iMin;
                this.mCurrX = Math.max(iMin, this.mMinX);
                int i6 = this.mStartY;
                int iRound2 = i6 + Math.round(f5 * (this.mFinalY - i6));
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

    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        float fSqrt;
        float f;
        if (this.mFlywheel && !this.mFinished) {
            float currVelocity = getCurrVelocity();
            float f2 = this.mFinalX - this.mStartX;
            float f3 = this.mFinalY - this.mStartY;
            float fSqrt2 = (float) Math.sqrt((f2 * f2) + (f3 * f3));
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
            fSqrt = (float) Math.sqrt((i9 * i9) + (i10 * i10));
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
            int iExp = (int) (((double) 800.0f) * Math.exp((d / (d - 1.0d)) * dLog));
            this.mMinX = i5;
            this.mMaxX = i6;
            this.mMinY = i7;
            this.mMaxY = i8;
            float f9 = iExp;
            int iRound = i + Math.round(f * f9);
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
        fSqrt = (float) Math.sqrt((i9 * i9) + (i10 * i10));
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
        int iExp2 = (int) (((double) 800.0f) * Math.exp((d2 / (d2 - 1.0d)) * dLog2));
        this.mMinX = i5;
        this.mMaxX = i6;
        this.mMinY = i7;
        this.mMaxY = i8;
        float f10 = iExp2;
        int iRound3 = i + Math.round(f * f10);
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

    static float viscousFluid(float f) {
        float fExp;
        float f2 = f * sViscousFluidScale;
        if (f2 < 1.0f) {
            fExp = f2 - (1.0f - ((float) Math.exp(-f2)));
        } else {
            fExp = 0.36787945f + ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f);
        }
        return fExp * sViscousFluidNormalize;
    }

    public void abortAnimation() {
        this.mCurrX = this.mFinalX;
        this.mCurrY = this.mFinalY;
        this.mFinished = true;
    }

    public int timePassed() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
    }
}
