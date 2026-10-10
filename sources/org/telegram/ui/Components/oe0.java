package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class oe0 extends AnimatorListenerAdapter {
    public final int f29463a;
    public final pe0 f29464b;

    public oe0(pe0 pe0Var, int i10) {
        this.f29463a = i10;
        this.f29464b = pe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f29463a) {
            case 0:
                ue0 ue0Var = this.f29464b.d;
                if (!ue0Var.L) {
                    ue0Var.T = 1.0f;
                    ue0Var.g(1.0f);
                    return;
                }
                return;
            default:
                pe0 pe0Var = this.f29464b;
                ue0 ue0Var2 = pe0Var.d;
                if (!ue0Var2.L) {
                    Runnable runnable = pe0Var.f29762c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && ue0Var2.f31484x.getVisibility() != 0 && (editTextBoldCursor = ue0Var2.f31481r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(ue0Var2.f31481r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
