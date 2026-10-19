package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f29269a;
    public final ti f29270b;
    public final boolean f29271c;

    public ph(ti tiVar, boolean z10, int i10) {
        this.f29269a = i10;
        this.f29270b = tiVar;
        this.f29271c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29269a) {
            case 0:
                boolean z10 = this.f29271c;
                ti tiVar = this.f29270b;
                if (!z10) {
                    tiVar.f30535f1.setVisibility(8);
                    return;
                } else {
                    tiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29271c;
                ti tiVar2 = this.f29270b;
                if (!z11) {
                    tiVar2.f30586w.setVisibility(8);
                    return;
                } else {
                    tiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29271c;
                ti tiVar3 = this.f29270b;
                if (!z12) {
                    tiVar3.f30594y.setVisibility(8);
                    return;
                } else {
                    tiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29271c;
                ti tiVar4 = this.f29270b;
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
