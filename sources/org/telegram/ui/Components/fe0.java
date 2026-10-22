package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class fe0 extends AnimatorListenerAdapter {
    public final int f26215a;
    public final ge0 f26216b;

    public fe0(ge0 ge0Var, int i10) {
        this.f26215a = i10;
        this.f26216b = ge0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f26215a) {
            case 0:
                me0 me0Var = this.f26216b.d;
                if (!me0Var.P) {
                    me0Var.f28495a0 = 1.0f;
                    me0Var.h(1.0f);
                    return;
                }
                return;
            default:
                ge0 ge0Var = this.f26216b;
                me0 me0Var2 = ge0Var.d;
                if (!me0Var2.P) {
                    Runnable runnable = ge0Var.f26580c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && me0Var2.f28510x.getVisibility() != 0 && (editTextBoldCursor = me0Var2.f28507r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(me0Var2.f28507r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
