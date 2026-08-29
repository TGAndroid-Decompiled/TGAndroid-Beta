package org.telegram.ui.Components;
public final class o0 implements oc0 {
    public final int f31202a;
    public final qc0 f31203b;
    public final qc0 f31204c;
    public final qc0 d;

    public o0(qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, int i10) {
        this.f31202a = i10;
        this.f31203b = qc0Var;
        this.f31204c = qc0Var2;
        this.d = qc0Var3;
    }

    @Override
    public final void q(qc0 qc0Var, int i10) {
        switch (this.f31202a) {
            case 0:
                c5.b(this.f31203b, this.f31204c, this.d);
                return;
            case 1:
                c5.y0(this.f31203b, this.f31204c, this.d);
                return;
            default:
                c5.y0(this.f31203b, this.f31204c, this.d);
                return;
        }
    }
}
