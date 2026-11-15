package org.telegram.ui.Components;
public final class oc implements Runnable {
    public final int f37921a;
    public final pc f37922b;
    public final boolean f37923c;

    public oc(pc pcVar, boolean z10, int i7) {
        this.f37921a = i7;
        this.f37922b = pcVar;
        this.f37923c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37921a) {
            case 0:
                boolean z10 = this.f37923c;
                pc pcVar = this.f37922b;
                if (!z10) {
                    pcVar.Z0.setVisibility(8);
                    return;
                } else {
                    pcVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f37923c;
                pc pcVar2 = this.f37922b;
                if (!z11) {
                    pcVar2.V0.setVisibility(8);
                    return;
                } else {
                    pcVar2.getClass();
                    return;
                }
        }
    }
}
