package org.telegram.ui.Components;
public final class wf implements Runnable {
    public final int f39994a;
    public final yf f39995b;
    public final gi.l3 f39996c;

    public wf(yf yfVar, gi.l3 l3Var, int i3) {
        this.f39994a = i3;
        this.f39995b = yfVar;
        this.f39996c = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f39994a) {
            case 0:
                yf yfVar = this.f39995b;
                gi.l3 l3Var = this.f39996c;
                yfVar.removeView(l3Var);
                if (yfVar.f40695b == l3Var) {
                    yfVar.f40695b = null;
                    return;
                }
                return;
            case 1:
                this.f39995b.removeView(this.f39996c);
                return;
            case 2:
                this.f39995b.removeView(this.f39996c);
                return;
            default:
                yf yfVar2 = this.f39995b;
                gi.l3 l3Var2 = this.f39996c;
                yfVar2.removeView(l3Var2);
                if (yfVar2.f40693a == l3Var2) {
                    yfVar2.f40693a = null;
                    return;
                }
                return;
        }
    }
}
