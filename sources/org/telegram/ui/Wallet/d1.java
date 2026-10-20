package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34092a;
    public final x f34093b;
    public final String f34094c;

    public d1(x xVar, String str, int i10) {
        this.f34092a = i10;
        this.f34093b = xVar;
        this.f34094c = str;
    }

    @Override
    public final void run() {
        switch (this.f34092a) {
            case 0:
                this.f34093b.run(this.f34094c);
                return;
            default:
                this.f34093b.run(this.f34094c);
                return;
        }
    }
}
