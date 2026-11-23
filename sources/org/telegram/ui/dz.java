package org.telegram.ui;
public final class dz implements Runnable {
    public final int f47053a;
    public final ez f47054b;

    public dz(ez ezVar, int i7) {
        this.f47053a = i7;
        this.f47054b = ezVar;
    }

    @Override
    public final void run() {
        switch (this.f47053a) {
            case 0:
                this.f47054b.d();
                return;
            case 1:
                this.f47054b.a();
                return;
            default:
                ez ezVar = this.f47054b;
                ezVar.b(ezVar.E);
                return;
        }
    }
}
