package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38171a;
    public final Object f38172b;
    public final View f38173c;
    public final Object d;

    public gx0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f38171a = i10;
        this.f38172b = obj;
        this.f38173c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f38171a) {
            case 0:
                lx0 lx0Var = (lx0) this.f38172b;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.f39869n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f38173c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != lx0Var.f39867e) {
                        if (childAt == lx0Var.f39866c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                nb1 nb1Var = (nb1) this.f38172b;
                nb1Var.getClass();
                nb1Var.f40349a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f38173c).getEditField().setAlpha(nb1Var.f40349a);
                ((org.telegram.ui.Components.zi) this.d).invalidate();
                return;
        }
    }
}
