package org.telegram.ui;
public final class jl implements Runnable {
    public final int f34129a;
    public final kl f34130b;

    public jl(kl klVar, int i10) {
        this.f34129a = i10;
        this.f34130b = klVar;
    }

    @Override
    public final void run() {
        switch (this.f34129a) {
            case 0:
                ok okVar = this.f34130b.H.Y;
                if (okVar != null) {
                    okVar.T0 = false;
                    org.telegram.ui.Components.fg fgVar = okVar.U0;
                    if (fgVar != null) {
                        fgVar.u(false);
                        return;
                    }
                    return;
                }
                return;
            default:
                ok okVar2 = this.f34130b.H.Y;
                if (okVar2 != null) {
                    okVar2.H0();
                    return;
                }
                return;
        }
    }
}
