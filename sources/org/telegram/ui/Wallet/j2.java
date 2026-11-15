package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nb1;
public final class j2 implements DialogInterface.OnDismissListener {
    public final int f44005a;
    public final Object f44006b;

    public j2(Object obj, int i7) {
        this.f44005a = i7;
        this.f44006b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f44005a) {
            case 0:
                r2 r2Var = (r2) this.f44006b;
                if (!r2Var.f44432e) {
                    r2Var.f44432e = true;
                    nb1 nb1Var = r2Var.h;
                    if (nb1Var != null) {
                        nb1Var.run();
                    }
                    if (!r2Var.f44433f) {
                        r2Var.f44433f = true;
                        r2Var.f44430b.c();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) this.f44006b;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(new p9(user));
                    return;
                }
                return;
            default:
                p9 p9Var = (p9) this.f44006b;
                EditTextBoldCursor editTextBoldCursor = p9Var.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    org.telegram.messenger.g0.J3(p9Var.I);
                    return;
                }
                return;
        }
    }
}
