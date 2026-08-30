package org.telegram.ui.Components;
public final class fh implements Runnable {
    public final int f24876a;
    public final li f24877b;
    public final boolean f24878c;

    public fh(li liVar, boolean z4, int i10) {
        this.f24876a = i10;
        this.f24877b = liVar;
        this.f24878c = z4;
    }

    @Override
    public final void run() {
        switch (this.f24876a) {
            case 0:
                boolean z4 = this.f24878c;
                li liVar = this.f24877b;
                if (!z4) {
                    liVar.Z0.setVisibility(8);
                    return;
                } else {
                    liVar.getClass();
                    return;
                }
            case 1:
                boolean z10 = this.f24878c;
                li liVar2 = this.f24877b;
                if (!z10) {
                    liVar2.f26751w.setVisibility(8);
                    return;
                } else {
                    liVar2.getClass();
                    return;
                }
            case 2:
                boolean z11 = this.f24878c;
                li liVar3 = this.f24877b;
                if (!z11) {
                    liVar3.f26759y.setVisibility(8);
                    return;
                } else {
                    liVar3.getClass();
                    return;
                }
            default:
                boolean z12 = this.f24878c;
                li liVar4 = this.f24877b;
                if (z12) {
                    liVar4.f26746u1.setVisibility(4);
                    return;
                } else {
                    liVar4.getClass();
                    return;
                }
        }
    }
}
