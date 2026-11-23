package org.telegram.ui;
public final class dz implements Runnable {
    public final int f47081a;
    public final ez f47082b;

    public dz(ez ezVar, int i7) {
        this.f47081a = i7;
        this.f47082b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f47081a) {
            case 0:
                this.f47082b.d();
                return;
            case 1:
                this.f47082b.a();
                return;
            default:
                ez ezVar = this.f47082b;
                ezVar.b(ezVar.E);
                return;
        }
    }
}
