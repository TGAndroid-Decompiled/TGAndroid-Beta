package org.telegram.ui.Components;
public final class h11 implements Runnable {
    public final int f24658a;
    public final k11 f24659b;
    public final j11 f24660c;

    public h11(k11 k11Var, j11 j11Var, int i10) {
        this.f24658a = i10;
        this.f24659b = k11Var;
        this.f24660c = j11Var;
    }

    @Override
    public final void run() {
        switch (this.f24658a) {
            case 0:
                this.f24659b.b(this.f24660c);
                return;
            case 1:
                this.f24659b.b(this.f24660c);
                return;
            default:
                this.f24659b.b(this.f24660c);
                return;
        }
    }
}
