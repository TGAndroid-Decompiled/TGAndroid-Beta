package org.telegram.ui.Components;
public final class vm implements Runnable {
    public final int f29139a;
    public final xn f29140b;
    public final int f29141c;

    public vm(xn xnVar, int i10, int i11) {
        this.f29139a = i11;
        this.f29140b = xnVar;
        this.f29141c = i10;
    }

    @Override
    public final void run() {
        switch (this.f29139a) {
            case 0:
                this.f29140b.e0(this.f29141c, null);
                return;
            case 1:
                this.f29140b.b0(this.f29141c);
                return;
            default:
                this.f29140b.e0(this.f29141c, null);
                return;
        }
    }
}
