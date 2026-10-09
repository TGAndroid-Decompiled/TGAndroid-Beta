package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f35378a;
    public final String f35379b;

    public q0(String str, int i10) {
        this.f35378a = i10;
        this.f35379b = str;
    }

    @Override
    public final void run() {
        switch (this.f35378a) {
            case 0:
                v0 v0Var = w7.f6.f49951b;
                if (v0Var != null) {
                    if (this.f35379b.equals(v0Var.d)) {
                        w7.f6.f49951b.c("STORAGE_CANCELED");
                        w7.f6.f49951b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35379b);
                return;
        }
    }
}
