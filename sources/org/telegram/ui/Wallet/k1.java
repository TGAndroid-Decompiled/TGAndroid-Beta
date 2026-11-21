package org.telegram.ui.Wallet;

import org.telegram.ui.p51;
public final class k1 implements Runnable {
    public final int f44472a;
    public final p51 f44473b;
    public final String f44474c;

    public k1(p51 p51Var, String str, int i7) {
        this.f44472a = i7;
        this.f44473b = p51Var;
        this.f44474c = str;
    }

    @Override
    public final void run() {
        switch (this.f44472a) {
            case 0:
                this.f44473b.a(this.f44474c);
                return;
            default:
                this.f44473b.a(this.f44474c);
                return;
        }
    }
}
