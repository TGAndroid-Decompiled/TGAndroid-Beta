package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class qd0 extends AnimatorListenerAdapter {
    public final int f30389a;
    public final rd0 f30390b;

    public qd0(rd0 rd0Var, int i10) {
        this.f30389a = i10;
        this.f30390b = rd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f30389a) {
            case 0:
                xd0 xd0Var = this.f30390b.d;
                xd0Var.M = 1.0f;
                xd0Var.f(1.0f);
                return;
            default:
                rd0 rd0Var = this.f30390b;
                Runnable runnable = rd0Var.f30736c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && rd0Var.d.f33045x.getVisibility() != 0 && (editTextBoldCursor = rd0Var.d.f33042r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(rd0Var.d.f33042r);
                    return;
                }
                return;
        }
    }
}
