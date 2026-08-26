package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;

public final class PaintView$$ExternalSyntheticLambda28 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final SizeNotifierFrameLayoutPhoto f$0;
    public final Integer f$1;
    public final int f$2;

    public PaintView$$ExternalSyntheticLambda28(SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto, Integer num, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = sizeNotifierFrameLayoutPhoto;
        this.f$1 = num;
        this.f$2 = i;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                paintView.colorSwatch.color = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f$1.intValue(), this.f$2);
                PaintView.AnonymousClass9 anonymousClass9 = paintView.bottomLayout;
                if (anonymousClass9 != null) {
                    anonymousClass9.invalidate();
                }
                break;
            default:
                ((LPhotoPaintView) this.f$0).lambda$setCurrentSwatch$31(this.f$1, this.f$2, valueAnimator);
                break;
        }
    }
}
