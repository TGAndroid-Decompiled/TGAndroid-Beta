package org.telegram.ui.Components;
public final class gg implements Runnable {
    public final int f27182a;
    public final ig f27183b;
    public final qh.f3 f27184c;

    public gg(ig igVar, qh.f3 f3Var, int i10) {
        this.f27182a = i10;
        this.f27183b = igVar;
        this.f27184c = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f27182a) {
            case 0:
                ig igVar = this.f27183b;
                qh.f3 f3Var = this.f27184c;
                igVar.removeView(f3Var);
                if (igVar.f27771b == f3Var) {
                    igVar.f27771b = null;
                    return;
                }
                return;
            case 1:
                this.f27183b.removeView(this.f27184c);
                return;
            case 2:
                this.f27183b.removeView(this.f27184c);
                return;
            default:
                ig igVar2 = this.f27183b;
                qh.f3 f3Var2 = this.f27184c;
                igVar2.removeView(f3Var2);
                if (igVar2.f27770a == f3Var2) {
                    igVar2.f27770a = null;
                    return;
                }
                return;
        }
    }
}
