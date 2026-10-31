package org.telegram.ui.Components;
public final class s1 implements yb0 {
    public final int f30081a;
    public final ac0 f30082b;
    public final ac0 f30083c;
    public final ac0 d;

    public s1(ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, int i10) {
        this.f30081a = i10;
        this.f30082b = ac0Var;
        this.f30083c = ac0Var2;
        this.d = ac0Var3;
    }

    @Override
    public final void t(ac0 ac0Var, int i10) {
        switch (this.f30081a) {
            case 0:
                s4.x0(this.f30082b, this.f30083c, this.d);
                return;
            case 1:
                s4.x0(this.f30082b, this.f30083c, this.d);
                return;
            default:
                s4.b(this.f30082b, this.f30083c, this.d);
                return;
        }
    }
}
