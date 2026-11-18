package org.telegram.ui.Components;
public final class w6 implements org.telegram.ui.ActionBar.v6 {
    public final int f41570a;
    public final Object f41571b;

    public w6(Object obj, int i7) {
        this.f41570a = i7;
        this.f41571b = obj;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f41570a;
    }

    @Override
    public final void b() {
        switch (this.f41570a) {
            case 0:
                ((g8) this.f41571b).L0();
                return;
            case 1:
                ((kl) this.f41571b).b0();
                return;
            case 2:
                kq kqVar = (kq) this.f41571b;
                org.telegram.ui.ActionBar.r0 r0Var = kqVar.J;
                r0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, kqVar.f36853e0));
                org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.I5, kqVar.f36853e0), r0Var.getBackground());
                r0Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, kqVar.f36853e0), false);
                r0Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, kqVar.f36853e0), true);
                r0Var.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, kqVar.f36853e0));
                return;
            case 3:
                ((df0) this.f41571b).N0();
                return;
            case 4:
                om0 om0Var = ((rm0) this.f41571b).A0;
                if (om0Var != null) {
                    om0Var.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29788y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f41571b).run();
                return;
            case 6:
                ((iw0) this.f41571b).Y0(false);
                return;
            default:
                ((h41) this.f41571b).d();
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
