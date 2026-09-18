package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f34063a;
    public final Object f34064b;
    public final View f34065c;
    public final Object d;

    public gx0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f34063a = i10;
        this.f34064b = obj;
        this.f34065c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f34063a) {
            case 0:
                lx0 lx0Var = (lx0) this.f34064b;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.f35652n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f34065c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != lx0Var.e) {
                        if (childAt == lx0Var.f35650c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                kb1 kb1Var = (kb1) this.f34064b;
                kb1Var.getClass();
                kb1Var.f35191a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f34065c).getEditField().setAlpha(kb1Var.f35191a);
                ((org.telegram.ui.Components.ui) this.d).invalidate();
                return;
        }
    }
}
