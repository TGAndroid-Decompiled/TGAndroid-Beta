package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class os0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f50031a;
    public final Object f50032b;
    public final View f50033c;
    public final Object d;

    public os0(Object obj, ViewGroup viewGroup, Object obj2, int i7) {
        this.f50031a = i7;
        this.f50032b = obj;
        this.f50033c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f50031a) {
            case 0:
                rs0 rs0Var = (rs0) this.f50032b;
                PremiumPreviewFragment premiumPreviewFragment = rs0Var.f51016n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f50033c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i7 = 0; i7 < premiumPreviewFragment.V.getChildCount(); i7++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i7);
                    if (childAt != rs0Var.f51014e) {
                        if (childAt == rs0Var.f51013c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                i51 i51Var = (i51) this.f50032b;
                i51Var.getClass();
                i51Var.f47900a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f50033c).getEditField().setAlpha(i51Var.f47900a);
                ((org.telegram.ui.Components.ji) this.d).invalidate();
                return;
        }
    }
}
