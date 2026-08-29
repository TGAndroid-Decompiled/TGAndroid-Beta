package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class hd0 extends AnimatorListenerAdapter {
    public final int f29167a;
    public final id0 f29168b;

    public hd0(id0 id0Var, int i10) {
        this.f29167a = i10;
        this.f29168b = id0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29167a) {
            case 0:
                nd0 nd0Var = this.f29168b.d;
                nd0Var.L = 1.0f;
                nd0Var.f(1.0f);
                return;
            default:
                id0 id0Var = this.f29168b;
                Runnable runnable = id0Var.f29378c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && id0Var.d.f30969x.getVisibility() != 0 && (editTextBoldCursor = id0Var.d.f30966r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(id0Var.d.f30966r);
                    return;
                }
                return;
        }
    }
}
