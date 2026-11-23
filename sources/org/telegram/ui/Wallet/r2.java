package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ao0;
public final class r2 implements DialogInterface.OnDismissListener {
    public final int f44987a;
    public final Object f44988b;

    public r2(Object obj, int i7) {
        this.f44987a = i7;
        this.f44988b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44987a) {
            case 0:
                z2 z2Var = (z2) this.f44988b;
                if (!z2Var.f45474e) {
                    z2Var.f45474e = true;
                    ao0 ao0Var = z2Var.h;
                    if (ao0Var != null) {
                        ao0Var.run();
                    }
                    if (!z2Var.f45475f) {
                        z2Var.f45475f = true;
                        z2Var.f45472b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f44988b;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new ea(user));
                    return;
                }
                return;
            default:
                ea eaVar = (ea) this.f44988b;
                EditTextBoldCursor editTextBoldCursor = eaVar.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(eaVar.I);
                    return;
                }
                return;
        }
    }
}
