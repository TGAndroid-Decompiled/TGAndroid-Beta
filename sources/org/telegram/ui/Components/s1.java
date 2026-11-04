package org.telegram.ui.Components;
public final class s1 implements ab0 {
    public final int f37881a;
    public final cb0 f37882b;
    public final cb0 f37883c;
    public final cb0 d;

    public s1(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, int i3) {
        this.f37881a = i3;
        this.f37882b = cb0Var;
        this.f37883c = cb0Var2;
        this.d = cb0Var3;
    }

    @Override
    public final void l(cb0 cb0Var, int i3) {
        switch (this.f37881a) {
            case 0:
                t4.x0(this.f37882b, this.f37883c, this.d);
                return;
            case 1:
                t4.x0(this.f37882b, this.f37883c, this.d);
                return;
            default:
                t4.b(this.f37882b, this.f37883c, this.d);
                return;
        }
    }
}
