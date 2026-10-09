package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ne0 extends AnimatorListenerAdapter {
    public final int f29149a;
    public final oe0 f29150b;

    public ne0(oe0 oe0Var, int i10) {
        this.f29149a = i10;
        this.f29150b = oe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29149a) {
            case 0:
                te0 te0Var = this.f29150b.d;
                if (!te0Var.L) {
                    te0Var.T = 1.0f;
                    te0Var.g(1.0f);
                    return;
                }
                return;
            default:
                oe0 oe0Var = this.f29150b;
                te0 te0Var2 = oe0Var.d;
                if (!te0Var2.L) {
                    Runnable runnable = oe0Var.f29474c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && te0Var2.f31171x.getVisibility() != 0 && (editTextBoldCursor = te0Var2.f31168r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(te0Var2.f31168r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
