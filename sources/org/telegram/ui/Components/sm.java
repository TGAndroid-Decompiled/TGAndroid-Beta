package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f39785a;
    public final rn f39786b;
    public final int f39787c;

    public sm(rn rnVar, int i7, int i10) {
        this.f39785a = i10;
        this.f39786b = rnVar;
        this.f39787c = i7;
    }

    @Override
    public final void run() {
        switch (this.f39785a) {
            case 0:
                this.f39786b.j0(this.f39787c, null);
                return;
            case 1:
                this.f39786b.g0(this.f39787c);
                return;
            default:
                this.f39786b.j0(this.f39787c, null);
                return;
        }
    }
}
