package org.telegram.ui.Components;
public final class zg implements Runnable {
    public final int f40946a;
    public final di f40947b;
    public final boolean f40948c;

    public zg(di diVar, boolean z9, int i7) {
        this.f40946a = i7;
        this.f40947b = diVar;
        this.f40948c = z9;
    }

    @Override
    public final void run() {
        switch (this.f40946a) {
            case 0:
                boolean z9 = this.f40948c;
                di diVar = this.f40947b;
                if (!z9) {
                    diVar.W2.setVisibility(8);
                    return;
                } else {
                    diVar.getClass();
                    return;
                }
            case 1:
                boolean z10 = this.f40948c;
                di diVar2 = this.f40947b;
                if (!z10) {
                    diVar2.f32954s1.setVisibility(8);
                    return;
                } else {
                    diVar2.getClass();
                    return;
                }
            case 2:
                boolean z11 = this.f40948c;
                di diVar3 = this.f40947b;
                if (!z11) {
                    diVar3.f32962u1.setVisibility(8);
                    return;
                } else {
                    diVar3.getClass();
                    return;
                }
            default:
                boolean z12 = this.f40948c;
                di diVar4 = this.f40947b;
                if (z12) {
                    diVar4.f32952r3.setVisibility(4);
                    return;
                } else {
                    diVar4.getClass();
                    return;
                }
        }
    }
}
