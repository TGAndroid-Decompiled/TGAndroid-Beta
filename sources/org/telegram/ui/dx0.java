package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class dx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37171a;
    public final Object f37172b;
    public final View f37173c;
    public final Object d;

    public dx0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f37171a = i10;
        this.f37172b = obj;
        this.f37173c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f37171a) {
            case 0:
                ix0 ix0Var = (ix0) this.f37172b;
                PremiumPreviewFragment premiumPreviewFragment = ix0Var.f38833n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f37173c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != ix0Var.f38831e) {
                        if (childAt == ix0Var.f38830c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                kb1 kb1Var = (kb1) this.f37172b;
                kb1Var.getClass();
                kb1Var.f39292a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f37173c).getEditField().setAlpha(kb1Var.f39292a);
                ((org.telegram.ui.Components.xi) this.d).invalidate();
                return;
        }
    }
}
