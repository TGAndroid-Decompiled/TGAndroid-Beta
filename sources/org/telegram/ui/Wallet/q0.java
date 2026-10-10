package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f35465a;
    public final String f35466b;

    public q0(String str, int i10) {
        this.f35465a = i10;
        this.f35466b = str;
    }

    @Override
    public final void run() {
        switch (this.f35465a) {
            case 0:
                v0 v0Var = w7.f6.f49997b;
                if (v0Var != null) {
                    if (this.f35466b.equals(v0Var.d)) {
                        w7.f6.f49997b.c("STORAGE_CANCELED");
                        w7.f6.f49997b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35466b);
                return;
        }
    }
}
