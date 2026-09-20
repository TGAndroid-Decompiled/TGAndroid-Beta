package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f28159a;
    public final un f28160b;
    public final int f28161c;

    public sm(un unVar, int i10, int i11) {
        this.f28159a = i11;
        this.f28160b = unVar;
        this.f28161c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28159a) {
            case 0:
                this.f28160b.e0(this.f28161c, null);
                return;
            case 1:
                this.f28160b.b0(this.f28161c);
                return;
            default:
                this.f28160b.e0(this.f28161c, null);
                return;
        }
    }
}
