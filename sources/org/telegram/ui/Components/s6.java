package org.telegram.ui.Components;
public final class s6 implements org.telegram.ui.ActionBar.t6 {
    public final int f37936a;
    public final Object f37937b;

    public s6(Object obj, int i7) {
        this.f37936a = i7;
        this.f37937b = obj;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f37936a;
    }

    @Override
    public final void b() {
        switch (this.f37936a) {
            case 0:
                ((b8) this.f37937b).K0();
                return;
            case 1:
                ((wk) this.f37937b).b0();
                return;
            case 2:
                vp vpVar = (vp) this.f37937b;
                org.telegram.ui.ActionBar.r0 r0Var = vpVar.I;
                r0Var.setIconColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, vpVar.f39778d0));
                org.telegram.ui.ActionBar.l6.C1(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.I5, vpVar.f39778d0), r0Var.getBackground());
                r0Var.O(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.E8, vpVar.f39778d0), false);
                r0Var.O(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.F8, vpVar.f39778d0), true);
                r0Var.H(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G8, vpVar.f39778d0));
                return;
            case 3:
                ((re0) this.f37937b).M0();
                return;
            case 4:
                dm0 dm0Var = ((gm0) this.f37937b).f34016z0;
                if (dm0Var != null) {
                    dm0Var.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28259y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f37937b).run();
                return;
            case 6:
                ((zv0) this.f37937b).X0(false);
                return;
            default:
                ((u31) this.f37937b).d();
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
