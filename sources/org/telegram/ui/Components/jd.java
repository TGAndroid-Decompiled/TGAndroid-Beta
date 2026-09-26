package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f25391a;
    public final md f25392b;
    public final boolean f25393c;

    public jd(md mdVar, boolean z10, int i10) {
        this.f25391a = i10;
        this.f25392b = mdVar;
        this.f25393c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25391a) {
            case 0:
                boolean z10 = this.f25393c;
                md mdVar = this.f25392b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25393c;
                md mdVar2 = this.f25392b;
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
