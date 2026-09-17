package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class ex0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36203a;
    public final Object f36204b;
    public final View f36205c;
    public final Object d;

    public ex0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f36203a = i10;
        this.f36204b = obj;
        this.f36205c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f36203a) {
            case 0:
                jx0 jx0Var = (jx0) this.f36204b;
                PremiumPreviewFragment premiumPreviewFragment = jx0Var.f37865n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f36205c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != jx0Var.f37863e) {
                        if (childAt == jx0Var.f37862c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                lb1 lb1Var = (lb1) this.f36204b;
                lb1Var.getClass();
                lb1Var.f38267a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f36205c).getEditField().setAlpha(lb1Var.f38267a);
                ((org.telegram.ui.Components.ui) this.d).invalidate();
                return;
        }
    }
}
