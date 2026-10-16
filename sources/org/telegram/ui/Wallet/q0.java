package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f33361a;
    public final String f33362b;

    public q0(String str, int i10) {
        this.f33361a = i10;
        this.f33362b = str;
    }

    @Override
    public final void run() {
        switch (this.f33361a) {
            case 0:
                v0 v0Var = w7.h6.f47317b;
                if (v0Var != null) {
                    if (this.f33362b.equals(v0Var.d)) {
                        w7.h6.f47317b.c("STORAGE_CANCELED");
                        w7.h6.f47317b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f33362b);
                return;
        }
    }
}
