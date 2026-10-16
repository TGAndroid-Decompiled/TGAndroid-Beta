package org.telegram.ui.Components;
public final class ld implements Runnable {
    public final int f26727a;
    public final md f26728b;
    public final boolean f26729c;

    public ld(md mdVar, boolean z10, int i10) {
        this.f26727a = i10;
        this.f26728b = mdVar;
        this.f26729c = z10;
    }

    @Override
    public final void run() {
        switch (this.f26727a) {
            case 0:
                boolean z10 = this.f26729c;
                md mdVar = this.f26728b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f26729c;
                md mdVar2 = this.f26728b;
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
