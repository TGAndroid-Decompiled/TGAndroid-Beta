package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f34789a;
    public final String f34790b;

    public r0(String str, int i10) {
        this.f34789a = i10;
        this.f34790b = str;
    }

    @Override
    public final void run() {
        switch (this.f34789a) {
            case 0:
                w0 w0Var = w7.h6.f48704b;
                if (w0Var != null) {
                    if (this.f34790b.equals(w0Var.d)) {
                        w7.h6.f48704b.c("STORAGE_CANCELED");
                        w7.h6.f48704b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f34790b);
                return;
        }
    }
}
