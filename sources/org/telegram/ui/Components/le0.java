package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class le0 extends AnimatorListenerAdapter {
    public final int f27032a;
    public final me0 f27033b;

    public le0(me0 me0Var, int i10) {
        this.f27032a = i10;
        this.f27033b = me0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f27032a) {
            case 0:
                re0 re0Var = this.f27033b.d;
                if (!re0Var.L) {
                    re0Var.T = 1.0f;
                    re0Var.g(1.0f);
                    return;
                }
                return;
            default:
                me0 me0Var = this.f27033b;
                re0 re0Var2 = me0Var.d;
                if (!re0Var2.L) {
                    Runnable runnable = me0Var.f27383c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && re0Var2.f28823x.getVisibility() != 0 && (editTextBoldCursor = re0Var2.f28820r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(re0Var2.f28820r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
