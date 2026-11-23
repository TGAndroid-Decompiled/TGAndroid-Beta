package org.telegram.ui.Components;
public final class w6 implements org.telegram.ui.ActionBar.v6 {
    public final int f41520a;
    public final Object f41521b;

    public w6(Object obj, int i7) {
        this.f41520a = i7;
        this.f41521b = obj;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f41520a;
    }

    @Override
    public final void b() {
        switch (this.f41520a) {
            case 0:
                ((e8) this.f41521b).L0();
                return;
            case 1:
                ((kl) this.f41521b).b0();
                return;
            case 2:
                jq jqVar = (jq) this.f41521b;
                org.telegram.ui.ActionBar.q0 q0Var = jqVar.J;
                q0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, jqVar.f36487e0));
                org.telegram.ui.ActionBar.n6.C1(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.I5, jqVar.f36487e0), q0Var.getBackground());
                q0Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, jqVar.f36487e0), false);
                q0Var.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, jqVar.f36487e0), true);
                q0Var.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, jqVar.f36487e0));
                return;
            case 3:
                ((ef0) this.f41521b).N0();
                return;
            case 4:
                qm0 qm0Var = ((tm0) this.f41521b).A0;
                if (qm0Var != null) {
                    qm0Var.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29845y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f41521b).run();
                return;
            case 6:
                ((jw0) this.f41521b).Y0(false);
                return;
            default:
                ((j41) this.f41521b).d();
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
