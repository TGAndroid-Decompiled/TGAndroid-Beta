package org.telegram.ui.Components;
public final class r6 implements org.telegram.ui.ActionBar.u6 {
    public final int f37521a;
    public final Object f37522b;

    public r6(Object obj, int i7) {
        this.f37521a = i7;
        this.f37522b = obj;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f37521a;
    }

    @Override
    public final void b() {
        switch (this.f37521a) {
            case 0:
                ((a8) this.f37522b).K0();
                return;
            case 1:
                ((vk) this.f37522b).b0();
                return;
            case 2:
                vp vpVar = (vp) this.f37522b;
                org.telegram.ui.ActionBar.r0 r0Var = vpVar.I;
                r0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, vpVar.f39700d0));
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I5, vpVar.f39700d0), r0Var.getBackground());
                r0Var.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, vpVar.f39700d0), false);
                r0Var.O(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, vpVar.f39700d0), true);
                r0Var.H(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, vpVar.f39700d0));
                return;
            case 3:
                ((qe0) this.f37522b).M0();
                return;
            case 4:
                cm0 cm0Var = ((fm0) this.f37522b).f33611z0;
                if (cm0Var != null) {
                    cm0Var.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28284y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f37522b).run();
                return;
            case 6:
                ((yv0) this.f37522b).X0(false);
                return;
            default:
                ((t31) this.f37522b).d();
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
