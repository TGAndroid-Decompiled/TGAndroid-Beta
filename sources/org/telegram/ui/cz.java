package org.telegram.ui;
public final class cz implements Runnable {
    public final int f44846a;
    public final dz f44847b;

    public cz(dz dzVar, int i7) {
        this.f44846a = i7;
        this.f44847b = dzVar;
    }

    @Override
    public final void run() {
        switch (this.f44846a) {
            case 0:
                this.f44847b.d();
                return;
            case 1:
                this.f44847b.a();
                return;
            default:
                dz dzVar = this.f44847b;
                dzVar.b(dzVar.D);
                return;
        }
    }
}
