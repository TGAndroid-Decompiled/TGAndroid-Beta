package org.telegram.ui.Components;
public final class wg implements Runnable {
    public final int f32171a;
    public final bi f32172b;
    public final boolean f32173c;

    public wg(bi biVar, boolean z10, int i10) {
        this.f32171a = i10;
        this.f32172b = biVar;
        this.f32173c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32171a) {
            case 0:
                boolean z10 = this.f32173c;
                bi biVar = this.f32172b;
                if (!z10) {
                    biVar.W2.setVisibility(8);
                    return;
                } else {
                    biVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f32173c;
                bi biVar2 = this.f32172b;
                if (!z11) {
                    biVar2.f24720s1.setVisibility(8);
                    return;
                } else {
                    biVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f32173c;
                bi biVar3 = this.f32172b;
                if (!z12) {
                    biVar3.f24728u1.setVisibility(8);
                    return;
                } else {
                    biVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f32173c;
                bi biVar4 = this.f32172b;
                if (z13) {
                    biVar4.f24718r3.setVisibility(4);
                    return;
                } else {
                    biVar4.getClass();
                    return;
                }
        }
    }
}
