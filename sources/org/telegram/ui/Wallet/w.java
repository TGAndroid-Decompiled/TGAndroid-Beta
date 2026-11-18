package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
public final class w implements Runnable {
    public final int f45188a;
    public final q10 f45189b;
    public final Exception f45190c;

    public w(q10 q10Var, Exception exc, int i7) {
        this.f45188a = i7;
        this.f45189b = q10Var;
        this.f45190c = exc;
    }

    @Override
    public final void run() {
        String message;
        String message2;
        switch (this.f45188a) {
            case 0:
                Exception exc = this.f45190c;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                this.f45189b.a(null, message);
                return;
            default:
                Exception exc2 = this.f45190c;
                if (exc2.getMessage() == null) {
                    message2 = "NULL_ERROR";
                } else {
                    message2 = exc2.getMessage();
                }
                this.f45189b.a(null, message2);
                return;
        }
    }
}
