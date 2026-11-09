package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f38346a;
    public final uc f38347b;
    public final boolean f38348c;

    public tc(uc ucVar, boolean z9, int i7) {
        this.f38346a = i7;
        this.f38347b = ucVar;
        this.f38348c = z9;
    }

    @Override
    public final void run() {
        switch (this.f38346a) {
            case 0:
                boolean z9 = this.f38348c;
                uc ucVar = this.f38347b;
                if (!z9) {
                    ucVar.Y0.setVisibility(8);
                    return;
                } else {
                    ucVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f38348c;
                uc ucVar2 = this.f38347b;
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
