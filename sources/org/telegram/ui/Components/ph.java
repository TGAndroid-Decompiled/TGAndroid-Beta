package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f38598a;
    public final ui f38599b;
    public final boolean f38600c;

    public ph(ui uiVar, boolean z10, int i7) {
        this.f38598a = i7;
        this.f38599b = uiVar;
        this.f38600c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38598a) {
            case 0:
                boolean z10 = this.f38600c;
                ui uiVar = this.f38599b;
                if (!z10) {
                    uiVar.f40368a3.setVisibility(8);
                    return;
                } else {
                    uiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f38600c;
                ui uiVar2 = this.f38599b;
                if (!z11) {
                    uiVar2.f40439w1.setVisibility(8);
                    return;
                } else {
                    uiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f38600c;
                ui uiVar3 = this.f38599b;
                if (!z12) {
                    uiVar3.f40447y1.setVisibility(8);
                    return;
                } else {
                    uiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f38600c;
                ui uiVar4 = this.f38599b;
                if (z13) {
                    uiVar4.f40437v3.setVisibility(4);
                    return;
                } else {
                    uiVar4.getClass();
                    return;
                }
        }
    }
}
