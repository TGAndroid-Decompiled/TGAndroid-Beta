package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class re0 extends AnimatorListenerAdapter {
    public final int f30149a;
    public final se0 f30150b;

    public re0(se0 se0Var, int i10) {
        this.f30149a = i10;
        this.f30150b = se0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f30149a) {
            case 0:
                xe0 xe0Var = this.f30150b.d;
                if (!xe0Var.L) {
                    xe0Var.T = 1.0f;
                    xe0Var.g(1.0f);
                    return;
                }
                return;
            default:
                se0 se0Var = this.f30150b;
                xe0 xe0Var2 = se0Var.d;
                if (!xe0Var2.L) {
                    Runnable runnable = se0Var.f30559c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && xe0Var2.f32749x.getVisibility() != 0 && (editTextBoldCursor = xe0Var2.f32746r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(xe0Var2.f32746r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
