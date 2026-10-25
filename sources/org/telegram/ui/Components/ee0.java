package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ee0 extends AnimatorListenerAdapter {
    public final int f27820a;
    public final fe0 f27821b;

    public ee0(fe0 fe0Var, int i10) {
        this.f27820a = i10;
        this.f27821b = fe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f27820a) {
            case 0:
                le0 le0Var = this.f27821b.d;
                if (!le0Var.P) {
                    le0Var.f30184a0 = 1.0f;
                    le0Var.h(1.0f);
                    return;
                }
                return;
            default:
                fe0 fe0Var = this.f27821b;
                le0 le0Var2 = fe0Var.d;
                if (!le0Var2.P) {
                    Runnable runnable = fe0Var.f28175c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && le0Var2.f30199x.getVisibility() != 0 && (editTextBoldCursor = le0Var2.f30196r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(le0Var2.f30196r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
