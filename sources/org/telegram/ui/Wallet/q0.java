package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f35063a;
    public final String f35064b;

    public q0(String str, int i10) {
        this.f35063a = i10;
        this.f35064b = str;
    }

    @Override
    public final void run() {
        switch (this.f35063a) {
            case 0:
                v0 v0Var = w7.h6.f49150b;
                if (v0Var != null) {
                    if (this.f35064b.equals(v0Var.d)) {
                        w7.h6.f49150b.c("STORAGE_CANCELED");
                        w7.h6.f49150b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35064b);
                return;
        }
    }
}
