package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class sc0 extends AnimatorListenerAdapter {
    public final int f32442a;
    public final tc0 f32443b;

    public sc0(tc0 tc0Var, int i9) {
        this.f32442a = i9;
        this.f32443b = tc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f32442a) {
            case 0:
                yc0 yc0Var = this.f32443b.d;
                yc0Var.L = 1.0f;
                yc0Var.f(1.0f);
                return;
            default:
                tc0 tc0Var = this.f32443b;
                Runnable runnable = tc0Var.f32682c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && tc0Var.d.f34949x.getVisibility() != 0 && (editTextBoldCursor = tc0Var.d.f34946r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(tc0Var.d.f34946r);
                    return;
                }
                return;
        }
    }
}
