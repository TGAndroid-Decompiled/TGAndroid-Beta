package org.telegram.ui.Components;
public final class q6 implements org.telegram.ui.ActionBar.s6 {
    public final int f37356a;
    public final Object f37357b;

    public q6(Object obj, int i3) {
        this.f37356a = i3;
        this.f37357b = obj;
    }

    @Override
    public final void a(float f10) {
        int i3 = this.f37356a;
    }

    @Override
    public final void b() {
        switch (this.f37356a) {
            case 0:
                ((z7) this.f37357b).K0();
                return;
            case 1:
                ((uk) this.f37357b).b0();
                return;
            case 2:
                vp vpVar = (vp) this.f37357b;
                org.telegram.ui.ActionBar.q0 q0Var = vpVar.J;
                q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, vpVar.f39757e0));
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I5, vpVar.f39757e0), q0Var.getBackground());
                q0Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, vpVar.f39757e0), false);
                q0Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, vpVar.f39757e0), true);
                q0Var.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, vpVar.f39757e0));
                return;
            case 3:
                ((se0) this.f37357b).M0();
                return;
            case 4:
                fm0 fm0Var = ((im0) this.f37357b).A0;
                if (fm0Var != null) {
                    fm0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28275y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f37357b).run();
                return;
            case 6:
                ((xv0) this.f37357b).X0(false);
                return;
            default:
                ((n31) this.f37357b).d();
                return;
        }
    }

    private final void c(float f10) {
    }

    private final void d(float f10) {
    }

    private final void e(float f10) {
    }

    private final void f(float f10) {
    }

    private final void g(float f10) {
    }

    private final void h(float f10) {
    }

    private final void i(float f10) {
    }

    private final void j(float f10) {
    }
}
