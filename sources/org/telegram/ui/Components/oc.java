package org.telegram.ui.Components;
public final class oc implements Runnable {
    public final int f37923a;
    public final pc f37924b;
    public final boolean f37925c;

    public oc(pc pcVar, boolean z10, int i7) {
        this.f37923a = i7;
        this.f37924b = pcVar;
        this.f37925c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37923a) {
            case 0:
                boolean z10 = this.f37925c;
                pc pcVar = this.f37924b;
                if (!z10) {
                    pcVar.Z0.setVisibility(8);
                    return;
                } else {
                    pcVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f37925c;
                pc pcVar2 = this.f37924b;
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
