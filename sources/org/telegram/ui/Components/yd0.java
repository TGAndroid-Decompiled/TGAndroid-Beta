package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class yd0 extends AnimatorListenerAdapter {
    public final int f33261a;
    public final zd0 f33262b;

    public yd0(zd0 zd0Var, int i10) {
        this.f33261a = i10;
        this.f33262b = zd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f33261a) {
            case 0:
                ee0 ee0Var = this.f33262b.d;
                ee0Var.P = 1.0f;
                ee0Var.f(1.0f);
                return;
            default:
                zd0 zd0Var = this.f33262b;
                Runnable runnable = zd0Var.f33495c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && zd0Var.d.f26135x.getVisibility() != 0 && (editTextBoldCursor = zd0Var.d.f26132r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(zd0Var.d.f26132r);
                    return;
                }
                return;
        }
    }
}
