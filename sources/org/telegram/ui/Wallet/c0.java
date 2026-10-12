package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.b31;
public final class c0 implements Utilities.Callback2 {
    public final int f32998a;
    public final d0 f32999b;

    public c0(d0 d0Var, int i10) {
        this.f32998a = i10;
        this.f32999b = d0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f32998a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                d0 d0Var = this.f32999b;
                j0 j0Var = d0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    j0.i("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = d0Var.f33035c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(j0Var.f33319a).sendRequestTyped(disablebackup, new Object(), new c0(d0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                j0 j0Var2 = this.f32999b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    j0.i(sb2.toString());
                    return;
                }
                j0Var2.g0(walletState);
                j0Var2.O();
                AndroidUtilities.runOnUIThread(new b31(6), 1000L);
                return;
        }
    }
}
