package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f35306a;
    public final String f35307b;

    public r0(String str, int i10) {
        this.f35306a = i10;
        this.f35307b = str;
    }

    @Override
    public final void run() {
        switch (this.f35306a) {
            case 0:
                w0 w0Var = w7.e6.f50162b;
                if (w0Var != null) {
                    if (this.f35307b.equals(w0Var.d)) {
                        w7.e6.f50162b.c("STORAGE_CANCELED");
                        w7.e6.f50162b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35307b);
                return;
        }
    }
}
