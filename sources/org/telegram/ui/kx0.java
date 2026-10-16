package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class kx0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f37543a;
    public final Object f37544b;
    public final View f37545c;
    public final Object d;

    public kx0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f37543a = i10;
        this.f37544b = obj;
        this.f37545c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f37543a) {
            case 0:
                px0 px0Var = (px0) this.f37544b;
                PremiumPreviewFragment premiumPreviewFragment = px0Var.f39026n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f37545c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != px0Var.e) {
                        if (childAt == px0Var.f39024c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                rb1 rb1Var = (rb1) this.f37544b;
                rb1Var.getClass();
                rb1Var.f39448a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f37545c).getEditField().setAlpha(rb1Var.f39448a);
                ((org.telegram.ui.Components.ui) this.d).invalidate();
                return;
        }
    }
}
