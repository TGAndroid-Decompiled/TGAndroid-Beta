package org.telegram.ui.Wallet;

import org.telegram.ui.d01;
public final class c1 implements Runnable {
    public final int f34308a;
    public final d01 f34309b;
    public final String f34310c;

    public c1(d01 d01Var, String str, int i10) {
        this.f34308a = i10;
        this.f34309b = d01Var;
        this.f34310c = str;
    }

    @Override
    public final void run() {
        switch (this.f34308a) {
            case 0:
                this.f34309b.a(this.f34310c);
                return;
            default:
                this.f34309b.a(this.f34310c);
                return;
        }
    }
}
