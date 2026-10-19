package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34086a;
    public final x f34087b;
    public final String f34088c;

    public d1(x xVar, String str, int i10) {
        this.f34086a = i10;
        this.f34087b = xVar;
        this.f34088c = str;
    }

    @Override
    public final void run() {
        switch (this.f34086a) {
            case 0:
                this.f34087b.run(this.f34088c);
                return;
            default:
                this.f34087b.run(this.f34088c);
                return;
        }
    }
}
