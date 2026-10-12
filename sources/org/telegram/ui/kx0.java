package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class kx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37774a;
    public final Object f37775b;
    public final View f37776c;
    public final Object d;

    public kx0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f37774a = i10;
        this.f37775b = obj;
        this.f37776c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f37774a) {
            case 0:
                px0 px0Var = (px0) this.f37775b;
                PremiumPreviewFragment premiumPreviewFragment = px0Var.f39304n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f37776c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != px0Var.e) {
                        if (childAt == px0Var.f39302c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                rb1 rb1Var = (rb1) this.f37775b;
                rb1Var.getClass();
                rb1Var.f39728a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f37776c).getEditField().setAlpha(rb1Var.f39728a);
                ((org.telegram.ui.Components.ui) this.d).invalidate();
                return;
        }
    }
}
