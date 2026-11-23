package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f38599a;
    public final ui f38600b;
    public final boolean f38601c;

    public ph(ui uiVar, boolean z10, int i7) {
        this.f38599a = i7;
        this.f38600b = uiVar;
        this.f38601c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38599a) {
            case 0:
                boolean z10 = this.f38601c;
                ui uiVar = this.f38600b;
                if (!z10) {
                    uiVar.f40369a3.setVisibility(8);
                    return;
                } else {
                    uiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f38601c;
                ui uiVar2 = this.f38600b;
                if (!z11) {
                    uiVar2.f40440w1.setVisibility(8);
                    return;
                } else {
                    uiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f38601c;
                ui uiVar3 = this.f38600b;
                if (!z12) {
                    uiVar3.f40448y1.setVisibility(8);
                    return;
                } else {
                    uiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f38601c;
                ui uiVar4 = this.f38600b;
                if (z13) {
                    uiVar4.f40438v3.setVisibility(4);
                    return;
                } else {
                    uiVar4.getClass();
                    return;
                }
        }
    }
}
