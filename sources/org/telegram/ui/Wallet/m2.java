package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f42767a;
    public final Object f42768b;

    public m2(Object obj, int i7) {
        this.f42767a = i7;
        this.f42768b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42767a) {
            case 0:
                u2 u2Var = (u2) this.f42768b;
                if (!u2Var.f43198e) {
                    u2Var.f43198e = true;
                    h2 h2Var = u2Var.h;
                    if (h2Var != null) {
                        h2Var.run();
                    }
                    if (!u2Var.f43199f) {
                        u2Var.f43199f = true;
                        u2Var.f43196b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f42768b;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new n9(user));
                    return;
                }
                return;
            default:
                n9 n9Var = (n9) this.f42768b;
                EditTextBoldCursor editTextBoldCursor = n9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(n9Var.H);
                    return;
                }
                return;
        }
    }
}
