package org.telegram.ui.Wallet;

import org.telegram.messenger.p10;
public final class x implements Runnable {
    public final int f45360a;
    public final p10 f45361b;
    public final Exception f45362c;

    public x(p10 p10Var, Exception exc, int i7) {
        this.f45360a = i7;
        this.f45361b = p10Var;
        this.f45362c = exc;
    }

    @Override
    public final void run() {
        String message;
        String message2;
        switch (this.f45360a) {
            case 0:
                Exception exc = this.f45362c;
                if (exc.getMessage() == null) {
                    message = "NULL_ERROR";
                } else {
                    message = exc.getMessage();
                }
                this.f45361b.a(null, message);
                return;
            default:
                Exception exc2 = this.f45362c;
                if (exc2.getMessage() == null) {
                    message2 = "NULL_ERROR";
                } else {
                    message2 = exc2.getMessage();
                }
                this.f45361b.a(null, message2);
                return;
        }
    }
}
