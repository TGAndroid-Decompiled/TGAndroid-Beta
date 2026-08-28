package org.telegram.ui.Components;
public final class h80 implements Runnable {
    public final int f28992a;
    public final i80 f28993b;
    public final m80 f28994c;

    public h80(i80 i80Var, m80 m80Var, int i9) {
        this.f28992a = i9;
        this.f28993b = i80Var;
        this.f28994c = m80Var;
    }

    @Override
    public final void run() {
        switch (this.f28992a) {
            case 0:
                this.f28993b.k(this.f28994c, false);
                return;
            default:
                this.f28993b.k(this.f28994c, false);
                return;
        }
    }
}
