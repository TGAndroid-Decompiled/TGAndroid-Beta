package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class lw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38898a;
    public final Object f38899b;
    public final View f38900c;
    public final Object d;

    public lw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f38898a = i10;
        this.f38899b = obj;
        this.f38900c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f38898a) {
            case 0:
                qw0 qw0Var = (qw0) this.f38899b;
                PremiumPreviewFragment premiumPreviewFragment = qw0Var.f40712n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f38900c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.R.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.R.getChildAt(i10);
                    if (childAt != qw0Var.f40710e) {
                        if (childAt == qw0Var.f40709c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ra1 ra1Var = (ra1) this.f38899b;
                ra1Var.getClass();
                ra1Var.f40886a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f38900c).getEditField().setAlpha(ra1Var.f40886a);
                ((org.telegram.ui.Components.li) this.d).invalidate();
                return;
        }
    }
}
