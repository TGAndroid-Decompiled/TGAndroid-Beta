package org.telegram.ui.Components;
public final class kd implements Runnable {
    public final int f28080a;
    public final md f28081b;
    public final boolean f28082c;

    public kd(md mdVar, boolean z10, int i10) {
        this.f28080a = i10;
        this.f28081b = mdVar;
        this.f28082c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28080a) {
            case 0:
                boolean z10 = this.f28082c;
                md mdVar = this.f28081b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28082c;
                md mdVar2 = this.f28081b;
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
