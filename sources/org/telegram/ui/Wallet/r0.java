package org.telegram.ui.Wallet;

import org.telegram.messenger.AndroidUtilities;
public final class r0 implements Runnable {
    public final int f35308a;
    public final String f35309b;

    public r0(String str, int i10) {
        this.f35308a = i10;
        this.f35309b = str;
    }

    @Override
    public final void run() {
        switch (this.f35308a) {
            case 0:
                w0 w0Var = w7.e6.f50170b;
                if (w0Var != null) {
                    if (this.f35309b.equals(w0Var.d)) {
                        w7.e6.f50170b.c("STORAGE_CANCELED");
                        w7.e6.f50170b.e();
                        return;
                    }
                    return;
                }
                return;
            default:
                AndroidUtilities.addToClipboard(this.f35309b);
                return;
        }
    }
}
