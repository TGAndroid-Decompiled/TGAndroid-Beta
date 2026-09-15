package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ex0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33421a;
    public final Object f33422b;
    public final View f33423c;
    public final Object d;

    public ex0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f33421a = i10;
        this.f33422b = obj;
        this.f33423c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f33421a) {
            case 0:
                jx0 jx0Var = (jx0) this.f33422b;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f34997n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f33423c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != jx0Var.e) {
                        if (childAt == jx0Var.f34995c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ib1 ib1Var = (ib1) this.f33422b;
                ib1Var.getClass();
                ib1Var.f34584a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f33423c).getEditField().setAlpha(ib1Var.f34584a);
                ((org.telegram.ui.Components.ui) this.d).invalidate();
                return;
        }
    }
}
