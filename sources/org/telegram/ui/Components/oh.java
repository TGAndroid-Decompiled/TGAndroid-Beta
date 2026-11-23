package org.telegram.ui.Components;
public final class oh implements Runnable {
    public final int f38157a;
    public final ti f38158b;
    public final boolean f38159c;

    public oh(ti tiVar, boolean z10, int i7) {
        this.f38157a = i7;
        this.f38158b = tiVar;
        this.f38159c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38157a) {
            case 0:
                boolean z10 = this.f38159c;
                ti tiVar = this.f38158b;
                if (!z10) {
                    tiVar.f39957a3.setVisibility(8);
                    return;
                } else {
                    tiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f38159c;
                ti tiVar2 = this.f38158b;
                if (!z11) {
                    tiVar2.f40028w1.setVisibility(8);
                    return;
                } else {
                    tiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f38159c;
                ti tiVar3 = this.f38158b;
                if (!z12) {
                    tiVar3.f40036y1.setVisibility(8);
                    return;
                } else {
                    tiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f38159c;
                ti tiVar4 = this.f38158b;
                if (z13) {
                    tiVar4.f40026v3.setVisibility(4);
                    return;
                } else {
                    tiVar4.getClass();
                    return;
                }
        }
    }
}
