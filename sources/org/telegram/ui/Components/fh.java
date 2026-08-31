package org.telegram.ui.Components;
public final class fh implements Runnable {
    public final int f26913a;
    public final mi f26914b;
    public final boolean f26915c;

    public fh(mi miVar, boolean z4, int i10) {
        this.f26913a = i10;
        this.f26914b = miVar;
        this.f26915c = z4;
    }

    @Override
    public final void run() {
        switch (this.f26913a) {
            case 0:
                boolean z4 = this.f26915c;
                mi miVar = this.f26914b;
                if (!z4) {
                    miVar.Z0.setVisibility(8);
                    return;
                } else {
                    miVar.getClass();
                    return;
                }
            case 1:
                boolean z10 = this.f26915c;
                mi miVar2 = this.f26914b;
                if (!z10) {
                    miVar2.f29103w.setVisibility(8);
                    return;
                } else {
                    miVar2.getClass();
                    return;
                }
            case 2:
                boolean z11 = this.f26915c;
                mi miVar3 = this.f26914b;
                if (!z11) {
                    miVar3.f29111y.setVisibility(8);
                    return;
                } else {
                    miVar3.getClass();
                    return;
                }
            default:
                boolean z12 = this.f26915c;
                mi miVar4 = this.f26914b;
                if (z12) {
                    miVar4.f29098u1.setVisibility(4);
                    return;
                } else {
                    miVar4.getClass();
                    return;
                }
        }
    }
}
