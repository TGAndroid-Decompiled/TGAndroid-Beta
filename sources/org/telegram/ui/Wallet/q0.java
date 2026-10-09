package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class q0 implements Runnable {
    public final int f35406a;
    public final String f35407b;

    public q0(String str, int i10) {
        this.f35406a = i10;
        this.f35407b = str;
    }

    @Override
    public final void run() {
        switch (this.f35406a) {
            case 0:
                v0 v0Var = w7.f6.f49953b;
                if (v0Var != null) {
                    if (this.f35407b.equals(v0Var.d)) {
                        w7.f6.f49953b.c("STORAGE_CANCELED");
                        w7.f6.f49953b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35407b);
                return;
        }
    }
}
