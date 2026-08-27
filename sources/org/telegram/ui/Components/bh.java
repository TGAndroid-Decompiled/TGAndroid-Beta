package org.telegram.ui.Components;

public final class bh implements Runnable {

    public final int f27097a;

    public final gi f27098b;

    public final boolean f27099c;

    public bh(gi giVar, boolean z10, int i10) {
        this.f27097a = i10;
        this.f27098b = giVar;
        this.f27099c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27097a) {
            case 0:
                boolean z10 = this.f27099c;
                gi giVar = this.f27098b;
                if (!z10) {
                    giVar.Y0.setVisibility(8);
                } else {
                    giVar.getClass();
                }
                break;
            case 1:
                boolean z11 = this.f27099c;
                gi giVar2 = this.f27098b;
                if (!z11) {
                    giVar2.f28702w.setVisibility(8);
                } else {
                    giVar2.getClass();
                }
                break;
            case 2:
                boolean z12 = this.f27099c;
                gi giVar3 = this.f27098b;
                if (!z12) {
                    giVar3.f28710y.setVisibility(8);
                } else {
                    giVar3.getClass();
                }
                break;
            default:
                boolean z13 = this.f27099c;
                gi giVar4 = this.f27098b;
                if (!z13) {
                    giVar4.getClass();
                } else {
                    giVar4.f28694t1.setVisibility(4);
                }
                break;
        }
    }
}
