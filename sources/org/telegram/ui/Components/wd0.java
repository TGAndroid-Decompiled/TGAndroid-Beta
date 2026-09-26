package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class wd0 extends AnimatorListenerAdapter {
    public final int f29972a;
    public final xd0 f29973b;

    public wd0(xd0 xd0Var, int i10) {
        this.f29972a = i10;
        this.f29973b = xd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29972a) {
            case 0:
                ce0 ce0Var = this.f29973b.d;
                ce0Var.P = 1.0f;
                ce0Var.f(1.0f);
                return;
            default:
                xd0 xd0Var = this.f29973b;
                Runnable runnable = xd0Var.f30323c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && xd0Var.d.f23328x.getVisibility() != 0 && (editTextBoldCursor = xd0Var.d.f23325r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(xd0Var.d.f23325r);
                    return;
                }
                return;
        }
    }
}
