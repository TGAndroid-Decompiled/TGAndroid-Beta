package org.telegram.ui;
public final class il implements Runnable {
    public final int f38687a;
    public final jl f38688b;

    public il(jl jlVar, int i10) {
        this.f38687a = i10;
        this.f38688b = jlVar;
    }

    @Override
    public final void run() {
        switch (this.f38687a) {
            case 0:
                ok okVar = this.f38688b.H.Y;
                if (okVar != null) {
                    okVar.T0 = false;
                    org.telegram.ui.Components.gg ggVar = okVar.U0;
                    if (ggVar != null) {
                        ggVar.v(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                ok okVar2 = this.f38688b.H.Y;
                if (okVar2 != null) {
                    okVar2.F0();
                    return;
                }
                return;
        }
    }
}
