package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39404a;
    public final Object f39405b;
    public final View f39406c;
    public final Object d;

    public lw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f39404a = i10;
        this.f39405b = obj;
        this.f39406c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f39404a) {
            case 0:
                qw0 qw0Var = (qw0) this.f39405b;
                PremiumPreviewFragment premiumPreviewFragment = qw0Var.f40941n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f39406c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != qw0Var.e) {
                        if (childAt == qw0Var.f40939c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                da1 da1Var = (da1) this.f39405b;
                da1Var.getClass();
                da1Var.f36552a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f39406c).getEditField().setAlpha(da1Var.f36552a);
                ((org.telegram.ui.Components.qi) this.d).invalidate();
                return;
        }
    }
}
