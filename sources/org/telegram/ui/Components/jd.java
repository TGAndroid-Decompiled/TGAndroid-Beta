package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f25383a;
    public final md f25384b;
    public final boolean f25385c;

    public jd(md mdVar, boolean z10, int i10) {
        this.f25383a = i10;
        this.f25384b = mdVar;
        this.f25385c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25383a) {
            case 0:
                boolean z10 = this.f25385c;
                md mdVar = this.f25384b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25385c;
                md mdVar2 = this.f25384b;
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
