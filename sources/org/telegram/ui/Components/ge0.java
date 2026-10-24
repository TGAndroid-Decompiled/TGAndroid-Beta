package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ge0 extends AnimatorListenerAdapter {
    public final int f26648a;
    public final he0 f26649b;

    public ge0(he0 he0Var, int i10) {
        this.f26648a = i10;
        this.f26649b = he0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f26648a) {
            case 0:
                ne0 ne0Var = this.f26649b.d;
                if (!ne0Var.P) {
                    ne0Var.f28882a0 = 1.0f;
                    ne0Var.h(1.0f);
                    return;
                }
                return;
            default:
                he0 he0Var = this.f26649b;
                ne0 ne0Var2 = he0Var.d;
                if (!ne0Var2.P) {
                    Runnable runnable = he0Var.f27019c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && ne0Var2.f28897x.getVisibility() != 0 && (editTextBoldCursor = ne0Var2.f28894r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(ne0Var2.f28894r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
