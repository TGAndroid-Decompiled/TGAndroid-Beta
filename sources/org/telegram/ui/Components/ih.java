package org.telegram.ui.Components;
public final class ih implements Runnable {
    public final int f29389a;
    public final ni f29390b;
    public final boolean f29391c;

    public ih(ni niVar, boolean z10, int i10) {
        this.f29389a = i10;
        this.f29390b = niVar;
        this.f29391c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29389a) {
            case 0:
                boolean z10 = this.f29391c;
                ni niVar = this.f29390b;
                if (!z10) {
                    niVar.Y0.setVisibility(8);
                    return;
                } else {
                    niVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29391c;
                ni niVar2 = this.f29390b;
                if (!z11) {
                    niVar2.f31057w.setVisibility(8);
                    return;
                } else {
                    niVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29391c;
                ni niVar3 = this.f29390b;
                if (!z12) {
                    niVar3.f31065y.setVisibility(8);
                    return;
                } else {
                    niVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29391c;
                ni niVar4 = this.f29390b;
                if (z13) {
                    niVar4.f31049t1.setVisibility(4);
                    return;
                } else {
                    niVar4.getClass();
                    return;
                }
        }
    }
}
