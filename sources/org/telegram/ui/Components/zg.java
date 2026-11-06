package org.telegram.ui.Components;
public final class zg implements Runnable {
    public final int f40966a;
    public final di f40967b;
    public final boolean f40968c;

    public zg(di diVar, boolean z9, int i7) {
        this.f40966a = i7;
        this.f40967b = diVar;
        this.f40968c = z9;
    }

    @Override
    public final void run() {
        switch (this.f40966a) {
            case 0:
                boolean z9 = this.f40968c;
                di diVar = this.f40967b;
                if (!z9) {
                    diVar.W2.setVisibility(8);
                    return;
                } else {
                    diVar.getClass();
                    return;
                }
            case 1:
                boolean z10 = this.f40968c;
                di diVar2 = this.f40967b;
                if (!z10) {
                    diVar2.f32983s1.setVisibility(8);
                    return;
                } else {
                    diVar2.getClass();
                    return;
                }
            case 2:
                boolean z11 = this.f40968c;
                di diVar3 = this.f40967b;
                if (!z11) {
                    diVar3.f32991u1.setVisibility(8);
                    return;
                } else {
                    diVar3.getClass();
                    return;
                }
            default:
                boolean z12 = this.f40968c;
                di diVar4 = this.f40967b;
                if (z12) {
                    diVar4.f32981r3.setVisibility(4);
                    return;
                } else {
                    diVar4.getClass();
                    return;
                }
        }
    }
}
