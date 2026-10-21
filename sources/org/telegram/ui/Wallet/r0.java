package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f34796a;
    public final String f34797b;

    public r0(String str, int i10) {
        this.f34796a = i10;
        this.f34797b = str;
    }

    @Override
    public final void run() {
        switch (this.f34796a) {
            case 0:
                w0 w0Var = w7.h6.f48709b;
                if (w0Var != null) {
                    if (this.f34797b.equals(w0Var.d)) {
                        w7.h6.f48709b.c("STORAGE_CANCELED");
                        w7.h6.f48709b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f34797b);
                return;
        }
    }
}
