package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.df0;
public final class f0 implements Utilities.Callback2 {
    public final int f34188a;
    public final g0 f34189b;

    public f0(g0 g0Var, int i10) {
        this.f34188a = i10;
        this.f34189b = g0Var;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f34188a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                g0 g0Var = this.f34189b;
                m0 m0Var = g0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    m0.i("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = g0Var.f34228c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(m0Var.f34476a).sendRequestTyped(disablebackup, new Object(), new f0(g0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                m0 m0Var2 = this.f34189b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    m0.i(sb2.toString());
                    return;
                }
                m0Var2.i0(walletState);
                m0Var2.P();
                AndroidUtilities.runOnUIThread(new df0(8), 1000L);
                return;
        }
    }
}
