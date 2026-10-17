package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f34829a;
    public final String f34830b;

    public r0(String str, int i10) {
        this.f34829a = i10;
        this.f34830b = str;
    }

    @Override
    public final void run() {
        switch (this.f34829a) {
            case 0:
                w0 w0Var = w7.h6.f48724b;
                if (w0Var != null) {
                    if (this.f34830b.equals(w0Var.d)) {
                        w7.h6.f48724b.c("STORAGE_CANCELED");
                        w7.h6.f48724b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f34830b);
                return;
        }
    }
}
