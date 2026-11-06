package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class m2 implements DialogInterface.OnDismissListener {
    public final int f42742a;
    public final Object f42743b;

    public m2(Object obj, int i7) {
        this.f42742a = i7;
        this.f42743b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42742a) {
            case 0:
                u2 u2Var = (u2) this.f42743b;
                if (!u2Var.f43173e) {
                    u2Var.f43173e = true;
                    h2 h2Var = u2Var.h;
                    if (h2Var != null) {
                        h2Var.run();
                    }
                    if (!u2Var.f43174f) {
                        u2Var.f43174f = true;
                        u2Var.f43171b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f42743b;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new n9(user));
                    return;
                }
                return;
            default:
                n9 n9Var = (n9) this.f42743b;
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
