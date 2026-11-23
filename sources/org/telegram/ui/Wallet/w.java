package org.telegram.ui.Wallet;

import org.telegram.messenger.r10;
public final class w implements Runnable {
    public final int f45198a;
    public final r10 f45199b;
    public final Exception f45200c;

    public w(r10 r10Var, Exception exc, int i7) {
        this.f45198a = i7;
        this.f45199b = r10Var;
        this.f45200c = exc;
    }

    @Override
    public final void run() {
        String message;
        String message2;
        switch (this.f45198a) {
            case 0:
                Exception exc = this.f45200c;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                this.f45199b.a(null, message);
                return;
            default:
                Exception exc2 = this.f45200c;
                if (exc2.getMessage() == null) {
                    message2 = "NULL_ERROR";
                } else {
                    message2 = exc2.getMessage();
                }
                this.f45199b.a(null, message2);
                return;
        }
    }
}
