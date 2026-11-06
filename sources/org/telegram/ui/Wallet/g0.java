package org.telegram.ui.Wallet;

import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class g0 implements v10 {
    public final int f42514a;
    public final h0 f42515b;

    public g0(h0 h0Var, int i7) {
        this.f42514a = i7;
        this.f42515b = h0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f42514a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                h0 h0Var = this.f42515b;
                n0 n0Var = h0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    n0.j("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = h0Var.f42548c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(n0Var.f42792a).sendRequestTyped(disablebackup, new d3.b(1), new g0(h0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                n0 n0Var2 = this.f42515b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    n0.j(sb2.toString());
                    return;
                }
                n0Var2.l0(walletState);
                n0Var2.R();
                org.telegram.messenger.g0.i3(new z(1), 1000L);
                return;
        }
    }
}
