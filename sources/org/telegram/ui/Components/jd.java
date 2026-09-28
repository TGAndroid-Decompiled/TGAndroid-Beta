package org.telegram.ui.Components;
public final class jd implements Runnable {
    public final int f25441a;
    public final md f25442b;
    public final boolean f25443c;

    public jd(md mdVar, boolean z10, int i10) {
        this.f25441a = i10;
        this.f25442b = mdVar;
        this.f25443c = z10;
    }

    @Override
    public final void run() {
        switch (this.f25441a) {
            case 0:
                boolean z10 = this.f25443c;
                md mdVar = this.f25442b;
                if (!z10) {
                    mdVar.Z0.setVisibility(8);
                    return;
                } else {
                    mdVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f25443c;
                md mdVar2 = this.f25442b;
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
