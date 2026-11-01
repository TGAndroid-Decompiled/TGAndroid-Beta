package org.telegram.ui.Wallet;

import org.telegram.messenger.k20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
public final class d0 implements k20 {
    public final int f34366a;
    public final e0 f34367b;

    public d0(e0 e0Var, int i10) {
        this.f34366a = i10;
        this.f34367b = e0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f34366a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                e0 e0Var = this.f34367b;
                k0 k0Var = e0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    k0.j("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = e0Var.f34444c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(k0Var.f34781a).sendRequestTyped(disablebackup, new a3.b(1), new d0(e0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                k0 k0Var2 = this.f34367b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    k0.j(sb2.toString());
                    return;
                }
                k0Var2.l0(walletState);
                k0Var2.R();
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.n0(19), 1000L);
                return;
        }
    }
}
