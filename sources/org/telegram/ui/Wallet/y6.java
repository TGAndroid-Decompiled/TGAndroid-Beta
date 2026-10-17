package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
public final class y6 implements Runnable {
    public final int f35178a = 1;
    public final WalletEngine2 f35179b;
    public final String f35180c;
    public final Utilities.Callback d;

    public y6(WalletEngine2 walletEngine2, String str, Utilities.Callback callback) {
        this.f35179b = walletEngine2;
        this.f35180c = str;
        this.d = callback;
    }

    @Override
    public final void run() {
        switch (this.f35178a) {
            case 0:
                this.f35179b.lambda$previewSignMessage$7(this.d, this.f35180c);
                return;
            default:
                this.f35179b.lambda$getTransactionByHash$39(this.f35180c, this.d);
                return;
        }
    }

    public y6(WalletEngine2 walletEngine2, Utilities.Callback callback, String str) {
        this.f35179b = walletEngine2;
        this.d = callback;
        this.f35180c = str;
    }
}
