package org.telegram.ui.Components;
public final class h11 implements Runnable {
    public final int f24657a;
    public final k11 f24658b;
    public final j11 f24659c;

    public h11(k11 k11Var, j11 j11Var, int i10) {
        this.f24657a = i10;
        this.f24658b = k11Var;
        this.f24659c = j11Var;
    }

    @Override
    public final void run() {
        switch (this.f24657a) {
            case 0:
                this.f24658b.b(this.f24659c);
                return;
            case 1:
                this.f24658b.b(this.f24659c);
                return;
            default:
                this.f24658b.b(this.f24659c);
                return;
        }
    }
}
