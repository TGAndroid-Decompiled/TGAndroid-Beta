package org.telegram.ui.Components;
public final class o6 implements org.telegram.ui.ActionBar.b7 {
    public final int f28978a;
    public final Object f28979b;

    public o6(Object obj, int i10) {
        this.f28978a = i10;
        this.f28979b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f28978a;
    }

    @Override
    public final void b() {
        switch (this.f28978a) {
            case 0:
                ((w7) this.f28979b).K0();
                return;
            case 1:
                ((bl) this.f28979b).Y();
                return;
            case 2:
                cq cqVar = (cq) this.f28979b;
                org.telegram.ui.ActionBar.t0 t0Var = cqVar.I;
                t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, cqVar.f25140d0));
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I5, cqVar.f25140d0), t0Var.getBackground());
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, cqVar.f25140d0), false);
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, cqVar.f25140d0), true);
                t0Var.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, cqVar.f25140d0));
                return;
            case 3:
                ((tf0) this.f28979b).M0();
                return;
            case 4:
                dn0 dn0Var = ((gn0) this.f28979b).f26472z0;
                if (dn0Var != null) {
                    dn0Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21313y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f28979b).run();
                return;
            case 6:
                ((cx0) this.f28979b).X0(false);
                return;
            default:
                ((w41) this.f28979b).d();
                return;
        }
    }

    private final void c(float f7) {
    }

    private final void d(float f7) {
    }

    private final void e(float f7) {
    }

    private final void f(float f7) {
    }

    private final void g(float f7) {
    }

    private final void h(float f7) {
    }

    private final void i(float f7) {
    }

    private final void j(float f7) {
    }
}
