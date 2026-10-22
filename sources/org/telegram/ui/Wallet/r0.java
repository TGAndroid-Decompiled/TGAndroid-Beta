package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f34799a;
    public final String f34800b;

    public r0(String str, int i10) {
        this.f34799a = i10;
        this.f34800b = str;
    }

    @Override
    public final void run() {
        switch (this.f34799a) {
            case 0:
                w0 w0Var = w7.h6.f48712b;
                if (w0Var != null) {
                    if (this.f34800b.equals(w0Var.d)) {
                        w7.h6.f48712b.c("STORAGE_CANCELED");
                        w7.h6.f48712b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f34800b);
                return;
        }
    }
}
