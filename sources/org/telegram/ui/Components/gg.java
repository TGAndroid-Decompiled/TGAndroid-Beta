package org.telegram.ui.Components;
public final class gg implements Runnable {
    public final int f25113a;
    public final ig f25114b;
    public final ph.f3 f25115c;

    public gg(ig igVar, ph.f3 f3Var, int i10) {
        this.f25113a = i10;
        this.f25114b = igVar;
        this.f25115c = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f25113a) {
            case 0:
                ig igVar = this.f25114b;
                ph.f3 f3Var = this.f25115c;
                igVar.removeView(f3Var);
                if (igVar.f25705b == f3Var) {
                    igVar.f25705b = null;
                    return;
                }
                return;
            case 1:
                this.f25114b.removeView(this.f25115c);
                return;
            case 2:
                this.f25114b.removeView(this.f25115c);
                return;
            default:
                ig igVar2 = this.f25114b;
                ph.f3 f3Var2 = this.f25115c;
                igVar2.removeView(f3Var2);
                if (igVar2.f25704a == f3Var2) {
                    igVar2.f25704a = null;
                    return;
                }
                return;
        }
    }
}
