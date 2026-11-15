package org.telegram.ui.Components;
public final class q6 implements org.telegram.ui.ActionBar.r6 {
    public final int f38532a;
    public final Object f38533b;

    public q6(Object obj, int i7) {
        this.f38532a = i7;
        this.f38533b = obj;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f38532a;
    }

    @Override
    public final void b() {
        switch (this.f38532a) {
            case 0:
                ((y7) this.f38533b).K0();
                return;
            case 1:
                ((dl) this.f38533b).b0();
                return;
            case 2:
                dq dqVar = (dq) this.f38533b;
                org.telegram.ui.ActionBar.q0 q0Var = dqVar.J;
                q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, dqVar.f34025e0));
                org.telegram.ui.ActionBar.j6.C1(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.I5, dqVar.f34025e0), q0Var.getBackground());
                q0Var.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, dqVar.f34025e0), false);
                q0Var.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, dqVar.f34025e0), true);
                q0Var.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, dqVar.f34025e0));
                return;
            case 3:
                ((te0) this.f38533b).M0();
                return;
            case 4:
                gm0 gm0Var = ((jm0) this.f38533b).A0;
                if (gm0Var != null) {
                    gm0Var.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29243y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f38533b).run();
                return;
            case 6:
                ((bw0) this.f38533b).X0(false);
                return;
            default:
                ((x31) this.f38533b).d();
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
