package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f25675a;
    public final md f25676b;
    public final boolean f25677c;

    public kd(md mdVar, boolean z10, int i10) {
        this.f25675a = i10;
        this.f25676b = mdVar;
        this.f25677c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25675a) {
            case 0:
                boolean z10 = this.f25677c;
                md mdVar = this.f25676b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25677c;
                md mdVar2 = this.f25676b;
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
