package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.o61;
public final class f0 implements v10 {
    public final int f42484a;
    public final g0 f42485b;

    public f0(g0 g0Var, int i7) {
        this.f42484a = i7;
        this.f42485b = g0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42484a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                g0 g0Var = this.f42485b;
                m0 m0Var = g0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    m0.j("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = g0Var.f42519c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(m0Var.f42762a).sendRequestTyped(disablebackup, new d3.b(1), new f0(g0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                m0 m0Var2 = this.f42485b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    m0.j(sb2.toString());
                    return;
                }
                m0Var2.l0(walletState);
                m0Var2.R();
                org.telegram.messenger.g0.i3(new o61(3), 1000L);
                return;
        }
    }
}
