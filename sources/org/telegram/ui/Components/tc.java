package org.telegram.ui.Components;
public final class tc implements Runnable {
    public final int f38312a;
    public final uc f38313b;
    public final boolean f38314c;

    public tc(uc ucVar, boolean z9, int i7) {
        this.f38312a = i7;
        this.f38313b = ucVar;
        this.f38314c = z9;
    }

    @Override
    public final void run() {
        switch (this.f38312a) {
            case 0:
                boolean z9 = this.f38314c;
                uc ucVar = this.f38313b;
                if (!z9) {
                    ucVar.Y0.setVisibility(8);
                    return;
                } else {
                    ucVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f38314c;
                uc ucVar2 = this.f38313b;
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
