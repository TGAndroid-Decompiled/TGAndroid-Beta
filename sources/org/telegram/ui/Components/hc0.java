package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hc0 extends AnimatorListenerAdapter {
    public final int f35710a;
    public final ic0 f35711b;

    public hc0(ic0 ic0Var, int i7) {
        this.f35710a = i7;
        this.f35711b = ic0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f35710a) {
            case 0:
                oc0 oc0Var = this.f35711b.d;
                if (!oc0Var.Q) {
                    oc0Var.f38110b0 = 1.0f;
                    oc0Var.h(1.0f);
                    return;
                }
                return;
            default:
                ic0 ic0Var = this.f35711b;
                oc0 oc0Var2 = ic0Var.d;
                if (!oc0Var2.Q) {
                    Runnable runnable = ic0Var.f35988c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (org.telegram.messenger.bz.f23316r == 1 && oc0Var2.f38126y.getVisibility() != 0 && (editTextBoldCursor = oc0Var2.f38122r) != null) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(oc0Var2.f38122r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
