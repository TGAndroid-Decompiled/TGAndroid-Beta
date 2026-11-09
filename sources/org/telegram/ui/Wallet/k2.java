package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class k2 implements DialogInterface.OnDismissListener {
    public final int f42655a;
    public final Object f42656b;

    public k2(Object obj, int i7) {
        this.f42655a = i7;
        this.f42656b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f42655a) {
            case 0:
                s2 s2Var = (s2) this.f42656b;
                if (!s2Var.f43084e) {
                    s2Var.f43084e = true;
                    f2 f2Var = s2Var.h;
                    if (f2Var != null) {
                        f2Var.run();
                    }
                    if (!s2Var.f43085f) {
                        s2Var.f43085f = true;
                        s2Var.f43082b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f42656b;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new l9(user));
                    return;
                }
                return;
            default:
                l9 l9Var = (l9) this.f42656b;
                EditTextBoldCursor editTextBoldCursor = l9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.K3(l9Var.H);
                    return;
                }
                return;
        }
    }
}
