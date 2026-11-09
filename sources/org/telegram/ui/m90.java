package org.telegram.ui;
public final class m90 implements Runnable {
    public final int f47798a;
    public final r90 f47799b;

    public m90(r90 r90Var, int i7) {
        this.f47798a = i7;
        this.f47799b = r90Var;
    }

    @Override
    public final void run() {
        switch (this.f47798a) {
            case 0:
                this.f47799b.b();
                return;
            default:
                this.f47799b.c();
                return;
        }
    }
}
