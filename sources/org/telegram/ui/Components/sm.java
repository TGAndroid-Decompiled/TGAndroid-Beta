package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f27929a;
    public final un f27930b;
    public final int f27931c;

    public sm(un unVar, int i10, int i11) {
        this.f27929a = i11;
        this.f27930b = unVar;
        this.f27931c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27929a) {
            case 0:
                this.f27930b.e0(this.f27931c, null);
                return;
            case 1:
                this.f27930b.b0(this.f27931c);
                return;
            default:
                this.f27930b.e0(this.f27931c, null);
                return;
        }
    }
}
