package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f38600a;
    public final ui f38601b;
    public final boolean f38602c;

    public ph(ui uiVar, boolean z10, int i7) {
        this.f38600a = i7;
        this.f38601b = uiVar;
        this.f38602c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38600a) {
            case 0:
                boolean z10 = this.f38602c;
                ui uiVar = this.f38601b;
                if (!z10) {
                    uiVar.f40376a3.setVisibility(8);
                    return;
                } else {
                    uiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f38602c;
                ui uiVar2 = this.f38601b;
                if (!z11) {
                    uiVar2.f40447w1.setVisibility(8);
                    return;
                } else {
                    uiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f38602c;
                ui uiVar3 = this.f38601b;
                if (!z12) {
                    uiVar3.f40455y1.setVisibility(8);
                    return;
                } else {
                    uiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f38602c;
                ui uiVar4 = this.f38601b;
                if (z13) {
                    uiVar4.f40445v3.setVisibility(4);
                    return;
                } else {
                    uiVar4.getClass();
                    return;
                }
        }
    }
}
