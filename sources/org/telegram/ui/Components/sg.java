package org.telegram.ui.Components;
public final class sg implements Runnable {
    public final int f27046a;
    public final ug f27047b;
    public final bi.x4 f27048c;

    public sg(ug ugVar, bi.x4 x4Var, int i10) {
        this.f27046a = i10;
        this.f27047b = ugVar;
        this.f27048c = x4Var;
    }

    @Override
    public final void run() {
        switch (this.f27046a) {
            case 0:
                ug ugVar = this.f27047b;
                bi.x4 x4Var = this.f27048c;
                ugVar.removeView(x4Var);
                if (ugVar.f27663b == x4Var) {
                    ugVar.f27663b = null;
                    return;
                }
                return;
            case 1:
                this.f27047b.removeView(this.f27048c);
                return;
            case 2:
                this.f27047b.removeView(this.f27048c);
                return;
            default:
                ug ugVar2 = this.f27047b;
                bi.x4 x4Var2 = this.f27048c;
                ugVar2.removeView(x4Var2);
                if (ugVar2.f27662a == x4Var2) {
                    ugVar2.f27662a = null;
                    return;
                }
                return;
        }
    }
}
