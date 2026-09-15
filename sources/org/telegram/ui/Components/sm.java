package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f27932a;
    public final un f27933b;
    public final int f27934c;

    public sm(un unVar, int i10, int i11) {
        this.f27932a = i11;
        this.f27933b = unVar;
        this.f27934c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27932a) {
            case 0:
                this.f27933b.e0(this.f27934c, null);
                return;
            case 1:
                this.f27933b.b0(this.f27934c);
                return;
            default:
                this.f27933b.e0(this.f27934c, null);
                return;
        }
    }
}
