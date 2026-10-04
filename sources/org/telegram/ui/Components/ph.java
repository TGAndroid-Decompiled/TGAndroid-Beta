package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f29644a;
    public final xi f29645b;
    public final boolean f29646c;

    public ph(xi xiVar, boolean z10, int i10) {
        this.f29644a = i10;
        this.f29645b = xiVar;
        this.f29646c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29644a) {
            case 0:
                boolean z10 = this.f29646c;
                xi xiVar = this.f29645b;
                if (!z10) {
                    xiVar.f32809c1.setVisibility(8);
                    return;
                } else {
                    xiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29646c;
                xi xiVar2 = this.f29645b;
                if (!z11) {
                    xiVar2.f32871w.setVisibility(8);
                    return;
                } else {
                    xiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29646c;
                xi xiVar3 = this.f29645b;
                if (!z12) {
                    xiVar3.f32879y.setVisibility(8);
                    return;
                } else {
                    xiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29646c;
                xi xiVar4 = this.f29645b;
                if (z13) {
                    xiVar4.f32877x1.setVisibility(4);
                    return;
                } else {
                    xiVar4.getClass();
                    return;
                }
        }
    }
}
