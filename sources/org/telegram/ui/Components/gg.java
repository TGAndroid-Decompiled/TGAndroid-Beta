package org.telegram.ui.Components;
public final class gg implements Runnable {
    public final int f25136a;
    public final ig f25137b;
    public final ph.f3 f25138c;

    public gg(ig igVar, ph.f3 f3Var, int i10) {
        this.f25136a = i10;
        this.f25137b = igVar;
        this.f25138c = f3Var;
    }

    @Override
    public final void run() {
        switch (this.f25136a) {
            case 0:
                ig igVar = this.f25137b;
                ph.f3 f3Var = this.f25138c;
                igVar.removeView(f3Var);
                if (igVar.f25695b == f3Var) {
                    igVar.f25695b = null;
                    return;
                }
                return;
            case 1:
                this.f25137b.removeView(this.f25138c);
                return;
            case 2:
                this.f25137b.removeView(this.f25138c);
                return;
            default:
                ig igVar2 = this.f25137b;
                ph.f3 f3Var2 = this.f25138c;
                igVar2.removeView(f3Var2);
                if (igVar2.f25694a == f3Var2) {
                    igVar2.f25694a = null;
                    return;
                }
                return;
        }
    }
}
