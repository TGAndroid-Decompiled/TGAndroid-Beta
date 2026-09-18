package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f28193a;
    public final un f28194b;
    public final int f28195c;

    public sm(un unVar, int i10, int i11) {
        this.f28193a = i11;
        this.f28194b = unVar;
        this.f28195c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28193a) {
            case 0:
                this.f28194b.e0(this.f28195c, null);
                return;
            case 1:
                this.f28194b.b0(this.f28195c);
                return;
            default:
                this.f28194b.e0(this.f28195c, null);
                return;
        }
    }
}
