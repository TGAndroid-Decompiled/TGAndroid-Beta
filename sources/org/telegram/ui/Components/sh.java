package org.telegram.ui.Components;
public final class sh implements Runnable {
    public final int f27052a;
    public final yi f27053b;
    public final boolean f27054c;

    public sh(yi yiVar, boolean z10, int i10) {
        this.f27052a = i10;
        this.f27053b = yiVar;
        this.f27054c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27052a) {
            case 0:
                boolean z10 = this.f27054c;
                yi yiVar = this.f27053b;
                if (!z10) {
                    yiVar.f29357c1.setVisibility(8);
                    return;
                } else {
                    yiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f27054c;
                yi yiVar2 = this.f27053b;
                if (!z11) {
                    yiVar2.f29418w.setVisibility(8);
                    return;
                } else {
                    yiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f27054c;
                yi yiVar3 = this.f27053b;
                if (!z12) {
                    yiVar3.f29426y.setVisibility(8);
                    return;
                } else {
                    yiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f27054c;
                yi yiVar4 = this.f27053b;
                if (z13) {
                    yiVar4.f29424x1.setVisibility(4);
                    return;
                } else {
                    yiVar4.getClass();
                    return;
                }
        }
    }
}
