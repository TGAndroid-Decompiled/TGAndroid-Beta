package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.t21;
public final class d0 implements Utilities.Callback2 {
    public final int f34801a;
    public final e0 f34802b;

    public d0(e0 e0Var, int i10) {
        this.f34801a = i10;
        this.f34802b = e0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34801a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                e0 e0Var = this.f34802b;
                k0 k0Var = e0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    k0.i("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = e0Var.f34852c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(k0Var.f35155a).sendRequestTyped(disablebackup, new Object(), new d0(e0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                k0 k0Var2 = this.f34802b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    k0.i(sb2.toString());
                    return;
                }
                k0Var2.g0(walletState);
                k0Var2.O();
                AndroidUtilities.runOnUIThread(new t21(5), 1000L);
                return;
        }
    }
}
