package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f35495a;
    public final String f35496b;

    public r0(String str, int i10) {
        this.f35495a = i10;
        this.f35496b = str;
    }

    @Override
    public final void run() {
        switch (this.f35495a) {
            case 0:
                w0 w0Var = w7.f6.f50040b;
                if (w0Var != null) {
                    if (this.f35496b.equals(w0Var.d)) {
                        w7.f6.f50040b.c("STORAGE_CANCELED");
                        w7.f6.f50040b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35496b);
                return;
        }
    }
}
