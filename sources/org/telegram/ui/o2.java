package org.telegram.ui;

import org.telegram.messenger.Intro;
public final class o2 implements m2.f {
    public final int f36773a;
    public final Object f36774b;

    public o2(Object obj, int i10) {
        this.f36773a = i10;
        this.f36774b = obj;
    }

    @Override
    public final void a(int i10) {
        switch (this.f36773a) {
            case 0:
                s2 s2Var = (s2) this.f36774b;
                s2Var.v = i10;
                s2Var.f38174c.invalidate();
                return;
            case 1:
                ((u70) this.f36774b).E = i10;
                return;
            default:
                ((cd1) this.f36774b).X.invalidate();
                return;
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        switch (this.f36773a) {
            case 0:
                s2 s2Var = (s2) this.f36774b;
                float measuredWidth = s2Var.f38172a.getMeasuredWidth();
                if (measuredWidth != 0.0f) {
                    s2Var.f38178s = e2.c.d(s2Var.v, measuredWidth, (i10 * measuredWidth) + i11, measuredWidth);
                    s2Var.f38174c.invalidate();
                    return;
                }
                return;
            case 1:
                u70 u70Var = (u70) this.f36774b;
                org.telegram.ui.Components.ka kaVar = u70Var.e;
                kaVar.f26241b = f10;
                kaVar.f26242c = i10;
                kaVar.invalidate();
                float measuredWidth2 = u70Var.d.getMeasuredWidth();
                if (measuredWidth2 != 0.0f) {
                    Intro.setScrollOffset((((i10 * measuredWidth2) + i11) - (u70Var.E * measuredWidth2)) / measuredWidth2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void c(int i10) {
        switch (this.f36773a) {
            case 0:
                return;
            case 1:
                u70 u70Var = (u70) this.f36774b;
                if (i10 == 1) {
                    u70Var.H = true;
                    u70Var.d.getCurrentItem();
                    u70Var.d.getMeasuredWidth();
                    return;
                } else if (i10 == 0 || i10 == 2) {
                    if (u70Var.H) {
                        u70Var.H = false;
                    }
                    if (u70Var.f38868w != u70Var.d.getCurrentItem()) {
                        u70Var.f38868w = u70Var.d.getCurrentItem();
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(float f10, int i10, int i11) {
    }
}
