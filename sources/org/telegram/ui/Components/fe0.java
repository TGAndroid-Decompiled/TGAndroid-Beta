package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class fe0 extends AnimatorListenerAdapter {
    public final int f26215a;
    public final ge0 f26216b;

    public fe0(ge0 ge0Var, int i10) {
        this.f26215a = i10;
        this.f26216b = ge0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f26215a) {
            case 0:
                le0 le0Var = this.f26216b.d;
                if (!le0Var.P) {
                    le0Var.f28190a0 = 1.0f;
                    le0Var.g(1.0f);
                    return;
                }
                return;
            default:
                ge0 ge0Var = this.f26216b;
                le0 le0Var2 = ge0Var.d;
                if (!le0Var2.P) {
                    Runnable runnable = ge0Var.f26581c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && le0Var2.f28205x.getVisibility() != 0 && (editTextBoldCursor = le0Var2.f28202r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(le0Var2.f28202r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
