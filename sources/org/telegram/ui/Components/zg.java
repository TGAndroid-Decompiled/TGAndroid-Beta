package org.telegram.ui.Components;
public final class zg implements Runnable {
    public final int f40921a;
    public final di f40922b;
    public final boolean f40923c;

    public zg(di diVar, boolean z9, int i7) {
        this.f40921a = i7;
        this.f40922b = diVar;
        this.f40923c = z9;
    }

    @Override
    public final void run() {
        switch (this.f40921a) {
            case 0:
                boolean z9 = this.f40923c;
                di diVar = this.f40922b;
                if (!z9) {
                    diVar.W2.setVisibility(8);
                    return;
                } else {
                    diVar.getClass();
                    return;
                }
            case 1:
                boolean z10 = this.f40923c;
                di diVar2 = this.f40922b;
                if (!z10) {
                    diVar2.f32941s1.setVisibility(8);
                    return;
                } else {
                    diVar2.getClass();
                    return;
                }
            case 2:
                boolean z11 = this.f40923c;
                di diVar3 = this.f40922b;
                if (!z11) {
                    diVar3.f32949u1.setVisibility(8);
                    return;
                } else {
                    diVar3.getClass();
                    return;
                }
            default:
                boolean z12 = this.f40923c;
                di diVar4 = this.f40922b;
                if (z12) {
                    diVar4.f32939r3.setVisibility(4);
                    return;
                } else {
                    diVar4.getClass();
                    return;
                }
        }
    }
}
