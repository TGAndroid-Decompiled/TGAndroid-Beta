package org.telegram.ui;
public final class dz implements Runnable {
    public final int f47012a;
    public final ez f47013b;

    public dz(ez ezVar, int i7) {
        this.f47012a = i7;
        this.f47013b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f47012a) {
            case 0:
                this.f47013b.d();
                return;
            case 1:
                this.f47013b.a();
                return;
            default:
                ez ezVar = this.f47013b;
                ezVar.b(ezVar.E);
                return;
        }
    }
}
