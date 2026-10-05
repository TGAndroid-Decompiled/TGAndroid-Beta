package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f29737a;
    public final xi f29738b;
    public final boolean f29739c;

    public ph(xi xiVar, boolean z10, int i10) {
        this.f29737a = i10;
        this.f29738b = xiVar;
        this.f29739c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29737a) {
            case 0:
                boolean z10 = this.f29739c;
                xi xiVar = this.f29738b;
                if (!z10) {
                    xiVar.f32900c1.setVisibility(8);
                    return;
                } else {
                    xiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29739c;
                xi xiVar2 = this.f29738b;
                if (!z11) {
                    xiVar2.f32962w.setVisibility(8);
                    return;
                } else {
                    xiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29739c;
                xi xiVar3 = this.f29738b;
                if (!z12) {
                    xiVar3.f32970y.setVisibility(8);
                    return;
                } else {
                    xiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29739c;
                xi xiVar4 = this.f29738b;
                if (z13) {
                    xiVar4.f32968x1.setVisibility(4);
                    return;
                } else {
                    xiVar4.getClass();
                    return;
                }
        }
    }
}
