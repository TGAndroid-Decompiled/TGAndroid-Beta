package org.telegram.ui.Wallet;
public final class d1 implements Runnable {
    public final int f34097a;
    public final x f34098b;
    public final String f34099c;

    public d1(x xVar, String str, int i10) {
        this.f34097a = i10;
        this.f34098b = xVar;
        this.f34099c = str;
    }

    @Override
    public final void run() {
        switch (this.f34097a) {
            case 0:
                this.f34098b.run(this.f34099c);
                return;
            default:
                this.f34098b.run(this.f34099c);
                return;
        }
    }
}
