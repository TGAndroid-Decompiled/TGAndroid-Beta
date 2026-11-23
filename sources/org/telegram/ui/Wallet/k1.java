package org.telegram.ui.Wallet;

import org.telegram.ui.p51;
public final class k1 implements Runnable {
    public final int f44442a;
    public final p51 f44443b;
    public final String f44444c;

    public k1(p51 p51Var, String str, int i7) {
        this.f44442a = i7;
        this.f44443b = p51Var;
        this.f44444c = str;
    }

    @Override
    public final void run() {
        switch (this.f44442a) {
            case 0:
                this.f44443b.a(this.f44444c);
                return;
            default:
                this.f44443b.a(this.f44444c);
                return;
        }
    }
}
