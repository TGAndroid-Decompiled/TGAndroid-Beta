package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class hs0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45972a;
    public final Object f45973b;
    public final View f45974c;
    public final Object d;

    public hs0(int i3, ViewGroup viewGroup, Object obj, Object obj2) {
        this.f45972a = i3;
        this.f45973b = obj;
        this.f45974c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f45972a) {
            case 0:
                ks0 ks0Var = (ks0) this.f45973b;
                PremiumPreviewFragment premiumPreviewFragment = ks0Var.f47012n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f45974c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i3 = 0; i3 < premiumPreviewFragment.V.getChildCount(); i3++) {
                    View childAt = premiumPreviewFragment.V.getChildAt(i3);
                    if (childAt != ks0Var.f47010e) {
                        if (childAt == ks0Var.f47009c) {
                            L = 0.0f - (org.telegram.messenger.g0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.g0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                a51 a51Var = (a51) this.f45973b;
                a51Var.getClass();
                a51Var.f43612a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f45974c).getEditField().setAlpha(a51Var.f43612a);
                ((org.telegram.ui.Components.ai) this.d).invalidate();
                return;
        }
    }
}
