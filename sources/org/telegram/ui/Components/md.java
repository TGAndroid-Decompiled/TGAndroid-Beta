package org.telegram.ui.Components;
public final class md implements Runnable {
    public final int f28832a;
    public final od f28833b;
    public final boolean f28834c;

    public md(od odVar, boolean z10, int i10) {
        this.f28832a = i10;
        this.f28833b = odVar;
        this.f28834c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28832a) {
            case 0:
                boolean z10 = this.f28834c;
                od odVar = this.f28833b;
                if (!z10) {
                    odVar.Z0.setVisibility(8);
                    return;
                } else {
                    odVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28834c;
                od odVar2 = this.f28833b;
                if (!z11) {
                    odVar2.V0.setVisibility(8);
                    return;
                } else {
                    odVar2.getClass();
                    return;
                }
        }
    }
}
