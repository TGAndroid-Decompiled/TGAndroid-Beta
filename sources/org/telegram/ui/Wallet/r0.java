package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f34800a;
    public final String f34801b;

    public r0(String str, int i10) {
        this.f34800a = i10;
        this.f34801b = str;
    }

    @Override
    public final void run() {
        switch (this.f34800a) {
            case 0:
                w0 w0Var = w7.h6.f48713b;
                if (w0Var != null) {
                    if (this.f34801b.equals(w0Var.d)) {
                        w7.h6.f48713b.c("STORAGE_CANCELED");
                        w7.h6.f48713b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f34801b);
                return;
        }
    }
}
