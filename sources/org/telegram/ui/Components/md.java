package org.telegram.ui.Components;
public final class md implements Runnable {
    public final int f28814a;
    public final od f28815b;
    public final boolean f28816c;

    public md(od odVar, boolean z10, int i10) {
        this.f28814a = i10;
        this.f28815b = odVar;
        this.f28816c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28814a) {
            case 0:
                boolean z10 = this.f28816c;
                od odVar = this.f28815b;
                if (!z10) {
                    odVar.Z0.setVisibility(8);
                    return;
                } else {
                    odVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28816c;
                od odVar2 = this.f28815b;
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
