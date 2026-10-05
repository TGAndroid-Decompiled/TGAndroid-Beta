package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f28166a;
    public final md f28167b;
    public final boolean f28168c;

    public kd(md mdVar, boolean z10, int i10) {
        this.f28166a = i10;
        this.f28167b = mdVar;
        this.f28168c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28166a) {
            case 0:
                boolean z10 = this.f28168c;
                md mdVar = this.f28167b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28168c;
                md mdVar2 = this.f28167b;
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
