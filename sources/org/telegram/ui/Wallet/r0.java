package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f34787a;
    public final String f34788b;

    public r0(String str, int i10) {
        this.f34787a = i10;
        this.f34788b = str;
    }

    @Override
    public final void run() {
        switch (this.f34787a) {
            case 0:
                w0 w0Var = w7.h6.f48702b;
                if (w0Var != null) {
                    if (this.f34788b.equals(w0Var.d)) {
                        w7.h6.f48702b.c("STORAGE_CANCELED");
                        w7.h6.f48702b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f34788b);
                return;
        }
    }
}
