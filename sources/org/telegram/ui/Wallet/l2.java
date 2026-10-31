package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.qq;
import org.telegram.ui.LaunchActivity;
public final class l2 implements DialogInterface.OnDismissListener {
    public final int f34834a;
    public final Object f34835b;

    public l2(Object obj, int i10) {
        this.f34834a = i10;
        this.f34835b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34834a) {
            case 0:
                t2 t2Var = (t2) this.f34835b;
                if (!t2Var.e) {
                    t2Var.e = true;
                    qq qqVar = t2Var.h;
                    if (qqVar != null) {
                        qqVar.run();
                    }
                    if (!t2Var.f35229f) {
                        t2Var.f35229f = true;
                        t2Var.f35227b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f34835b;
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new r9(user));
                    return;
                }
                return;
            default:
                r9 r9Var = (r9) this.f34835b;
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
