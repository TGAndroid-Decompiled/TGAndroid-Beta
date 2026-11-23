package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.cd0;
public final class n0 implements p10 {
    public final int f44687a;
    public final o0 f44688b;

    public n0(o0 o0Var, int i7) {
        this.f44687a = i7;
        this.f44688b = o0Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f44687a) {
            case 0:
                WalletEngine2.ImportedWalletProof importedWalletProof = (WalletEngine2.ImportedWalletProof) obj;
                String str = (String) obj2;
                o0 o0Var = this.f44688b;
                v0 v0Var = o0Var.d;
                if (importedWalletProof == null) {
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    v0.n("disable backup: failed to prove challenge: ".concat(str));
                    return;
                }
                TL_wallet.disableBackup disablebackup = new TL_wallet.disableBackup();
                disablebackup.new_public_key = o0Var.f44784c;
                TL_wallet.walletOwnershipProof walletownershipproof = new TL_wallet.walletOwnershipProof();
                disablebackup.proof = walletownershipproof;
                walletownershipproof.signature = importedWalletProof.signature;
                walletownershipproof.timestamp = importedWalletProof.timestamp;
                ConnectionsManager.getInstance(v0Var.f45255a).sendRequestTyped(disablebackup, new d3.b(1), new n0(o0Var, 1));
                return;
            default:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                Object obj3 = (TLRPC.TL_error) obj2;
                v0 v0Var2 = this.f44688b.d;
                if (walletState == null) {
                    StringBuilder sb2 = new StringBuilder("disable backup: failed to disable backup on server: ");
                    if (obj3 == null) {
                        obj3 = "NULL_ERROR";
                    }
                    sb2.append(obj3);
                    v0.n(sb2.toString());
                    return;
                }
                v0Var2.w0(walletState);
                v0Var2.Z();
                org.telegram.messenger.g0.h3(new cd0(9), 1000L);
                return;
        }
    }
}
