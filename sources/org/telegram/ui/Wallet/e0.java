package org.telegram.ui.Wallet;

import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.ah0;
public final class e0 implements s10 {
    public final int f43783a;
    public final f0 f43784b;

    public e0(f0 f0Var, int i7) {
        this.f43783a = i7;
        this.f43784b = f0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f43783a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                f0 f0Var = this.f43784b;
                l0 l0Var = f0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    l0.j("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = f0Var.f43817c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(l0Var.f44078a).sendRequestTyped(disablebackup, new d3.b(1), new e0(f0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                l0 l0Var2 = this.f43784b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    l0.j(sb2.toString());
                    return;
                }
                l0Var2.l0(walletState);
                l0Var2.R();
                org.telegram.messenger.g0.i3(new ah0(7), 1000L);
                return;
        }
    }
}
