package org.telegram.ui.Components;
public final class uh implements Runnable {
    public final int f31166a;
    public final aj f31167b;
    public final boolean f31168c;

    public uh(aj ajVar, boolean z10, int i10) {
        this.f31166a = i10;
        this.f31167b = ajVar;
        this.f31168c = z10;
    }

    @Override
    public final void run() {
        switch (this.f31166a) {
            case 0:
                boolean z10 = this.f31168c;
                aj ajVar = this.f31167b;
                if (!z10) {
                    ajVar.f24343f1.setVisibility(8);
                    return;
                } else {
                    ajVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f31168c;
                aj ajVar2 = this.f31167b;
                if (!z11) {
                    ajVar2.f24394w.setVisibility(8);
                    return;
                } else {
                    ajVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f31168c;
                aj ajVar3 = this.f31167b;
                if (!z12) {
                    ajVar3.f24402y.setVisibility(8);
                    return;
                } else {
                    ajVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f31168c;
                aj ajVar4 = this.f31167b;
                if (z13) {
                    ajVar4.A1.setVisibility(4);
                    return;
                } else {
                    ajVar4.getClass();
                    return;
                }
        }
    }
}
