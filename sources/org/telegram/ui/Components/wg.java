package org.telegram.ui.Components;
public final class wg implements Runnable {
    public final int f32237a;
    public final bi f32238b;
    public final boolean f32239c;

    public wg(bi biVar, boolean z10, int i10) {
        this.f32237a = i10;
        this.f32238b = biVar;
        this.f32239c = z10;
    }

    @Override
    public final void run() {
        switch (this.f32237a) {
            case 0:
                boolean z10 = this.f32239c;
                bi biVar = this.f32238b;
                if (!z10) {
                    biVar.W2.setVisibility(8);
                    return;
                } else {
                    biVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f32239c;
                bi biVar2 = this.f32238b;
                if (!z11) {
                    biVar2.f24811s1.setVisibility(8);
                    return;
                } else {
                    biVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f32239c;
                bi biVar3 = this.f32238b;
                if (!z12) {
                    biVar3.f24819u1.setVisibility(8);
                    return;
                } else {
                    biVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f32239c;
                bi biVar4 = this.f32238b;
                if (z13) {
                    biVar4.f24809r3.setVisibility(4);
                    return;
                } else {
                    biVar4.getClass();
                    return;
                }
        }
    }
}
