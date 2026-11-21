package org.telegram.ui;
public final class dz implements Runnable {
    public final int f47078a;
    public final ez f47079b;

    public dz(ez ezVar, int i7) {
        this.f47078a = i7;
        this.f47079b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f47078a) {
            case 0:
                this.f47079b.d();
                return;
            case 1:
                this.f47079b.a();
                return;
            default:
                ez ezVar = this.f47079b;
                ezVar.b(ezVar.E);
                return;
        }
    }
}
