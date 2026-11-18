package org.telegram.ui;
public final class dz implements Runnable {
    public final int f47089a;
    public final ez f47090b;

    public dz(ez ezVar, int i7) {
        this.f47089a = i7;
        this.f47090b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f47089a) {
            case 0:
                this.f47090b.d();
                return;
            case 1:
                this.f47090b.a();
                return;
            default:
                ez ezVar = this.f47090b;
                ezVar.b(ezVar.E);
                return;
        }
    }
}
