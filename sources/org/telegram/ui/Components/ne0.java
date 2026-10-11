package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ne0 extends AnimatorListenerAdapter {
    public final int f29153a;
    public final oe0 f29154b;

    public ne0(oe0 oe0Var, int i10) {
        this.f29153a = i10;
        this.f29154b = oe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29153a) {
            case 0:
                te0 te0Var = this.f29154b.d;
                if (!te0Var.L) {
                    te0Var.T = 1.0f;
                    te0Var.g(1.0f);
                    return;
                }
                return;
            default:
                oe0 oe0Var = this.f29154b;
                te0 te0Var2 = oe0Var.d;
                if (!te0Var2.L) {
                    Runnable runnable = oe0Var.f29497c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && te0Var2.f31233x.getVisibility() != 0 && (editTextBoldCursor = te0Var2.f31230r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(te0Var2.f31230r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
