package org.telegram.ui.Wallet;

import org.telegram.ui.a31;
public final class l1 implements Runnable {
    public final int f44603a;
    public final a31 f44604b;
    public final String f44605c;

    public l1(a31 a31Var, String str, int i7) {
        this.f44603a = i7;
        this.f44604b = a31Var;
        this.f44605c = str;
    }

    @Override
    public final void run() {
        switch (this.f44603a) {
            case 0:
                this.f44604b.a(this.f44605c);
                return;
            default:
                this.f44604b.a(this.f44605c);
                return;
        }
    }
}
