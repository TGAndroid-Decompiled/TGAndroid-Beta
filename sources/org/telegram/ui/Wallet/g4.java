package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class g4 implements DialogInterface.OnDismissListener {
    public final int f34268a;
    public final Object f34269b;

    public g4(Object obj, int i10) {
        this.f34268a = i10;
        this.f34269b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34268a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f34269b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new o9(user));
                    return;
                }
                return;
            default:
                o9 o9Var = (o9) this.f34269b;
                EditTextBoldCursor editTextBoldCursor = o9Var.E;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(o9Var.E);
                    return;
                }
                return;
        }
    }
}
