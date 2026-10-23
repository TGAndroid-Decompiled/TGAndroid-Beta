package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f29560a;
    public final ti f29561b;
    public final boolean f29562c;

    public ph(ti tiVar, boolean z10, int i10) {
        this.f29560a = i10;
        this.f29561b = tiVar;
        this.f29562c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29560a) {
            case 0:
                boolean z10 = this.f29562c;
                ti tiVar = this.f29561b;
                if (!z10) {
                    tiVar.f30731f1.setVisibility(8);
                    return;
                } else {
                    tiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29562c;
                ti tiVar2 = this.f29561b;
                if (!z11) {
                    tiVar2.f30782w.setVisibility(8);
                    return;
                } else {
                    tiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29562c;
                ti tiVar3 = this.f29561b;
                if (!z12) {
                    tiVar3.f30790y.setVisibility(8);
                    return;
                } else {
                    tiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29562c;
                ti tiVar4 = this.f29561b;
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
