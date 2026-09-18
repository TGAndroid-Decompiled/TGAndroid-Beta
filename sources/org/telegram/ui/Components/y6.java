package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class y6 implements org.telegram.ui.ActionBar.k6 {
    public final int f30484a;
    public final Object f30485b;

    public y6(Object obj, int i10) {
        this.f30484a = i10;
        this.f30485b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f30484a;
    }

    @Override
    public final void b() {
        switch (this.f30484a) {
            case 0:
                j8 j8Var = (j8) this.f30485b;
                j8Var.f25214l0.getSearchField().setCursorColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.f25202b0;
                v0Var.setIconColor(j8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.f19152i6;
                org.telegram.ui.ActionBar.j6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.N;
                v0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(v0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                v80 v80Var = j8Var.S;
                v80Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                v80Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                v0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                v0Var2.G(j8Var.getThemedColor(i12), false);
                v0Var2.G(j8Var.getThemedColor(i12), true);
                v0Var2.B(j8Var.getThemedColor(i11));
                return;
            case 1:
                yj yjVar = (yj) this.f30485b;
                ai.w0 w0Var = yjVar.f30603s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof xj) {
                            ((xj) childAt).b();
                        }
                    }
                }
                ri riVar = yjVar.I;
                if (riVar != null) {
                    riVar.e();
                    return;
                }
                return;
            case 2:
                gl glVar = (gl) this.f30485b;
                glVar.f24442r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, glVar.f26687a));
                glVar.f24442r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, glVar.f26687a));
                glVar.f24442r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, glVar.f26687a), true);
                glVar.f24442r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, glVar.f26687a), false);
                if (glVar.H != null) {
                    if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19062d6, glVar.f26687a)) < 0.721f) {
                        if (!glVar.U) {
                            glVar.U = true;
                            glVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (glVar.U) {
                        glVar.U = false;
                        glVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                mq mqVar = (mq) this.f30485b;
                org.telegram.ui.ActionBar.v0 v0Var3 = mqVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, mqVar.f26501d0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, mqVar.f26501d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, mqVar.f26501d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, mqVar.f26501d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, mqVar.f26501d0));
                return;
            case 4:
                ((ka0) this.f30485b).Z();
                return;
            case 5:
                ((je0) this.f30485b).q();
                return;
            case 6:
                ((ah0) this.f30485b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((lo0) this.f30485b).f26228y0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19447y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f30485b).run();
                return;
            case 9:
                ((hy0) this.f30485b).z0(false);
                return;
            default:
                ((t51) this.f30485b).d();
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

    private final void k(float f7) {
    }

    private final void l(float f7) {
    }

    private final void m(float f7) {
    }
}
