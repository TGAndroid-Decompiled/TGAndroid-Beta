package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class ao0 extends AnimatorListenerAdapter {
    public final int f32681a;
    public final boolean f32682b;
    public final jo0 f32683c;

    public ao0(jo0 jo0Var, boolean z4, int i10) {
        this.f32681a = i10;
        this.f32683c = jo0Var;
        this.f32682b = z4;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f32681a) {
            case 0:
                jo0 jo0Var = this.f32683c;
                AnimatorSet animatorSet = jo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jo0Var.v = null;
                    return;
                }
                return;
            default:
                jo0 jo0Var2 = this.f32683c;
                AnimatorSet animatorSet2 = jo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32681a) {
            case 0:
                jo0 jo0Var = this.f32683c;
                AnimatorSet animatorSet = jo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f32682b) {
                        jo0Var.f35412r.setVisibility(4);
                        return;
                    } else {
                        jo0Var.f35407n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                jo0 jo0Var2 = this.f32683c;
                AnimatorSet animatorSet2 = jo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f32682b) {
                        jo0Var2.f35414s.setVisibility(4);
                        return;
                    } else {
                        jo0Var2.R.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
