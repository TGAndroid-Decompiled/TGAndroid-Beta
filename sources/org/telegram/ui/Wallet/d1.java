package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34093a;
    public final x f34094b;
    public final String f34095c;

    public d1(x xVar, String str, int i10) {
        this.f34093a = i10;
        this.f34094b = xVar;
        this.f34095c = str;
    }

    @Override
    public final void run() {
        switch (this.f34093a) {
            case 0:
                this.f34094b.run(this.f34095c);
                return;
            default:
                this.f34094b.run(this.f34095c);
                return;
        }
    }
}
