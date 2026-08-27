package org.telegram.ui.Components;

public final class wc implements Runnable {

    public final int f34155a;

    public final xc f34156b;

    public final boolean f34157c;

    public wc(xc xcVar, boolean z10, int i10) {
        this.f34155a = i10;
        this.f34156b = xcVar;
        this.f34157c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34155a) {
            case 0:
                boolean z10 = this.f34157c;
                xc xcVar = this.f34156b;
                if (!z10) {
                    xcVar.V0.setVisibility(8);
                } else {
                    xcVar.getClass();
                }
                break;
            default:
                boolean z11 = this.f34157c;
                xc xcVar2 = this.f34156b;
                if (!z11) {
                    xcVar2.R0.setVisibility(8);
                } else {
                    xcVar2.getClass();
                }
                break;
        }
    }
}
