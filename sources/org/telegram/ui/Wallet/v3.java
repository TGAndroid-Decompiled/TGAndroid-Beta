package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class v3 implements DialogInterface.OnDismissListener {
    public final int f35629a;
    public final Object f35630b;

    public v3(Object obj, int i10) {
        this.f35629a = i10;
        this.f35630b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f35629a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f35630b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new k8(user));
                    return;
                }
                return;
            case 1:
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.f35630b;
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(new k8(walletTransactionPeer.address));
                    return;
                }
                return;
            default:
                k8 k8Var = (k8) this.f35630b;
                EditTextBoldCursor editTextBoldCursor = k8Var.E;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(k8Var.E);
                    return;
                }
                return;
        }
    }
}
