package org.telegram.ui.Components;
public final class b7 implements org.telegram.ui.ActionBar.g7 {
    public final int f26752a;
    public final Object f26753b;

    public b7(Object obj, int i10) {
        this.f26752a = i10;
        this.f26753b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f26752a;
    }

    @Override
    public final void b() {
        switch (this.f26752a) {
            case 0:
                ((m8) this.f26753b).v0();
                return;
            case 1:
                ((sl) this.f26753b).Y();
                return;
            case 2:
                yq yqVar = (yq) this.f26753b;
                org.telegram.ui.ActionBar.w0 w0Var = yqVar.I;
                w0Var.setIconColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, yqVar.f35135d0));
                org.telegram.ui.ActionBar.y6.z1(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.I5, yqVar.f35135d0), w0Var.getBackground());
                w0Var.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, yqVar.f35135d0), false);
                w0Var.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, yqVar.f35135d0), true);
                w0Var.H(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, yqVar.f35135d0));
                return;
            case 3:
                ((oh0) this.f26753b).U();
                return;
            case 4:
                bp0 bp0Var = ((fp0) this.f26753b).f28265z0;
                if (bp0Var != null) {
                    bp0Var.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23751y8, false));
                    return;
                }
                return;
            case 5:
                ((Runnable) this.f26753b).run();
                return;
            case 6:
                ((dz0) this.f26753b).B0(false);
                return;
            default:
                ((q61) this.f26753b).d();
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
