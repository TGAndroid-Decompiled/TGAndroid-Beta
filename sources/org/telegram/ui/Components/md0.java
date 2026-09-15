package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class md0 extends AnimatorListenerAdapter {
    public final int f26147a;
    public final nd0 f26148b;

    public md0(nd0 nd0Var, int i10) {
        this.f26147a = i10;
        this.f26148b = nd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f26147a) {
            case 0:
                sd0 sd0Var = this.f26148b.d;
                sd0Var.P = 1.0f;
                sd0Var.f(1.0f);
                return;
            default:
                nd0 nd0Var = this.f26148b;
                Runnable runnable = nd0Var.f26442c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && nd0Var.d.f27840x.getVisibility() != 0 && (editTextBoldCursor = nd0Var.d.f27837r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(nd0Var.d.f27837r);
                    return;
                }
                return;
        }
    }
}
