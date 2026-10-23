package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class iw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38128a;
    public final Object f38129b;
    public final View f38130c;
    public final Object d;

    public iw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f38128a = i10;
        this.f38129b = obj;
        this.f38130c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f38128a) {
            case 0:
                nw0 nw0Var = (nw0) this.f38129b;
                PremiumPreviewFragment premiumPreviewFragment = nw0Var.f39704n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f38130c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != nw0Var.e) {
                        if (childAt == nw0Var.f39702c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                z91 z91Var = (z91) this.f38129b;
                z91Var.getClass();
                z91Var.f43686a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f38130c).getEditField().setAlpha(z91Var.f43686a);
                ((org.telegram.ui.Components.si) this.d).invalidate();
                return;
        }
    }
}
