package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cd0;
public final class m0 implements q10 {
    public final int f44507a;
    public final n0 f44508b;

    public m0(n0 n0Var, int i7) {
        this.f44507a = i7;
        this.f44508b = n0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f44507a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                n0 n0Var = this.f44508b;
                u0 u0Var = n0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    u0.n("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = n0Var.f44608c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(u0Var.f45083a).sendRequestTyped(disablebackup, new d3.b(1), new m0(n0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                u0 u0Var2 = this.f44508b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    u0.n(sb2.toString());
                    return;
                }
                u0Var2.w0(walletState);
                u0Var2.Z();
                org.telegram.messenger.g0.h3(new cd0(9), 1000L);
                return;
        }
    }
}
