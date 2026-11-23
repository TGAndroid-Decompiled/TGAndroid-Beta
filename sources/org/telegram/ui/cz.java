package org.telegram.ui;
public final class cz implements Runnable {
    public final int f46913a;
    public final dz f46914b;

    public cz(dz dzVar, int i7) {
        this.f46913a = i7;
        this.f46914b = dzVar;
    }

    @Override
    public final void run() {
        switch (this.f46913a) {
            case 0:
                this.f46914b.d();
                return;
            case 1:
                this.f46914b.a();
                return;
            default:
                dz dzVar = this.f46914b;
                dzVar.b(dzVar.E);
                return;
        }
    }
}
