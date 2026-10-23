package org.telegram.ui.Components;
public final class z6 implements org.telegram.ui.ActionBar.s6 {
    public final int f33150a;
    public final Object f33151b;

    public z6(Object obj, int i10) {
        this.f33150a = i10;
        this.f33151b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f33150a;
    }

    @Override
    public final void b() {
        switch (this.f33150a) {
            case 0:
                ((k8) this.f33151b).v0();
                return;
            case 1:
                ((rl) this.f33151b).Y();
                return;
            case 2:
                wq wqVar = (wq) this.f33151b;
                org.telegram.ui.ActionBar.u0 u0Var = wqVar.I;
                u0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, wqVar.f32321d0));
                org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I5, wqVar.f32321d0), u0Var.getBackground());
                u0Var.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, wqVar.f32321d0), false);
                u0Var.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, wqVar.f32321d0), true);
                u0Var.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, wqVar.f32321d0));
                return;
            case 3:
                ((oh0) this.f33151b).U();
                return;
            case 4:
                wo0 wo0Var = ((ap0) this.f33151b).f24820x0;
                if (wo0Var != null) {
                    wo0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21573y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f33151b).run();
                return;
            case 6:
                ((ty0) this.f33151b).B0(false);
                return;
            default:
                ((i61) this.f33151b).d();
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
