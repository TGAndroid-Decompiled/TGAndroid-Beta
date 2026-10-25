package org.telegram.ui.Wallet;

import a8.af;
import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f37119a;
    public final String f37120b;

    public q0(String str, int i10) {
        this.f37119a = i10;
        this.f37120b = str;
    }

    @Override
    public final void run() {
        switch (this.f37119a) {
            case 0:
                v0 v0Var = af.f360b;
                if (v0Var != null) {
                    if (this.f37120b.equals(v0Var.d)) {
                        af.f360b.c("STORAGE_CANCELED");
                        af.f360b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f37120b);
                return;
        }
    }
}
