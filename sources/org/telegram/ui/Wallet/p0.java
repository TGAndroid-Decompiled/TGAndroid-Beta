package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f33587a;
    public final String f33588b;

    public p0(String str, int i10) {
        this.f33587a = i10;
        this.f33588b = str;
    }

    @Override
    public final void run() {
        switch (this.f33587a) {
            case 0:
                u0 u0Var = w7.i6.f47327b;
                if (u0Var != null) {
                    if (this.f33588b.equals(u0Var.d)) {
                        w7.i6.f47327b.c("STORAGE_CANCELED");
                        w7.i6.f47327b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f33588b);
                return;
        }
    }
}
