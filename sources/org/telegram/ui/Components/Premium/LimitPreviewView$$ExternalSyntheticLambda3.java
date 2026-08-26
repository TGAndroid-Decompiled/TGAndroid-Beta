package org.telegram.ui.Components.Premium;

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.ui.Cells.CheckBoxCell;

public final class LimitPreviewView$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final View f$0;

    public LimitPreviewView$$ExternalSyntheticLambda3(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f$0;
                limitPreviewView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                limitPreviewView.limitIconRotation = fFloatValue < 0.5f ? (fFloatValue / 0.5f) * (-7.0f) : (1.0f - ((fFloatValue - 0.5f) / 0.5f)) * (-7.0f);
                break;
            case 1:
                PremiumButtonView premiumButtonView = (PremiumButtonView) this.f$0;
                premiumButtonView.getClass();
                premiumButtonView.loadingT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                premiumButtonView.buttonTextView.invalidate();
                CheckBoxCell.AnonymousClass1 anonymousClass1 = premiumButtonView.overlayTextView;
                if (anonymousClass1 != null) {
                    anonymousClass1.invalidate();
                }
                break;
            default:
                ((StarParticlesView) this.f$0).lambda$flingParticles$1(valueAnimator);
                break;
        }
    }
}
