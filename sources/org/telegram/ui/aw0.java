package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class aw0 implements ValueAnimator.AnimatorUpdateListener {

    public final int f36646a;

    public final Object f36647b;

    public final View f36648c;
    public final Object d;

    public aw0(Object obj, ViewGroup viewGroup, Object obj2, int i10) {
        this.f36646a = i10;
        this.f36647b = obj;
        this.f36648c = viewGroup;
        this.d = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f36646a) {
            case 0:
                fw0 fw0Var = (fw0) this.f36647b;
                ValueAnimator valueAnimator2 = (ValueAnimator) this.d;
                PremiumPreviewFragment premiumPreviewFragment = fw0Var.f38219n;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = this.f36648c;
                view.setAlpha(fFloatValue);
                view.setScaleX(fFloatValue);
                view.setScaleY(fFloatValue);
                float animatedFraction = valueAnimator2.getAnimatedFraction();
                for (int i10 = 0; i10 < premiumPreviewFragment.Q.getChildCount(); i10++) {
                    View childAt = premiumPreviewFragment.Q.getChildAt(i10);
                    if (childAt != fw0Var.f38217e) {
                        childAt.setTranslationY((view.getMeasuredHeight() * animatedFraction) + (childAt == fw0Var.f38216c ? 0.0f - (AndroidUtilities.dp(15.0f) * animatedFraction) : 0.0f + (AndroidUtilities.dp(8.0f) * animatedFraction)));
                    }
                }
                break;
            default:
                aa1 aa1Var = (aa1) this.f36647b;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f36648c;
                org.telegram.ui.Components.fi fiVar = (org.telegram.ui.Components.fi) this.d;
                aa1Var.getClass();
                aa1Var.f36477a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.getEditField().setAlpha(aa1Var.f36477a);
                fiVar.invalidate();
                break;
        }
    }
}
