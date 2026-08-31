package org.telegram.ui.Components;
public final class ad implements Runnable {
    public final int f25223a;
    public final bd f25224b;
    public final boolean f25225c;

    public ad(bd bdVar, boolean z4, int i10) {
        this.f25223a = i10;
        this.f25224b = bdVar;
        this.f25225c = z4;
    }

    @Override
    public final void run() {
        switch (this.f25223a) {
            case 0:
                boolean z4 = this.f25225c;
                bd bdVar = this.f25224b;
                if (!z4) {
                    bdVar.W0.setVisibility(8);
                    return;
                } else {
                    bdVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f25225c;
                bd bdVar2 = this.f25224b;
                if (!z10) {
                    bdVar2.S0.setVisibility(8);
                    return;
                } else {
                    bdVar2.getClass();
                    return;
                }
        }
    }
}
