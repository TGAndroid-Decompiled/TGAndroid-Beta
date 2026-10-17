package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class f4 implements DialogInterface.OnDismissListener {
    public final int f34198a;
    public final Object f34199b;

    public f4(Object obj, int i10) {
        this.f34198a = i10;
        this.f34199b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34198a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f34199b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new l9(user));
                    return;
                }
                return;
            default:
                l9 l9Var = (l9) this.f34199b;
                EditTextBoldCursor editTextBoldCursor = l9Var.E;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(l9Var.E);
                    return;
                }
                return;
        }
    }
}
