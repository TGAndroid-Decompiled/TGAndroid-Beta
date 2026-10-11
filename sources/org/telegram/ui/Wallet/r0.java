package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f35529a;
    public final String f35530b;

    public r0(String str, int i10) {
        this.f35529a = i10;
        this.f35530b = str;
    }

    @Override
    public final void run() {
        switch (this.f35529a) {
            case 0:
                w0 w0Var = w7.f6.f50074b;
                if (w0Var != null) {
                    if (this.f35530b.equals(w0Var.d)) {
                        w7.f6.f50074b.c("STORAGE_CANCELED");
                        w7.f6.f50074b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35530b);
                return;
        }
    }
}
