package org.telegram.ui.Components;
public final class x6 implements org.telegram.ui.ActionBar.s6 {
    public final int f32527a;
    public final Object f32528b;

    public x6(Object obj, int i10) {
        this.f32527a = i10;
        this.f32528b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f32527a;
    }

    @Override
    public final void b() {
        switch (this.f32527a) {
            case 0:
                ((i8) this.f32528b).v0();
                return;
            case 1:
                ((pl) this.f32528b).Y();
                return;
            case 2:
                uq uqVar = (uq) this.f32528b;
                org.telegram.ui.ActionBar.u0 u0Var = uqVar.I;
                u0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, uqVar.f31204d0));
                org.telegram.ui.ActionBar.k6.z1(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.I5, uqVar.f31204d0), u0Var.getBackground());
                u0Var.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, uqVar.f31204d0), false);
                u0Var.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, uqVar.f31204d0), true);
                u0Var.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, uqVar.f31204d0));
                return;
            case 3:
                ((nh0) this.f32528b).U();
                return;
            case 4:
                vo0 vo0Var = ((zo0) this.f32528b).f33324x0;
                if (vo0Var != null) {
                    vo0Var.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21574y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f32528b).run();
                return;
            case 6:
                ((sy0) this.f32528b).B0(false);
                return;
            default:
                ((h61) this.f32528b).d();
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
