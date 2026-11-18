package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jw0;
public final class q2 implements DialogInterface.OnDismissListener {
    public final int f44815a;
    public final Object f44816b;

    public q2(Object obj, int i7) {
        this.f44815a = i7;
        this.f44816b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44815a) {
            case 0:
                y2 y2Var = (y2) this.f44816b;
                if (!y2Var.f45302e) {
                    y2Var.f45302e = true;
                    jw0 jw0Var = y2Var.h;
                    if (jw0Var != null) {
                        jw0Var.run();
                    }
                    if (!y2Var.f45303f) {
                        y2Var.f45303f = true;
                        y2Var.f45300b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f44816b;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new da(user));
                    return;
                }
                return;
            default:
                da daVar = (da) this.f44816b;
                EditTextBoldCursor editTextBoldCursor = daVar.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.I3(daVar.I);
                    return;
                }
                return;
        }
    }
}
