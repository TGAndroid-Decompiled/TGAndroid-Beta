package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
public final class e7 implements Runnable {
    public final int f42453a = 1;
    public final WalletEngine2 f42454b;
    public final String f42455c;
    public final c20 d;

    public e7(WalletEngine2 walletEngine2, String str, c20 c20Var) {
        this.f42454b = walletEngine2;
        this.f42455c = str;
        this.d = c20Var;
    }

    @Override
    public final void run() {
        switch (this.f42453a) {
            case 0:
                this.f42454b.lambda$previewSignMessage$7(this.d, this.f42455c);
                return;
            default:
                this.f42454b.lambda$getTransactionByHash$39(this.f42455c, this.d);
                return;
        }
    }

    public e7(WalletEngine2 walletEngine2, c20 c20Var, String str) {
        this.f42454b = walletEngine2;
        this.d = c20Var;
        this.f42455c = str;
    }
}
