package org.telegram.ui.Components;
public final class gg implements Runnable {
    public final int f27160a;
    public final ig f27161b;
    public final qh.e3 f27162c;

    public gg(ig igVar, qh.e3 e3Var, int i10) {
        this.f27160a = i10;
        this.f27161b = igVar;
        this.f27162c = e3Var;
    }

    @Override
    public final void run() {
        switch (this.f27160a) {
            case 0:
                ig igVar = this.f27161b;
                qh.e3 e3Var = this.f27162c;
                igVar.removeView(e3Var);
                if (igVar.f27804b == e3Var) {
                    igVar.f27804b = null;
                    return;
                }
                return;
            case 1:
                this.f27161b.removeView(this.f27162c);
                return;
            case 2:
                this.f27161b.removeView(this.f27162c);
                return;
            default:
                ig igVar2 = this.f27161b;
                qh.e3 e3Var2 = this.f27162c;
                igVar2.removeView(e3Var2);
                if (igVar2.f27803a == e3Var2) {
                    igVar2.f27803a = null;
                    return;
                }
                return;
        }
    }
}
