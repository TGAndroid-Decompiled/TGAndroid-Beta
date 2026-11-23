package org.telegram.ui.Components;
public final class x6 implements org.telegram.ui.ActionBar.u6 {
    public final int f41941a;
    public final Object f41942b;

    public x6(Object obj, int i7) {
        this.f41941a = i7;
        this.f41942b = obj;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f41941a;
    }

    @Override
    public final void b() {
        switch (this.f41941a) {
            case 0:
                ((f8) this.f41942b).L0();
                return;
            case 1:
                ((ml) this.f41942b).b0();
                return;
            case 2:
                mq mqVar = (mq) this.f41942b;
                org.telegram.ui.ActionBar.q0 q0Var = mqVar.J;
                q0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, mqVar.f37563e0));
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I5, mqVar.f37563e0), q0Var.getBackground());
                q0Var.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, mqVar.f37563e0), false);
                q0Var.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, mqVar.f37563e0), true);
                q0Var.I(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, mqVar.f37563e0));
                return;
            case 3:
                ((ff0) this.f41942b).N0();
                return;
            case 4:
                qm0 qm0Var = ((tm0) this.f41942b).A0;
                if (qm0Var != null) {
                    qm0Var.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29741y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f41942b).run();
                return;
            case 6:
                ((kw0) this.f41942b).Y0(false);
                return;
            default:
                ((k41) this.f41942b).d();
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
