package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f28074a;
    public final md f28075b;
    public final boolean f28076c;

    public kd(md mdVar, boolean z10, int i10) {
        this.f28074a = i10;
        this.f28075b = mdVar;
        this.f28076c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28074a) {
            case 0:
                boolean z10 = this.f28076c;
                md mdVar = this.f28075b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28076c;
                md mdVar2 = this.f28075b;
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
