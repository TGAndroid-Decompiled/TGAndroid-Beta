package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f25740a;
    public final md f25741b;
    public final boolean f25742c;

    public kd(md mdVar, boolean z10, int i10) {
        this.f25740a = i10;
        this.f25741b = mdVar;
        this.f25742c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25740a) {
            case 0:
                boolean z10 = this.f25742c;
                md mdVar = this.f25741b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25742c;
                md mdVar2 = this.f25741b;
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
