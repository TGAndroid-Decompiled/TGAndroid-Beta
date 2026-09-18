package org.telegram.ui.Components;
public final class h11 implements Runnable {
    public final int f24526a;
    public final k11 f24527b;
    public final j11 f24528c;

    public h11(k11 k11Var, j11 j11Var, int i10) {
        this.f24526a = i10;
        this.f24527b = k11Var;
        this.f24528c = j11Var;
    }

    @Override
    public final void run() {
        switch (this.f24526a) {
            case 0:
                this.f24527b.b(this.f24528c);
                return;
            case 1:
                this.f24527b.b(this.f24528c);
                return;
            default:
                this.f24527b.b(this.f24528c);
                return;
        }
    }
}
