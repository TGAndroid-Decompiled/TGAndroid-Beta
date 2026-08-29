package org.telegram.ui.Components;
public final class db implements o1.g {
    public final int f27728a;
    public final Object f27729b;

    public db(Object obj, int i10) {
        this.f27728a = i10;
        this.f27729b = obj;
    }

    @Override
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.f27728a) {
            case 0:
                mc mcVar = (mc) this.f27729b;
                if (mcVar.d == iVar) {
                    mcVar.d = null;
                    return;
                }
                return;
            case 1:
                za zaVar = (za) this.f27729b;
                if (!z10) {
                    zaVar.run();
                    return;
                }
                return;
            case 2:
                po0 po0Var = (po0) this.f27729b;
                po0Var.f31721q = false;
                po0Var.dismiss();
                return;
            case 3:
                qo0 qo0Var = (qo0) this.f27729b;
                qo0Var.f32024s = false;
                qo0Var.f32023r = false;
                if (!z10) {
                    iVar.c();
                }
                if (iVar == qo0Var.f32021f) {
                    qo0Var.f32021f = null;
                    return;
                }
                return;
            case 4:
                dq0 dq0Var = (dq0) this.f27729b;
                dq0Var.A.setVisibility(8);
                dq0Var.f27854v0.setVisibility(8);
                aq0 aq0Var = dq0Var.H;
                aq0Var.f26835f = null;
                aq0Var.l();
                dq0Var.f27858x0 = null;
                dq0Var.I0 = false;
                return;
            default:
                dq0 dq0Var2 = ((jp0) this.f27729b).d;
                dq0Var2.B.setVisibility(8);
                dq0Var2.C.setVisibility(8);
                dq0Var2.f27853u0.setVisibility(8);
                dq0Var2.f27858x0 = null;
                return;
        }
    }
}
