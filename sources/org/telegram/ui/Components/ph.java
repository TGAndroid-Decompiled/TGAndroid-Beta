package org.telegram.ui.Components;
public final class ph implements Runnable {
    public final int f29299a;
    public final ti f29300b;
    public final boolean f29301c;

    public ph(ti tiVar, boolean z10, int i10) {
        this.f29299a = i10;
        this.f29300b = tiVar;
        this.f29301c = z10;
    }

    @Override
    public final void run() {
        switch (this.f29299a) {
            case 0:
                boolean z10 = this.f29301c;
                ti tiVar = this.f29300b;
                if (!z10) {
                    tiVar.f30575f1.setVisibility(8);
                    return;
                } else {
                    tiVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f29301c;
                ti tiVar2 = this.f29300b;
                if (!z11) {
                    tiVar2.f30626w.setVisibility(8);
                    return;
                } else {
                    tiVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f29301c;
                ti tiVar3 = this.f29300b;
                if (!z12) {
                    tiVar3.f30634y.setVisibility(8);
                    return;
                } else {
                    tiVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f29301c;
                ti tiVar4 = this.f29300b;
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
