package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class au0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35747a;
    public final Object f35748b;
    public final View f35749c;
    public final Object d;

    public au0(int i10, ViewGroup viewGroup, Object obj, Object obj2) {
        this.f35747a = i10;
        this.f35748b = obj;
        this.f35749c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float L;
        switch (this.f35747a) {
            case 0:
                du0 du0Var = (du0) this.f35748b;
                PremiumPreviewFragment premiumPreviewFragment = du0Var.f36836n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f35749c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != du0Var.e) {
                        if (childAt == du0Var.f36834c) {
                            L = 0.0f - (org.telegram.messenger.i0.L(15.0f) * animatedFraction);
                        } else {
                            L = 0.0f + (org.telegram.messenger.i0.L(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + L);
                    }
                }
                return;
            default:
                d71 d71Var = (d71) this.f35748b;
                d71Var.getClass();
                d71Var.f36642a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f35749c).getEditField().setAlpha(d71Var.f36642a);
                ((ih.e) this.d).invalidate();
                return;
        }
    }
}
