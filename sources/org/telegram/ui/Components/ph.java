package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f38555a;
    public final ui f38556b;
    public final boolean f38557c;

    public ph(ui uiVar, boolean z10, int i7) {
        this.f38555a = i7;
        this.f38556b = uiVar;
        this.f38557c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38555a) {
            case 0:
                boolean z10 = this.f38557c;
                ui uiVar = this.f38556b;
                if (!z10) {
                    uiVar.f40353a3.setVisibility(8);
                    return;
                } else {
                    uiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f38557c;
                ui uiVar2 = this.f38556b;
                if (!z11) {
                    uiVar2.f40424w1.setVisibility(8);
                    return;
                } else {
                    uiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f38557c;
                ui uiVar3 = this.f38556b;
                if (!z12) {
                    uiVar3.f40432y1.setVisibility(8);
                    return;
                } else {
                    uiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f38557c;
                ui uiVar4 = this.f38556b;
                if (z13) {
                    uiVar4.f40422v3.setVisibility(4);
                    return;
                } else {
                    uiVar4.getClass();
                    return;
                }
        }
    }
}
