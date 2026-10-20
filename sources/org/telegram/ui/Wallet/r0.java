package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f34795a;
    public final String f34796b;

    public r0(String str, int i10) {
        this.f34795a = i10;
        this.f34796b = str;
    }

    @Override
    public final void run() {
        switch (this.f34795a) {
            case 0:
                w0 w0Var = w7.h6.f48709b;
                if (w0Var != null) {
                    if (this.f34796b.equals(w0Var.d)) {
                        w7.h6.f48709b.c("STORAGE_CANCELED");
                        w7.h6.f48709b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f34796b);
                return;
        }
    }
}
