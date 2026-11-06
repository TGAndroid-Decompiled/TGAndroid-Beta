package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f38321a;
    public final uc f38322b;
    public final boolean f38323c;

    public tc(uc ucVar, boolean z9, int i7) {
        this.f38321a = i7;
        this.f38322b = ucVar;
        this.f38323c = z9;
    }

    @Override
    public final void run() {
        switch (this.f38321a) {
            case 0:
                boolean z9 = this.f38323c;
                uc ucVar = this.f38322b;
                if (!z9) {
                    ucVar.Y0.setVisibility(8);
                    return;
                } else {
                    ucVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f38323c;
                uc ucVar2 = this.f38322b;
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
