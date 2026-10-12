package org.telegram.ui.Components;
public final class ld implements Runnable {
    public final int f27027a;
    public final md f27028b;
    public final boolean f27029c;

    public ld(md mdVar, boolean z10, int i10) {
        this.f27027a = i10;
        this.f27028b = mdVar;
        this.f27029c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27027a) {
            case 0:
                boolean z10 = this.f27029c;
                md mdVar = this.f27028b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27029c;
                md mdVar2 = this.f27028b;
                if (!z11) {
                    mdVar2.V0.setVisibility(8);
                    return;
                } else {
                    mdVar2.getClass();
                    return;
                }
        }
    }
}
