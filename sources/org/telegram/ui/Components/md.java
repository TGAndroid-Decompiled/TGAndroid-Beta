package org.telegram.ui.Components;
public final class md implements Runnable {
    public final int f28657a;
    public final od f28658b;
    public final boolean f28659c;

    public md(od odVar, boolean z10, int i10) {
        this.f28657a = i10;
        this.f28658b = odVar;
        this.f28659c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28657a) {
            case 0:
                boolean z10 = this.f28659c;
                od odVar = this.f28658b;
                if (!z10) {
                    odVar.Z0.setVisibility(8);
                    return;
                } else {
                    odVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28659c;
                od odVar2 = this.f28658b;
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
