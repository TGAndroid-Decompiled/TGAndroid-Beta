package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class k2 implements DialogInterface.OnDismissListener {
    public final int f42747a;
    public final Object f42748b;

    public k2(Object obj, int i3) {
        this.f42747a = i3;
        this.f42748b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42747a) {
            case 0:
                s2 s2Var = (s2) this.f42748b;
                if (!s2Var.f43147e) {
                    s2Var.f43147e = true;
                    f2 f2Var = s2Var.h;
                    if (f2Var != null) {
                        f2Var.run();
                    }
                    if (!s2Var.f43148f) {
                        s2Var.f43148f = true;
                        s2Var.f43145b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f42748b;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new m9(user));
                    return;
                }
                return;
            default:
                m9 m9Var = (m9) this.f42748b;
                EditTextBoldCursor editTextBoldCursor = m9Var.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(m9Var.I);
                    return;
                }
                return;
        }
    }
}
