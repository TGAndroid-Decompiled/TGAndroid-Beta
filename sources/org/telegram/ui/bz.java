package org.telegram.ui;
public final class bz implements Runnable {
    public final int f44163a;
    public final cz f44164b;

    public bz(cz czVar, int i7) {
        this.f44163a = i7;
        this.f44164b = czVar;
    }

    @Override
    public final void run() {
        switch (this.f44163a) {
            case 0:
                this.f44164b.d();
                return;
            case 1:
                this.f44164b.a();
                return;
            default:
                cz czVar = this.f44164b;
                czVar.b(czVar.D);
                return;
        }
    }
}
