package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class vd0 extends AnimatorListenerAdapter {
    public final int f27923a;
    public final wd0 f27924b;

    public vd0(wd0 wd0Var, int i10) {
        this.f27923a = i10;
        this.f27924b = wd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f27923a) {
            case 0:
                be0 be0Var = this.f27924b.d;
                be0Var.P = 1.0f;
                be0Var.f(1.0f);
                return;
            default:
                wd0 wd0Var = this.f27924b;
                Runnable runnable = wd0Var.f28756c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && wd0Var.d.f21816x.getVisibility() != 0 && (editTextBoldCursor = wd0Var.d.f21813r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(wd0Var.d.f21813r);
                    return;
                }
                return;
        }
    }
}
