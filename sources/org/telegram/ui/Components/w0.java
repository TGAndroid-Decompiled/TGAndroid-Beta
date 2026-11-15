package org.telegram.ui.Components;
public final class w0 implements Runnable {
    public final int f41210a;
    public final s4 f41211b;
    public final org.telegram.ui.ActionBar.t1 f41212c;
    public final org.telegram.ui.ActionBar.e2 d;

    public w0(s4 s4Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.e2 e2Var, int i7) {
        this.f41210a = i7;
        this.f41211b = s4Var;
        this.f41212c = t1Var;
        this.d = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f41210a) {
            case 0:
                org.telegram.messenger.g0.h3(new w0(this.f41211b, this.f41212c, this.d, 1));
                return;
            default:
                t4.b0(this.f41211b, this.f41212c, this.d);
                return;
        }
    }
}
