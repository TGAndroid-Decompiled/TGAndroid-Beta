package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class t3 implements DialogInterface.OnDismissListener {
    public final int f35474a;
    public final Object f35475b;

    public t3(Object obj, int i10) {
        this.f35474a = i10;
        this.f35475b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35474a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f35475b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new i8(user));
                    return;
                }
                return;
            case 1:
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.f35475b;
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(new i8(walletTransactionPeer.address));
                    return;
                }
                return;
            default:
                i8 i8Var = (i8) this.f35475b;
                EditTextBoldCursor editTextBoldCursor = i8Var.E;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(i8Var.E);
                    return;
                }
                return;
        }
    }
}
