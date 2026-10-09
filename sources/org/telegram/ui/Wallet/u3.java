package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class u3 implements DialogInterface.OnDismissListener {
    public final int f35533a;
    public final Object f35534b;

    public u3(Object obj, int i10) {
        this.f35533a = i10;
        this.f35534b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35533a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f35534b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new j8(user));
                    return;
                }
                return;
            case 1:
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.f35534b;
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(new j8(walletTransactionPeer.address));
                    return;
                }
                return;
            default:
                j8 j8Var = (j8) this.f35534b;
                EditTextBoldCursor editTextBoldCursor = j8Var.E;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(j8Var.E);
                    return;
                }
                return;
        }
    }
}
