package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class kw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f38640a;
    public final Object f38641b;
    public final View f38642c;
    public final Object d;

    public kw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f38640a = i10;
        this.f38641b = obj;
        this.f38642c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f38640a) {
            case 0:
                pw0 pw0Var = (pw0) this.f38641b;
                PremiumPreviewFragment premiumPreviewFragment = pw0Var.f40216n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f38642c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != pw0Var.e) {
                        if (childAt == pw0Var.f40214c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ba1 ba1Var = (ba1) this.f38641b;
                ba1Var.getClass();
                ba1Var.f35600a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f38642c).getEditField().setAlpha(ba1Var.f35600a);
                ((org.telegram.ui.Components.si) this.d).invalidate();
                return;
        }
    }
}
