package org.telegram.ui.Wallet;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class u3 implements DialogInterface.OnDismissListener {
    public final int f33728a;
    public final Object f33729b;

    public u3(Object obj, int i10) {
        this.f33728a = i10;
        this.f33729b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f33728a) {
            case 0:
                TLRPC.User user = (TLRPC.User) this.f33729b;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(new i8(user));
                    return;
                }
                return;
            case 1:
                TL_wallet.WalletTransactionPeer walletTransactionPeer = (TL_wallet.WalletTransactionPeer) this.f33729b;
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(new i8(walletTransactionPeer.address));
                    return;
                }
                return;
            default:
                i8 i8Var = (i8) this.f33729b;
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
