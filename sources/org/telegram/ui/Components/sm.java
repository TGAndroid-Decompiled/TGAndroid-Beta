package org.telegram.ui.Components;
public final class sm implements Runnable {
    public final int f27887a;
    public final un f27888b;
    public final int f27889c;

    public sm(un unVar, int i10, int i11) {
        this.f27887a = i11;
        this.f27888b = unVar;
        this.f27889c = i10;
    }

    @Override
    public final void run() {
        switch (this.f27887a) {
            case 0:
                this.f27888b.e0(this.f27889c, null);
                return;
            case 1:
                this.f27888b.b0(this.f27889c);
                return;
            default:
                this.f27888b.e0(this.f27889c, null);
                return;
        }
    }
}
