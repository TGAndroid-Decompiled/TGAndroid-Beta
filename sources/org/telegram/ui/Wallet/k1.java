package org.telegram.ui.Wallet;

import org.telegram.ui.p51;
public final class k1 implements Runnable {
    public final int f44432a;
    public final p51 f44433b;
    public final String f44434c;

    public k1(p51 p51Var, String str, int i7) {
        this.f44432a = i7;
        this.f44433b = p51Var;
        this.f44434c = str;
    }

    @Override
    public final void run() {
        switch (this.f44432a) {
            case 0:
                this.f44433b.a(this.f44434c);
                return;
            default:
                this.f44433b.a(this.f44434c);
                return;
        }
    }
}
