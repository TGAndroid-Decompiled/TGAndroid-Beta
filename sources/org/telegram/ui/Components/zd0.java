package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class zd0 extends AnimatorListenerAdapter {
    public final int f30956a;
    public final ae0 f30957b;

    public zd0(ae0 ae0Var, int i10) {
        this.f30956a = i10;
        this.f30957b = ae0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f30956a) {
            case 0:
                fe0 fe0Var = this.f30957b.d;
                fe0Var.P = 1.0f;
                fe0Var.f(1.0f);
                return;
            default:
                ae0 ae0Var = this.f30957b;
                Runnable runnable = ae0Var.f22617c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && ae0Var.d.f24287x.getVisibility() != 0 && (editTextBoldCursor = ae0Var.d.f24284r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(ae0Var.d.f24284r);
                    return;
                }
                return;
        }
    }
}
