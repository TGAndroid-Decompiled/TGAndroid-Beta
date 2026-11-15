package org.telegram.ui;
public final class az implements Runnable {
    public final int f45545a;
    public final bz f45546b;

    public az(bz bzVar, int i7) {
        this.f45545a = i7;
        this.f45546b = bzVar;
    }

    @Override
    public final void run() {
        switch (this.f45545a) {
            case 0:
                this.f45546b.d();
                return;
            case 1:
                this.f45546b.a();
                return;
            default:
                bz bzVar = this.f45546b;
                bzVar.b(bzVar.E);
                return;
        }
    }
}
