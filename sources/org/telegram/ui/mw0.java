package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class mw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f39715a;
    public final Object f39716b;
    public final View f39717c;
    public final Object d;

    public mw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f39715a = i10;
        this.f39716b = obj;
        this.f39717c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f39715a) {
            case 0:
                rw0 rw0Var = (rw0) this.f39716b;
                PremiumPreviewFragment premiumPreviewFragment = rw0Var.f41263n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f39717c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.U.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i10);
                    if (childAt != rw0Var.e) {
                        if (childAt == rw0Var.f41261c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ea1 ea1Var = (ea1) this.f39716b;
                ea1Var.getClass();
                ea1Var.f36890a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f39717c).getEditField().setAlpha(ea1Var.f36890a);
                ((org.telegram.ui.Components.si) this.d).invalidate();
                return;
        }
    }
}
