package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class w3 implements DialogInterface.OnDismissListener {
    public final int f35659a;
    public final Object f35660b;

    public w3(Object obj, int i10) {
        this.f35659a = i10;
        this.f35660b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35659a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f35660b;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new l8(user));
                    return;
                }
                return;
            case 1:
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.f35660b;
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(new l8(walletTransactionPeer.address));
                    return;
                }
                return;
            default:
                l8 l8Var = (l8) this.f35660b;
                EditTextBoldCursor editTextBoldCursor = l8Var.E;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(l8Var.E);
                    return;
                }
                return;
        }
    }
}
