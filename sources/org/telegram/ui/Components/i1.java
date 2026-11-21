package org.telegram.ui.Components;
public final class i1 implements Runnable {
    public final int f36109a;
    public final b5 f36110b;
    public final org.telegram.ui.ActionBar.t1 f36111c;
    public final org.telegram.ui.ActionBar.g2 d;

    public i1(b5 b5Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.f36109a = i7;
        this.f36110b = b5Var;
        this.f36111c = t1Var;
        this.d = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f36109a) {
            case 0:
                org.telegram.messenger.g0.g3(new i1(this.f36110b, this.f36111c, this.d, 1));
                return;
            default:
                c5.b0(this.f36110b, this.f36111c, this.d);
                return;
        }
    }
}
