package org.telegram.ui.Components;
public final class nh implements Runnable {
    public final int f37790a;
    public final si f37791b;
    public final boolean f37792c;

    public nh(si siVar, boolean z10, int i7) {
        this.f37790a = i7;
        this.f37791b = siVar;
        this.f37792c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37790a) {
            case 0:
                boolean z10 = this.f37792c;
                si siVar = this.f37791b;
                if (!z10) {
                    siVar.f39660a3.setVisibility(8);
                    return;
                } else {
                    siVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f37792c;
                si siVar2 = this.f37791b;
                if (!z11) {
                    siVar2.f39731w1.setVisibility(8);
                    return;
                } else {
                    siVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f37792c;
                si siVar3 = this.f37791b;
                if (!z12) {
                    siVar3.f39739y1.setVisibility(8);
                    return;
                } else {
                    siVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f37792c;
                si siVar4 = this.f37791b;
                if (z13) {
                    siVar4.f39729v3.setVisibility(4);
                    return;
                } else {
                    siVar4.getClass();
                    return;
                }
        }
    }
}
