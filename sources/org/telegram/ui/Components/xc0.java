package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

public final class xc0 extends AnimatorListenerAdapter {

    public final int f34600a;

    public final yc0 f34601b;

    public xc0(yc0 yc0Var, int i10) {
        this.f34600a = i10;
        this.f34601b = yc0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f34600a) {
            case 0:
                dd0 dd0Var = this.f34601b.d;
                dd0Var.L = 1.0f;
                dd0Var.f(1.0f);
                break;
            default:
                yc0 yc0Var = this.f34601b;
                Runnable runnable = yc0Var.f34882c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && yc0Var.d.f27726x.getVisibility() != 0 && (editTextBoldCursor = yc0Var.d.f27723r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(yc0Var.d.f27723r);
                    break;
                }
                break;
        }
    }
}
