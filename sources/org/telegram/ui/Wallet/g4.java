package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class g4 implements DialogInterface.OnDismissListener {
    public final int f34539a;
    public final Object f34540b;

    public g4(Object obj, int i10) {
        this.f34539a = i10;
        this.f34540b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f34539a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f34540b;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new j9(user));
                    return;
                }
                return;
            default:
                j9 j9Var = (j9) this.f34540b;
                EditTextBoldCursor editTextBoldCursor = j9Var.G;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(j9Var.G);
                    return;
                }
                return;
        }
    }
}
