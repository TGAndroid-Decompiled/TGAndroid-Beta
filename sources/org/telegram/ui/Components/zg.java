package org.telegram.ui.Components;
public final class zg implements Runnable {
    public final int f40979a;
    public final di f40980b;
    public final boolean f40981c;

    public zg(di diVar, boolean z9, int i7) {
        this.f40979a = i7;
        this.f40980b = diVar;
        this.f40981c = z9;
    }

    @Override
    public final void run() {
        switch (this.f40979a) {
            case 0:
                boolean z9 = this.f40981c;
                di diVar = this.f40980b;
                if (!z9) {
                    diVar.W2.setVisibility(8);
                    return;
                } else {
                    diVar.getClass();
                    return;
                }
            case 1:
                boolean z10 = this.f40981c;
                di diVar2 = this.f40980b;
                if (!z10) {
                    diVar2.f33046s1.setVisibility(8);
                    return;
                } else {
                    diVar2.getClass();
                    return;
                }
            case 2:
                boolean z11 = this.f40981c;
                di diVar3 = this.f40980b;
                if (!z11) {
                    diVar3.f33054u1.setVisibility(8);
                    return;
                } else {
                    diVar3.getClass();
                    return;
                }
            default:
                boolean z12 = this.f40981c;
                di diVar4 = this.f40980b;
                if (z12) {
                    diVar4.f33044r3.setVisibility(4);
                    return;
                } else {
                    diVar4.getClass();
                    return;
                }
        }
    }
}
