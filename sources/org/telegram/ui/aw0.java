package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class aw0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f36568a;
    public final Object f36569b;
    public final View f36570c;
    public final Object d;

    public aw0(Object obj, ViewGroup viewGroup, Object obj2, int i9) {
        this.f36568a = i9;
        this.f36569b = obj;
        this.f36570c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float dp;
        switch (this.f36568a) {
            case 0:
                fw0 fw0Var = (fw0) this.f36569b;
                PremiumPreviewFragment premiumPreviewFragment = fw0Var.f38361n;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f36570c;
                view.setAlpha(floatValue);
                view.setScaleX(floatValue);
                view.setScaleY(floatValue);
                float animatedFraction = ((ValueAnimator) this.d).getAnimatedFraction();
                for (int i9 = 0; i9 < premiumPreviewFragment.Q.getChildCount(); i9++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i9);
                    if (childAt != fw0Var.f38359e) {
                        if (childAt == fw0Var.f38358c) {
                            dp = 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction);
                        } else {
                            dp = 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction);
                        }
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + dp);
                    }
                }
                return;
            default:
                ca1 ca1Var = (ca1) this.f36569b;
                ca1Var.getClass();
                ca1Var.f37136a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActivityEnterView) this.f36570c).getEditField().setAlpha(ca1Var.f37136a);
                ((org.telegram.ui.Components.ji) this.d).invalidate();
                return;
        }
    }
}
