package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class fe0 extends AnimatorListenerAdapter {
    public final int f26230a;
    public final ge0 f26231b;

    public fe0(ge0 ge0Var, int i10) {
        this.f26230a = i10;
        this.f26231b = ge0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f26230a) {
            case 0:
                le0 le0Var = this.f26231b.d;
                if (!le0Var.P) {
                    le0Var.f28205a0 = 1.0f;
                    le0Var.g(1.0f);
                    return;
                }
                return;
            default:
                ge0 ge0Var = this.f26231b;
                le0 le0Var2 = ge0Var.d;
                if (!le0Var2.P) {
                    Runnable runnable = ge0Var.f26554c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && le0Var2.f28220x.getVisibility() != 0 && (editTextBoldCursor = le0Var2.f28217r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(le0Var2.f28217r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
