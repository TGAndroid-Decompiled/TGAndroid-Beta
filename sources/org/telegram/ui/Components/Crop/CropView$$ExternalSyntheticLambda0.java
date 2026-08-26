package org.telegram.ui.Components.Crop;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.DiffUtil;

public final class CropView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final CropView f$0;
    public final float f$1;
    public final float[] f$2;
    public final float f$3;
    public final float f$4;

    public CropView$$ExternalSyntheticLambda0(CropView cropView, float f, float[] fArr, float f2, float f3, int i) {
        this.$r8$classId = i;
        this.f$0 = cropView;
        this.f$1 = f;
        this.f$2 = fArr;
        this.f$3 = f2;
        this.f$4 = f3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                CropView cropView = this.f$0;
                cropView.getClass();
                float fM = DiffUtil.m(this.f$1, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float[] fArr = this.f$2;
                float f = fArr[0];
                float f2 = fM / f;
                fArr[0] = f * f2;
                CropView.CropState.access$700(cropView.state, f2, this.f$3, this.f$4);
                cropView.updateMatrix(false);
                break;
            default:
                CropView cropView2 = this.f$0;
                cropView2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f3 = this.f$1 * fFloatValue;
                float[] fArr2 = this.f$2;
                float f4 = fArr2[1];
                float f5 = f3 - f4;
                fArr2[1] = f4 + f5;
                float f6 = this.f$3 * fFloatValue;
                float f7 = fArr2[2];
                float f8 = f6 - f7;
                fArr2[2] = f7 + f8;
                CropView.CropState cropState = cropView2.state;
                float f9 = fArr2[0];
                CropView.CropState.access$600(cropState, f5 * f9, f8 * f9);
                float f10 = ((this.f$4 - 1.0f) * fFloatValue) + 1.0f;
                float f11 = fArr2[0];
                float f12 = f10 / f11;
                fArr2[0] = f11 * f12;
                CropView.CropState.access$700(cropView2.state, f12, 0.0f, 0.0f);
                cropView2.updateMatrix(false);
                break;
        }
    }
}
