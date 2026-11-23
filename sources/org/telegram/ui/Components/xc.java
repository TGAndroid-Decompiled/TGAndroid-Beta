package org.telegram.ui.Components;
public final class xc implements Runnable {
    public final int f42035a;
    public final yc f42036b;
    public final boolean f42037c;

    public xc(yc ycVar, boolean z10, int i7) {
        this.f42035a = i7;
        this.f42036b = ycVar;
        this.f42037c = z10;
    }

    @Override
    public final void run() {
        switch (this.f42035a) {
            case 0:
                boolean z10 = this.f42037c;
                yc ycVar = this.f42036b;
                if (!z10) {
                    ycVar.Z0.setVisibility(8);
                    return;
                } else {
                    ycVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f42037c;
                yc ycVar2 = this.f42036b;
                if (!z11) {
                    ycVar2.V0.setVisibility(8);
                    return;
                } else {
                    ycVar2.getClass();
                    return;
                }
        }
    }
}
