package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f35061a;
    public final String f35062b;

    public q0(String str, int i10) {
        this.f35061a = i10;
        this.f35062b = str;
    }

    @Override
    public final void run() {
        switch (this.f35061a) {
            case 0:
                v0 v0Var = w7.h6.f49151b;
                if (v0Var != null) {
                    if (this.f35062b.equals(v0Var.d)) {
                        w7.h6.f49151b.c("STORAGE_CANCELED");
                        w7.h6.f49151b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35062b);
                return;
        }
    }
}
