package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class jw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f35522a;
    public final Object f35523b;
    public final View f35524c;
    public final Object d;

    public jw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f35522a = i10;
        this.f35523b = obj;
        this.f35524c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f35522a) {
            case 0:
                ow0 ow0Var = (ow0) this.f35523b;
                PremiumPreviewFragment premiumPreviewFragment = ow0Var.f36994n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f35524c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.R.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i10);
                    if (childAt != ow0Var.e) {
                        if (childAt == ow0Var.f36992c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                qa1 qa1Var = (qa1) this.f35523b;
                qa1Var.getClass();
                qa1Var.f37693a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f35524c).getEditField().setAlpha(qa1Var.f37693a);
                ((org.telegram.ui.Components.ki) this.d).invalidate();
                return;
        }
    }
}
