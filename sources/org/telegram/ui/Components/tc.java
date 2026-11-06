package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f38301a;
    public final uc f38302b;
    public final boolean f38303c;

    public tc(uc ucVar, boolean z9, int i7) {
        this.f38301a = i7;
        this.f38302b = ucVar;
        this.f38303c = z9;
    }

    @Override
    public final void run() {
        switch (this.f38301a) {
            case 0:
                boolean z9 = this.f38303c;
                uc ucVar = this.f38302b;
                if (!z9) {
                    ucVar.Y0.setVisibility(8);
                    return;
                } else {
                    ucVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f38303c;
                uc ucVar2 = this.f38302b;
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
