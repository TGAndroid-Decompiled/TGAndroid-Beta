package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jw0;
public final class q2 implements DialogInterface.OnDismissListener {
    public final int f44859a;
    public final Object f44860b;

    public q2(Object obj, int i7) {
        this.f44859a = i7;
        this.f44860b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44859a) {
            case 0:
                y2 y2Var = (y2) this.f44860b;
                if (!y2Var.f45346e) {
                    y2Var.f45346e = true;
                    jw0 jw0Var = y2Var.h;
                    if (jw0Var != null) {
                        jw0Var.run();
                    }
                    if (!y2Var.f45347f) {
                        y2Var.f45347f = true;
                        y2Var.f45344b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f44860b;
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new da(user));
                    return;
                }
                return;
            default:
                da daVar = (da) this.f44860b;
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
