package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class iw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38117a;
    public final Object f38118b;
    public final View f38119c;
    public final Object d;

    public iw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f38117a = i10;
        this.f38118b = obj;
        this.f38119c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f38117a) {
            case 0:
                nw0 nw0Var = (nw0) this.f38118b;
                PremiumPreviewFragment premiumPreviewFragment = nw0Var.f39694n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f38119c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != nw0Var.e) {
                        if (childAt == nw0Var.f39692c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                z91 z91Var = (z91) this.f38118b;
                z91Var.getClass();
                z91Var.f43676a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f38119c).getEditField().setAlpha(z91Var.f43676a);
                ((org.telegram.ui.Components.si) this.d).invalidate();
                return;
        }
    }
}
