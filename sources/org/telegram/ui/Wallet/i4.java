package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class i4 implements DialogInterface.OnDismissListener {
    public final int f34320a;
    public final Object f34321b;

    public i4(Object obj, int i10) {
        this.f34320a = i10;
        this.f34321b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34320a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f34321b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new i9(user));
                    return;
                }
                return;
            default:
                i9 i9Var = (i9) this.f34321b;
                EditTextBoldCursor editTextBoldCursor = i9Var.E;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(i9Var.E);
                    return;
                }
                return;
        }
    }
}
