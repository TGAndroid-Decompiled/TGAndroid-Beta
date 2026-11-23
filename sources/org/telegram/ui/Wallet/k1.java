package org.telegram.ui.Wallet;

import org.telegram.ui.p51;
public final class k1 implements Runnable {
    public final int f44476a;
    public final p51 f44477b;
    public final String f44478c;

    public k1(p51 p51Var, String str, int i7) {
        this.f44476a = i7;
        this.f44477b = p51Var;
        this.f44478c = str;
    }

    @Override
    public final void run() {
        switch (this.f44476a) {
            case 0:
                this.f44477b.a(this.f44478c);
                return;
            default:
                this.f44477b.a(this.f44478c);
                return;
        }
    }
}
