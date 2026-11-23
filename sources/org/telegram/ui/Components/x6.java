package org.telegram.ui.Components;
public final class x6 implements org.telegram.ui.ActionBar.u6 {
    public final int f41985a;
    public final Object f41986b;

    public x6(Object obj, int i7) {
        this.f41985a = i7;
        this.f41986b = obj;
    }

    @Override
    public final void a(float f10) {
        int i7 = this.f41985a;
    }

    @Override
    public final void b() {
        switch (this.f41985a) {
            case 0:
                ((f8) this.f41986b).L0();
                return;
            case 1:
                ((ml) this.f41986b).b0();
                return;
            case 2:
                mq mqVar = (mq) this.f41986b;
                org.telegram.ui.ActionBar.q0 q0Var = mqVar.J;
                q0Var.setIconColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, mqVar.f37608e0));
                org.telegram.ui.ActionBar.m6.C1(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.I5, mqVar.f37608e0), q0Var.getBackground());
                q0Var.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, mqVar.f37608e0), false);
                q0Var.P(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.F8, mqVar.f37608e0), true);
                q0Var.I(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G8, mqVar.f37608e0));
                return;
            case 3:
                ((ff0) this.f41986b).N0();
                return;
            case 4:
                rm0 rm0Var = ((um0) this.f41986b).A0;
                if (rm0Var != null) {
                    rm0Var.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29775y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f41986b).run();
                return;
            case 6:
                ((kw0) this.f41986b).Y0(false);
                return;
            default:
                ((k41) this.f41986b).d();
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
