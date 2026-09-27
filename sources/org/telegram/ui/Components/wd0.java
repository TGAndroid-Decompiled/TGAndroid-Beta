package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class wd0 extends AnimatorListenerAdapter {
    public final int f29930a;
    public final xd0 f29931b;

    public wd0(xd0 xd0Var, int i10) {
        this.f29930a = i10;
        this.f29931b = xd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29930a) {
            case 0:
                ce0 ce0Var = this.f29931b.d;
                ce0Var.P = 1.0f;
                ce0Var.f(1.0f);
                return;
            default:
                xd0 xd0Var = this.f29931b;
                Runnable runnable = xd0Var.f30397c;
                if (runnable != null) {
                    runnable.run();
                }
                if (SharedConfig.passcodeType == 1 && xd0Var.d.f23311x.getVisibility() != 0 && (editTextBoldCursor = xd0Var.d.f23308r) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(xd0Var.d.f23308r);
                    return;
                }
                return;
        }
    }
}
