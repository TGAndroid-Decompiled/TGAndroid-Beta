package org.telegram.ui.Components;
public final class xr implements Runnable {
    public final int f30717a;
    public final es f30718b;

    public xr(es esVar, int i10) {
        this.f30717a = i10;
        this.f30718b = esVar;
    }

    @Override
    public final void run() {
        switch (this.f30717a) {
            case 0:
                this.f30718b.W(false);
                return;
            default:
                es.Q(this.f30718b);
                return;
        }
    }
}
