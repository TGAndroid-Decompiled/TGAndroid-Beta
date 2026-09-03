package org.telegram.ui.Components;
public final class fh implements Runnable {
    public final int f24884a;
    public final li f24885b;
    public final boolean f24886c;

    public fh(li liVar, boolean z4, int i10) {
        this.f24884a = i10;
        this.f24885b = liVar;
        this.f24886c = z4;
    }

    @Override
    public final void run() {
        switch (this.f24884a) {
            case 0:
                boolean z4 = this.f24886c;
                li liVar = this.f24885b;
                if (!z4) {
                    liVar.Z0.setVisibility(8);
                    return;
                } else {
                    liVar.getClass();
                    return;
                }
            case 1:
                boolean z10 = this.f24886c;
                li liVar2 = this.f24885b;
                if (!z10) {
                    liVar2.f26747w.setVisibility(8);
                    return;
                } else {
                    liVar2.getClass();
                    return;
                }
            case 2:
                boolean z11 = this.f24886c;
                li liVar3 = this.f24885b;
                if (!z11) {
                    liVar3.f26755y.setVisibility(8);
                    return;
                } else {
                    liVar3.getClass();
                    return;
                }
            default:
                boolean z12 = this.f24886c;
                li liVar4 = this.f24885b;
                if (z12) {
                    liVar4.f26742u1.setVisibility(4);
                    return;
                } else {
                    liVar4.getClass();
                    return;
                }
        }
    }
}
