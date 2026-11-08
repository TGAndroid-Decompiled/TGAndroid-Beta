package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f38329a;
    public final uc f38330b;
    public final boolean f38331c;

    public tc(uc ucVar, boolean z9, int i7) {
        this.f38329a = i7;
        this.f38330b = ucVar;
        this.f38331c = z9;
    }

    @Override
    public final void run() {
        switch (this.f38329a) {
            case 0:
                boolean z9 = this.f38331c;
                uc ucVar = this.f38330b;
                if (!z9) {
                    ucVar.Y0.setVisibility(8);
                    return;
                } else {
                    ucVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f38331c;
                uc ucVar2 = this.f38330b;
                if (!z10) {
                    ucVar2.U0.setVisibility(8);
                    return;
                } else {
                    ucVar2.getClass();
                    return;
                }
        }
    }
}
