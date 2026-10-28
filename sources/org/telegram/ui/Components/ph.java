package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f31611a;
    public final ti f31612b;
    public final boolean f31613c;

    public ph(ti tiVar, boolean z10, int i10) {
        this.f31611a = i10;
        this.f31612b = tiVar;
        this.f31613c = z10;
    }

    @Override
    public final void run() {
        switch (this.f31611a) {
            case 0:
                boolean z10 = this.f31613c;
                ti tiVar = this.f31612b;
                if (!z10) {
                    tiVar.f32991f1.setVisibility(8);
                    return;
                } else {
                    tiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f31613c;
                ti tiVar2 = this.f31612b;
                if (!z11) {
                    tiVar2.f33042w.setVisibility(8);
                    return;
                } else {
                    tiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f31613c;
                ti tiVar3 = this.f31612b;
                if (!z12) {
                    tiVar3.f33050y.setVisibility(8);
                    return;
                } else {
                    tiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f31613c;
                ti tiVar4 = this.f31612b;
                if (z13) {
                    tiVar4.A1.setVisibility(4);
                    return;
                } else {
                    tiVar4.getClass();
                    return;
                }
        }
    }
}
