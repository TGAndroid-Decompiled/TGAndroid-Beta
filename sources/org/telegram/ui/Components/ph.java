package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f29306a;
    public final ti f29307b;
    public final boolean f29308c;

    public ph(ti tiVar, boolean z10, int i10) {
        this.f29306a = i10;
        this.f29307b = tiVar;
        this.f29308c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29306a) {
            case 0:
                boolean z10 = this.f29308c;
                ti tiVar = this.f29307b;
                if (!z10) {
                    tiVar.f30582f1.setVisibility(8);
                    return;
                } else {
                    tiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29308c;
                ti tiVar2 = this.f29307b;
                if (!z11) {
                    tiVar2.f30633w.setVisibility(8);
                    return;
                } else {
                    tiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29308c;
                ti tiVar3 = this.f29307b;
                if (!z12) {
                    tiVar3.f30641y.setVisibility(8);
                    return;
                } else {
                    tiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29308c;
                ti tiVar4 = this.f29307b;
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
