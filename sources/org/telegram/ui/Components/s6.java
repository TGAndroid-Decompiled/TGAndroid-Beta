package org.telegram.ui.Components;
public final class s6 implements org.telegram.ui.ActionBar.s6 {
    public final int f37916a;
    public final Object f37917b;

    public s6(Object obj, int i7) {
        this.f37916a = i7;
        this.f37917b = obj;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f37916a;
    }

    @Override
    public final void b() {
        switch (this.f37916a) {
            case 0:
                ((b8) this.f37917b).K0();
                return;
            case 1:
                ((wk) this.f37917b).b0();
                return;
            case 2:
                vp vpVar = (vp) this.f37917b;
                org.telegram.ui.ActionBar.r0 r0Var = vpVar.I;
                r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, vpVar.f39654d0));
                org.telegram.ui.ActionBar.k6.C1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I5, vpVar.f39654d0), r0Var.getBackground());
                r0Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, vpVar.f39654d0), false);
                r0Var.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, vpVar.f39654d0), true);
                r0Var.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, vpVar.f39654d0));
                return;
            case 3:
                ((qe0) this.f37917b).M0();
                return;
            case 4:
                cm0 cm0Var = ((fm0) this.f37917b).f33612z0;
                if (cm0Var != null) {
                    cm0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28243y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f37917b).run();
                return;
            case 6:
                ((yv0) this.f37917b).X0(false);
                return;
            default:
                ((t31) this.f37917b).d();
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
