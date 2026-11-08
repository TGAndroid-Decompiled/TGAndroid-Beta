package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class l2 implements DialogInterface.OnDismissListener {
    public final int f42736a;
    public final Object f42737b;

    public l2(Object obj, int i7) {
        this.f42736a = i7;
        this.f42737b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42736a) {
            case 0:
                t2 t2Var = (t2) this.f42737b;
                if (!t2Var.f43166e) {
                    t2Var.f43166e = true;
                    g2 g2Var = t2Var.h;
                    if (g2Var != null) {
                        g2Var.run();
                    }
                    if (!t2Var.f43167f) {
                        t2Var.f43167f = true;
                        t2Var.f43164b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f42737b;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new m9(user));
                    return;
                }
                return;
            default:
                m9 m9Var = (m9) this.f42737b;
                EditTextBoldCursor editTextBoldCursor = m9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(m9Var.H);
                    return;
                }
                return;
        }
    }
}
