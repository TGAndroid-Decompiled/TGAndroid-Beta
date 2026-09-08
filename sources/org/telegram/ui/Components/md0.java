package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class md0 extends AnimatorListenerAdapter {
    public final int f28463a;
    public final nd0 f28464b;

    public md0(nd0 nd0Var, int i10) {
        this.f28463a = i10;
        this.f28464b = nd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f28463a) {
            case 0:
                sd0 sd0Var = this.f28464b.d;
                sd0Var.P = 1.0f;
                sd0Var.f(1.0f);
                return;
            default:
                nd0 nd0Var = this.f28464b;
                Runnable runnable = nd0Var.f28761c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && nd0Var.d.f30291x.getVisibility() != 0 && (editTextBoldCursor = nd0Var.d.f30288r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(nd0Var.d.f30288r);
                    return;
                }
                return;
        }
    }
}
