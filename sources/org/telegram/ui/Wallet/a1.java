package org.telegram.ui.Wallet;

import org.telegram.ui.e51;
public final class a1 implements Runnable {
    public final int f42121a;
    public final e51 f42122b;
    public final String f42123c;

    public a1(e51 e51Var, String str, int i3) {
        this.f42121a = i3;
        this.f42122b = e51Var;
        this.f42123c = str;
    }

    @Override
    public final void run() {
        switch (this.f42121a) {
            case 0:
                this.f42122b.a(this.f42123c);
                return;
            default:
                this.f42122b.a(this.f42123c);
                return;
        }
    }
}
