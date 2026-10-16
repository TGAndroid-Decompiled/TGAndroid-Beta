package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class le0 extends AnimatorListenerAdapter {
    public final int f26732a;
    public final me0 f26733b;

    public le0(me0 me0Var, int i10) {
        this.f26732a = i10;
        this.f26733b = me0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f26732a) {
            case 0:
                re0 re0Var = this.f26733b.d;
                if (!re0Var.L) {
                    re0Var.T = 1.0f;
                    re0Var.g(1.0f);
                    return;
                }
                return;
            default:
                me0 me0Var = this.f26733b;
                re0 re0Var2 = me0Var.d;
                if (!re0Var2.L) {
                    Runnable runnable = me0Var.f27095c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && re0Var2.f28513x.getVisibility() != 0 && (editTextBoldCursor = re0Var2.f28510r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(re0Var2.f28510r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
