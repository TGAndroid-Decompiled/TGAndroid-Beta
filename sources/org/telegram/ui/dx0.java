package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class dx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37137a;
    public final Object f37138b;
    public final View f37139c;
    public final Object d;

    public dx0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f37137a = i10;
        this.f37138b = obj;
        this.f37139c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f37137a) {
            case 0:
                ix0 ix0Var = (ix0) this.f37138b;
                PremiumPreviewFragment premiumPreviewFragment = ix0Var.f38799n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f37139c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != ix0Var.f38797e) {
                        if (childAt == ix0Var.f38796c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                kb1 kb1Var = (kb1) this.f37138b;
                kb1Var.getClass();
                kb1Var.f39258a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f37139c).getEditField().setAlpha(kb1Var.f39258a);
                ((org.telegram.ui.Components.xi) this.d).invalidate();
                return;
        }
    }
}
