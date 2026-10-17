package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34108a;
    public final x f34109b;
    public final String f34110c;

    public d1(x xVar, String str, int i10) {
        this.f34108a = i10;
        this.f34109b = xVar;
        this.f34110c = str;
    }

    @Override
    public final void run() {
        switch (this.f34108a) {
            case 0:
                this.f34109b.run(this.f34110c);
                return;
            default:
                this.f34109b.run(this.f34110c);
                return;
        }
    }
}
