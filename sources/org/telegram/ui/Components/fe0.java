package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class fe0 extends AnimatorListenerAdapter {
    public final int f26217a;
    public final ge0 f26218b;

    public fe0(ge0 ge0Var, int i10) {
        this.f26217a = i10;
        this.f26218b = ge0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f26217a) {
            case 0:
                le0 le0Var = this.f26218b.d;
                if (!le0Var.P) {
                    le0Var.f28192a0 = 1.0f;
                    le0Var.g(1.0f);
                    return;
                }
                return;
            default:
                ge0 ge0Var = this.f26218b;
                le0 le0Var2 = ge0Var.d;
                if (!le0Var2.P) {
                    Runnable runnable = ge0Var.f26583c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && le0Var2.f28207x.getVisibility() != 0 && (editTextBoldCursor = le0Var2.f28204r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(le0Var2.f28204r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
