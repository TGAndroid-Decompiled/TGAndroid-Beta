package org.telegram.ui;
public final class az implements Runnable {
    public final int f45539a;
    public final bz f45540b;

    public az(bz bzVar, int i7) {
        this.f45539a = i7;
        this.f45540b = bzVar;
    }

    @Override
    public final void run() {
        switch (this.f45539a) {
            case 0:
                this.f45540b.d();
                return;
            case 1:
                this.f45540b.a();
                return;
            default:
                bz bzVar = this.f45540b;
                bzVar.b(bzVar.E);
                return;
        }
    }
}
