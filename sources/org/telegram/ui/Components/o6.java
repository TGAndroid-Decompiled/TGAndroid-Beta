package org.telegram.ui.Components;
public final class o6 implements org.telegram.ui.ActionBar.b7 {
    public final int f29031a;
    public final Object f29032b;

    public o6(Object obj, int i10) {
        this.f29031a = i10;
        this.f29032b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f29031a;
    }

    @Override
    public final void b() {
        switch (this.f29031a) {
            case 0:
                ((w7) this.f29032b).K0();
                return;
            case 1:
                ((bl) this.f29032b).Y();
                return;
            case 2:
                cq cqVar = (cq) this.f29032b;
                org.telegram.ui.ActionBar.t0 t0Var = cqVar.I;
                t0Var.setIconColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, cqVar.f25217d0));
                org.telegram.ui.ActionBar.t6.C1(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.I5, cqVar.f25217d0), t0Var.getBackground());
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, cqVar.f25217d0), false);
                t0Var.O(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.F8, cqVar.f25217d0), true);
                t0Var.H(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G8, cqVar.f25217d0));
                return;
            case 3:
                ((tf0) this.f29032b).M0();
                return;
            case 4:
                en0 en0Var = ((hn0) this.f29032b).f26893z0;
                if (en0Var != null) {
                    en0Var.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21314y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f29032b).run();
                return;
            case 6:
                ((dx0) this.f29032b).X0(false);
                return;
            default:
                ((x41) this.f29032b).d();
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
