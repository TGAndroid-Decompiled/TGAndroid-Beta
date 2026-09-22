package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class xd0 extends AnimatorListenerAdapter {
    public final int f30310a;
    public final yd0 f30311b;

    public xd0(yd0 yd0Var, int i10) {
        this.f30310a = i10;
        this.f30311b = yd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f30310a) {
            case 0:
                de0 de0Var = this.f30311b.d;
                de0Var.P = 1.0f;
                de0Var.f(1.0f);
                return;
            default:
                yd0 yd0Var = this.f30311b;
                Runnable runnable = yd0Var.f30639c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && yd0Var.d.f23675x.getVisibility() != 0 && (editTextBoldCursor = yd0Var.d.f23672r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(yd0Var.d.f23672r);
                    return;
                }
                return;
        }
    }
}
