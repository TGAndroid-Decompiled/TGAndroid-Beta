package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.qq;
import org.telegram.ui.LaunchActivity;
public final class l2 implements DialogInterface.OnDismissListener {
    public final int f34838a;
    public final Object f34839b;

    public l2(Object obj, int i10) {
        this.f34838a = i10;
        this.f34839b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34838a) {
            case 0:
                u2 u2Var = (u2) this.f34839b;
                if (!u2Var.e) {
                    u2Var.e = true;
                    qq qqVar = u2Var.h;
                    if (qqVar != null) {
                        qqVar.run();
                    }
                    if (!u2Var.f35273f) {
                        u2Var.f35273f = true;
                        u2Var.f35271b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f34839b;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new r9(user));
                    return;
                }
                return;
            default:
                r9 r9Var = (r9) this.f34839b;
                EditTextBoldCursor editTextBoldCursor = r9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.i0.J3(r9Var.H);
                    return;
                }
                return;
        }
    }
}
