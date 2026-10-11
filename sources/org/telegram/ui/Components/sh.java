package org.telegram.ui.Components;
public final class sh implements Runnable {
    public final int f30863a;
    public final yi f30864b;
    public final boolean f30865c;

    public sh(yi yiVar, boolean z10, int i10) {
        this.f30863a = i10;
        this.f30864b = yiVar;
        this.f30865c = z10;
    }

    @Override
    public final void run() {
        switch (this.f30863a) {
            case 0:
                boolean z10 = this.f30865c;
                yi yiVar = this.f30864b;
                if (!z10) {
                    yiVar.f33290f1.setVisibility(8);
                    return;
                } else {
                    yiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f30865c;
                yi yiVar2 = this.f30864b;
                if (!z11) {
                    yiVar2.f33341w.setVisibility(8);
                    return;
                } else {
                    yiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f30865c;
                yi yiVar3 = this.f30864b;
                if (!z12) {
                    yiVar3.f33349y.setVisibility(8);
                    return;
                } else {
                    yiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f30865c;
                yi yiVar4 = this.f30864b;
                if (z13) {
                    yiVar4.A1.setVisibility(4);
                    return;
                } else {
                    yiVar4.getClass();
                    return;
                }
        }
    }
}
