package org.telegram.ui.Components;
public final class wg implements Runnable {
    public final int f40004a;
    public final bi f40005b;
    public final boolean f40006c;

    public wg(bi biVar, boolean z10, int i3) {
        this.f40004a = i3;
        this.f40005b = biVar;
        this.f40006c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40004a) {
            case 0:
                boolean z10 = this.f40006c;
                bi biVar = this.f40005b;
                if (!z10) {
                    biVar.X2.setVisibility(8);
                    return;
                } else {
                    biVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f40006c;
                bi biVar2 = this.f40005b;
                if (!z11) {
                    biVar2.f32274t1.setVisibility(8);
                    return;
                } else {
                    biVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f40006c;
                bi biVar3 = this.f40005b;
                if (!z12) {
                    biVar3.f32282v1.setVisibility(8);
                    return;
                } else {
                    biVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f40006c;
                bi biVar4 = this.f40005b;
                if (z13) {
                    biVar4.f32272s3.setVisibility(4);
                    return;
                } else {
                    biVar4.getClass();
                    return;
                }
        }
    }
}
