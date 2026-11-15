package org.telegram.ui.Components;
public final class eh implements Runnable {
    public final int f34315a;
    public final ki f34316b;
    public final boolean f34317c;

    public eh(ki kiVar, boolean z10, int i7) {
        this.f34315a = i7;
        this.f34316b = kiVar;
        this.f34317c = z10;
    }

    @Override
    public final void run() {
        switch (this.f34315a) {
            case 0:
                boolean z10 = this.f34317c;
                ki kiVar = this.f34316b;
                if (!z10) {
                    kiVar.f36425a3.setVisibility(8);
                    return;
                } else {
                    kiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f34317c;
                ki kiVar2 = this.f34316b;
                if (!z11) {
                    kiVar2.f36496w1.setVisibility(8);
                    return;
                } else {
                    kiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f34317c;
                ki kiVar3 = this.f34316b;
                if (!z12) {
                    kiVar3.f36504y1.setVisibility(8);
                    return;
                } else {
                    kiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f34317c;
                ki kiVar4 = this.f34316b;
                if (z13) {
                    kiVar4.f36494v3.setVisibility(4);
                    return;
                } else {
                    kiVar4.getClass();
                    return;
                }
        }
    }
}
