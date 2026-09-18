package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class vd0 extends AnimatorListenerAdapter {
    public final int f28987a;
    public final wd0 f28988b;

    public vd0(wd0 wd0Var, int i10) {
        this.f28987a = i10;
        this.f28988b = wd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f28987a) {
            case 0:
                be0 be0Var = this.f28988b.d;
                be0Var.P = 1.0f;
                be0Var.f(1.0f);
                return;
            default:
                wd0 wd0Var = this.f28988b;
                Runnable runnable = wd0Var.f30029c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && wd0Var.d.f22991x.getVisibility() != 0 && (editTextBoldCursor = wd0Var.d.f22988r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(wd0Var.d.f22988r);
                    return;
                }
                return;
        }
    }
}
