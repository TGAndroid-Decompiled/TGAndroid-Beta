package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class k2 implements DialogInterface.OnDismissListener {
    public final int f42709a;
    public final Object f42710b;

    public k2(Object obj, int i7) {
        this.f42709a = i7;
        this.f42710b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42709a) {
            case 0:
                s2 s2Var = (s2) this.f42710b;
                if (!s2Var.f43148e) {
                    s2Var.f43148e = true;
                    f2 f2Var = s2Var.h;
                    if (f2Var != null) {
                        f2Var.run();
                    }
                    if (!s2Var.f43149f) {
                        s2Var.f43149f = true;
                        s2Var.f43146b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f42710b;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new o9(user));
                    return;
                }
                return;
            default:
                o9 o9Var = (o9) this.f42710b;
                EditTextBoldCursor editTextBoldCursor = o9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(o9Var.H);
                    return;
                }
                return;
        }
    }
}
