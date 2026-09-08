package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class z6 implements org.telegram.ui.ActionBar.k6 {
    public final int f33112a;
    public final Object f33113b;

    public z6(Object obj, int i10) {
        this.f33112a = i10;
        this.f33113b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f33112a;
    }

    @Override
    public final void b() {
        switch (this.f33112a) {
            case 0:
                k8 k8Var = (k8) this.f33113b;
                k8Var.f27755l0.getSearchField().setCursorColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = k8Var.f27742b0;
                v0Var.setIconColor(k8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.f20780i6;
                org.telegram.ui.ActionBar.j6.B1(background, k8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = k8Var.N;
                v0Var2.setIconColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(v0Var2.getBackground(), k8Var.getThemedColor(i10), true);
                m80 m80Var = k8Var.S;
                m80Var.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                m80Var.setProgressColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                k8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                v0Var.B(k8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                v0Var2.G(k8Var.getThemedColor(i12), false);
                v0Var2.G(k8Var.getThemedColor(i12), true);
                v0Var2.B(k8Var.getThemedColor(i11));
                return;
            case 1:
                yj yjVar = (yj) this.f33113b;
                bi.o0 o0Var = yjVar.f32960s;
                if (o0Var != null) {
                    int childCount = o0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = o0Var.getChildAt(i13);
                        if (childAt instanceof xj) {
                            ((xj) childAt).b();
                        }
                    }
                }
                ri riVar = yjVar.I;
                if (riVar != null) {
                    riVar.d();
                    return;
                }
                return;
            case 2:
                gl glVar = (gl) this.f33113b;
                glVar.f26472r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, glVar.f28779a));
                glVar.f26472r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, glVar.f28779a));
                glVar.f26472r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, glVar.f28779a), true);
                glVar.f26472r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, glVar.f28779a), false);
                if (glVar.H != null) {
                    if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20690d6, glVar.f28779a)) < 0.721f) {
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
                lq lqVar = (lq) this.f33113b;
                org.telegram.ui.ActionBar.v0 v0Var3 = lqVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, lqVar.f28309d0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, lqVar.f28309d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, lqVar.f28309d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, lqVar.f28309d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, lqVar.f28309d0));
                return;
            case 4:
                ((ca0) this.f33113b).Z();
                return;
            case 5:
                ((ae0) this.f33113b).q();
                return;
            case 6:
                ((pg0) this.f33113b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((yn0) this.f33113b).f32998x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21071y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f33113b).run();
                return;
            case 9:
                ((ux0) this.f33113b).z0(false);
                return;
            default:
                ((d51) this.f33113b).d();
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
