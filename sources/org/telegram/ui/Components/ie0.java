package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
public final class ie0 extends AnimatorListenerAdapter {
    public final int f27308a;
    public final je0 f27309b;

    public ie0(je0 je0Var, int i10) {
        this.f27308a = i10;
        this.f27309b = je0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        EditTextBoldCursor editTextBoldCursor;
        switch (this.f27308a) {
            case 0:
                pe0 pe0Var = this.f27309b.d;
                if (!pe0Var.P) {
                    pe0Var.f29526a0 = 1.0f;
                    pe0Var.h(1.0f);
                    return;
                }
                return;
            default:
                je0 je0Var = this.f27309b;
                pe0 pe0Var2 = je0Var.d;
                if (!pe0Var2.P) {
                    Runnable runnable = je0Var.f27679c;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType == 1 && pe0Var2.f29541x.getVisibility() != 0 && (editTextBoldCursor = pe0Var2.f29538r) != null) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(pe0Var2.f29538r);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
