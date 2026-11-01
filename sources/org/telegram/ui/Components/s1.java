package org.telegram.ui.Components;
public final class s1 implements yb0 {
    public final int f30148a;
    public final ac0 f30149b;
    public final ac0 f30150c;
    public final ac0 d;

    public s1(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, int i10) {
        this.f30148a = i10;
        this.f30149b = ac0Var;
        this.f30150c = ac0Var2;
        this.d = ac0Var3;
    }

    @Override
    public final void t(ac0 ac0Var, int i10) {
        switch (this.f30148a) {
            case 0:
                s4.x0(this.f30149b, this.f30150c, this.d);
                return;
            case 1:
                s4.x0(this.f30149b, this.f30150c, this.d);
                return;
            default:
                s4.b(this.f30149b, this.f30150c, this.d);
                return;
        }
    }
}
