package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f34819a;
    public final String f34820b;

    public r0(String str, int i10) {
        this.f34819a = i10;
        this.f34820b = str;
    }

    @Override
    public final void run() {
        switch (this.f34819a) {
            case 0:
                w0 w0Var = w7.h6.f48749b;
                if (w0Var != null) {
                    if (this.f34820b.equals(w0Var.d)) {
                        w7.h6.f48749b.c("STORAGE_CANCELED");
                        w7.h6.f48749b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f34820b);
                return;
        }
    }
}
