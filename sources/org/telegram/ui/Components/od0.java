package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class od0 extends AnimatorListenerAdapter {
    public final int f27547a;
    public final pd0 f27548b;

    public od0(pd0 pd0Var, int i10) {
        this.f27547a = i10;
        this.f27548b = pd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f27547a) {
            case 0:
                vd0 vd0Var = this.f27548b.d;
                vd0Var.M = 1.0f;
                vd0Var.f(1.0f);
                return;
            default:
                pd0 pd0Var = this.f27548b;
                Runnable runnable = pd0Var.f27827c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && pd0Var.d.f29441x.getVisibility() != 0 && (editTextBoldCursor = pd0Var.d.f29438r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(pd0Var.d.f29438r);
                    return;
                }
                return;
        }
    }
}
