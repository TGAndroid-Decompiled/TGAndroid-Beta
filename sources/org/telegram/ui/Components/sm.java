package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f27884a;
    public final un f27885b;
    public final int f27886c;

    public sm(un unVar, int i10, int i11) {
        this.f27884a = i11;
        this.f27885b = unVar;
        this.f27886c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27884a) {
            case 0:
                this.f27885b.e0(this.f27886c, null);
                return;
            case 1:
                this.f27885b.b0(this.f27886c);
                return;
            default:
                this.f27885b.e0(this.f27886c, null);
                return;
        }
    }
}
