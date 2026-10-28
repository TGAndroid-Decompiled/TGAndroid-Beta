package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class f4 implements DialogInterface.OnDismissListener {
    public final int f36582a;
    public final Object f36583b;

    public f4(Object obj, int i10) {
        this.f36582a = i10;
        this.f36583b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f36582a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f36583b;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new i9(user));
                    return;
                }
                return;
            default:
                i9 i9Var = (i9) this.f36583b;
                EditTextBoldCursor editTextBoldCursor = i9Var.H;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(i9Var.H);
                    return;
                }
                return;
        }
    }
}
