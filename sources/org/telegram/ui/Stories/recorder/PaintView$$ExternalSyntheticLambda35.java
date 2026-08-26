package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import androidx.core.graphics.ColorUtils;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;

public final class PaintView$$ExternalSyntheticLambda35 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final int f$2;

    public PaintView$$ExternalSyntheticLambda35(SharedMediaLayout.AnonymousClass45 anonymousClass45, int i, SharedMediaLayout.AnonymousClass19 anonymousClass19) {
        this.$r8$classId = 2;
        this.f$0 = anonymousClass45;
        this.f$2 = i;
        this.f$1 = anonymousClass19;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PaintView paintView = (PaintView) this.f$0;
                paintView.getClass();
                paintView.colorSwatch.color = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), ((Integer) this.f$1).intValue(), this.f$2);
                PaintView.AnonymousClass9 anonymousClass9 = paintView.bottomLayout;
                if (anonymousClass9 != null) {
                    anonymousClass9.invalidate();
                }
                break;
            case 1:
                LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.f$0;
                lPhotoPaintView.getClass();
                lPhotoPaintView.colorSwatch.color = ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), ((Integer) this.f$1).intValue(), this.f$2);
                LPhotoPaintView.BottomLayout bottomLayout = lPhotoPaintView.bottomLayout;
                if (bottomLayout != null) {
                    bottomLayout.invalidate();
                }
                break;
            default:
                ((SharedMediaLayout.AnonymousClass45) this.f$0).this$0.messageAlphaEnter.put(this.f$2, (Float) valueAnimator.getAnimatedValue());
                ((SharedMediaLayout.AnonymousClass19) this.f$1).invalidate();
                break;
        }
    }

    public PaintView$$ExternalSyntheticLambda35(SizeNotifierFrameLayoutPhoto sizeNotifierFrameLayoutPhoto, Integer num, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = sizeNotifierFrameLayoutPhoto;
        this.f$1 = num;
        this.f$2 = i;
    }
}
