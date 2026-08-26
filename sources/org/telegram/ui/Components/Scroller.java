package org.telegram.ui.Components;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;

public final class Scroller {
    public static final float sViscousFluidNormalize;
    public static final float sViscousFluidScale;
    public int mCurrX;
    public int mCurrY;
    public final float mDeceleration;
    public float mDeltaX;
    public float mDeltaY;
    public int mDuration;
    public float mDurationReciprocal;
    public int mFinalX;
    public int mFinalY;
    public boolean mFinished = true;
    public final boolean mFlywheel = true;
    public final DecelerateInterpolator mInterpolator;
    public int mMaxX;
    public int mMaxY;
    public int mMinX;
    public int mMinY;
    public int mMode;
    public long mStartTime;
    public int mStartX;
    public int mStartY;
    public float mVelocity;
    public static final float DECELERATION_RATE = (float) (Math.log(0.75d) / Math.log(0.9d));
    public static final float START_TENSION = 0.4f;
    public static final float END_TENSION = 0.6f;
    public static final float[] SPLINE = new float[101];

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

    public Scroller(Context context, DecelerateInterpolator decelerateInterpolator) {
        this.mInterpolator = decelerateInterpolator;
        this.mDeceleration = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * ViewConfiguration.getScrollFriction();
    }

    public static float viscousFluid(float f) {
        float f2 = f * sViscousFluidScale;
        return (f2 < 1.0f ? f2 - (1.0f - ((float) Math.exp(-f2))) : DiffUtil.m(1.0f, (float) Math.exp(1.0f - f2), 0.63212055f, 0.36787945f)) * sViscousFluidNormalize;
    }

    public final void abortAnimation() {
        this.mCurrX = this.mFinalX;
        this.mCurrY = this.mFinalY;
        this.mFinished = true;
    }

    public final boolean computeScrollOffset() {
        if (this.mFinished) {
            return false;
        }
        int iCurrentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
        int i = this.mDuration;
        if (iCurrentAnimationTimeMillis >= i) {
            this.mCurrX = this.mFinalX;
            this.mCurrY = this.mFinalY;
            this.mFinished = true;
            return true;
        }
        int i2 = this.mMode;
        if (i2 == 0) {
            float f = iCurrentAnimationTimeMillis * this.mDurationReciprocal;
            DecelerateInterpolator decelerateInterpolator = this.mInterpolator;
            float fViscousFluid = decelerateInterpolator == null ? viscousFluid(f) : decelerateInterpolator.getInterpolation(f);
            this.mCurrX = Math.round(this.mDeltaX * fViscousFluid) + this.mStartX;
            this.mCurrY = Math.round(fViscousFluid * this.mDeltaY) + this.mStartY;
            return true;
        }
        if (i2 == 1) {
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
        return true;
    }

    public final void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        float fSqrt;
        float f;
        if (this.mFlywheel && !this.mFinished) {
            float fCurrentAnimationTimeMillis = this.mVelocity - ((this.mDeceleration * ((int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime))) / 2000.0f);
            float f2 = this.mFinalX - this.mStartX;
            float f3 = this.mFinalY - this.mStartY;
            float fSqrt2 = (float) Math.sqrt((f3 * f3) + (f2 * f2));
            float f4 = (f2 / fSqrt2) * fCurrentAnimationTimeMillis;
            float f5 = (f3 / fSqrt2) * fCurrentAnimationTimeMillis;
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
            double d = DECELERATION_RATE;
            double d2 = d - 1.0d;
            this.mDuration = (int) (Math.exp(dLog / d2) * 1000.0d);
            this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
            this.mStartX = i;
            this.mStartY = i2;
            if (fSqrt == 0.0f) {
                f = 1.0f;
            } else {
                f = i9 / fSqrt;
            }
            float f8 = fSqrt != 0.0f ? i10 / fSqrt : 1.0f;
            double dExp = Math.exp((d / d2) * dLog);
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
        double d3 = DECELERATION_RATE;
        double d4 = d3 - 1.0d;
        this.mDuration = (int) (Math.exp(dLog2 / d4) * 1000.0d);
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
        double dExp2 = Math.exp((d3 / d4) * dLog2);
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

    public final void startScroll(int i, int i2) {
        this.mMode = 0;
        this.mFinished = false;
        this.mDuration = i2;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartX = 0;
        this.mStartY = 0;
        this.mFinalX = 0;
        this.mFinalY = i;
        this.mDeltaX = 0;
        this.mDeltaY = i;
        this.mDurationReciprocal = 1.0f / this.mDuration;
    }
}
