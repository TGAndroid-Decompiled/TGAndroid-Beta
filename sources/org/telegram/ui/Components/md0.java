package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class md0 extends AnimatorListenerAdapter {
    public final int f26164a;
    public final nd0 f26165b;

    public md0(nd0 nd0Var, int i10) {
        this.f26164a = i10;
        this.f26165b = nd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f26164a) {
            case 0:
                sd0 sd0Var = this.f26165b.d;
                sd0Var.P = 1.0f;
                sd0Var.f(1.0f);
                return;
            default:
                nd0 nd0Var = this.f26165b;
                Runnable runnable = nd0Var.f26413c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && nd0Var.d.f27921x.getVisibility() != 0 && (editTextBoldCursor = nd0Var.d.f27918r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(nd0Var.d.f27918r);
                    return;
                }
                return;
        }
    }
}
