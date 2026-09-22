package org.telegram.ui.Components;
public final class i11 implements Runnable {
    public final int f24943a;
    public final l11 f24944b;
    public final k11 f24945c;

    public i11(l11 l11Var, k11 k11Var, int i10) {
        this.f24943a = i10;
        this.f24944b = l11Var;
        this.f24945c = k11Var;
    }

    @Override
    public final void run() {
        switch (this.f24943a) {
            case 0:
                this.f24944b.b(this.f24945c);
                return;
            case 1:
                this.f24944b.b(this.f24945c);
                return;
            default:
                this.f24944b.b(this.f24945c);
                return;
        }
    }
}
