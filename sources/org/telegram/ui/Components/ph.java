package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f29639a;
    public final xi f29640b;
    public final boolean f29641c;

    public ph(xi xiVar, boolean z10, int i10) {
        this.f29639a = i10;
        this.f29640b = xiVar;
        this.f29641c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29639a) {
            case 0:
                boolean z10 = this.f29641c;
                xi xiVar = this.f29640b;
                if (!z10) {
                    xiVar.f32803c1.setVisibility(8);
                    return;
                } else {
                    xiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29641c;
                xi xiVar2 = this.f29640b;
                if (!z11) {
                    xiVar2.f32865w.setVisibility(8);
                    return;
                } else {
                    xiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29641c;
                xi xiVar3 = this.f29640b;
                if (!z12) {
                    xiVar3.f32873y.setVisibility(8);
                    return;
                } else {
                    xiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29641c;
                xi xiVar4 = this.f29640b;
                if (z13) {
                    xiVar4.f32871x1.setVisibility(4);
                    return;
                } else {
                    xiVar4.getClass();
                    return;
                }
        }
    }
}
