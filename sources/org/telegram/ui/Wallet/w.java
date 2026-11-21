package org.telegram.ui.Wallet;

import org.telegram.messenger.q10;
public final class w implements Runnable {
    public final int f45229a;
    public final q10 f45230b;
    public final Exception f45231c;

    public w(q10 q10Var, Exception exc, int i7) {
        this.f45229a = i7;
        this.f45230b = q10Var;
        this.f45231c = exc;
    }

    @Override
    public final void run() {
        String message;
        String message2;
        switch (this.f45229a) {
            case 0:
                Exception exc = this.f45231c;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                this.f45230b.a(null, message);
                return;
            default:
                Exception exc2 = this.f45231c;
                if (exc2.getMessage() == null) {
                    message2 = "NULL_ERROR";
                } else {
                    message2 = exc2.getMessage();
                }
                this.f45230b.a(null, message2);
                return;
        }
    }
}
