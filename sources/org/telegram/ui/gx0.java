package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class gx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f33209a;
    public final Object f33210b;
    public final View f33211c;
    public final Object d;

    public gx0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f33209a = i10;
        this.f33210b = obj;
        this.f33211c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f33209a) {
            case 0:
                lx0 lx0Var = (lx0) this.f33210b;
                PremiumPreviewFragment premiumPreviewFragment = lx0Var.f34805n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f33211c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != lx0Var.e) {
                        if (childAt == lx0Var.f34803c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                pb1 pb1Var = (pb1) this.f33210b;
                pb1Var.getClass();
                pb1Var.f35764a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f33211c).getEditField().setAlpha(pb1Var.f35764a);
                ((org.telegram.ui.Components.xi) this.d).invalidate();
                return;
        }
    }
}
