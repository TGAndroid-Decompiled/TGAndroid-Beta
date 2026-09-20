package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class x6 implements org.telegram.ui.ActionBar.k6 {
    public final int f30176a;
    public final Object f30177b;

    public x6(Object obj, int i10) {
        this.f30176a = i10;
        this.f30177b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f30176a;
    }

    @Override
    public final void b() {
        switch (this.f30176a) {
            case 0:
                i8 i8Var = (i8) this.f30177b;
                i8Var.f24923l0.getSearchField().setCursorColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = i8Var.f24911b0;
                v0Var.setIconColor(i8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.f19184i6;
                org.telegram.ui.ActionBar.j6.B1(background, i8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = i8Var.N;
                v0Var2.setIconColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(v0Var2.getBackground(), i8Var.getThemedColor(i10), true);
                u80 u80Var = i8Var.S;
                u80Var.setBackgroundColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                u80Var.setProgressColor(i8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                i8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                v0Var.B(i8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                v0Var2.G(i8Var.getThemedColor(i12), false);
                v0Var2.G(i8Var.getThemedColor(i12), true);
                v0Var2.B(i8Var.getThemedColor(i11));
                return;
            case 1:
                yj yjVar = (yj) this.f30177b;
                ai.w0 w0Var = yjVar.f30565s;
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
                gl glVar = (gl) this.f30177b;
                glVar.f24401r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, glVar.f26654a));
                glVar.f24401r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, glVar.f26654a));
                glVar.f24401r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, glVar.f26654a), true);
                glVar.f24401r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, glVar.f26654a), false);
                if (glVar.H != null) {
                    if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, glVar.f26654a)) < 0.721f) {
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
                mq mqVar = (mq) this.f30177b;
                org.telegram.ui.ActionBar.v0 v0Var3 = mqVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, mqVar.f26470d0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, mqVar.f26470d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, mqVar.f26470d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, mqVar.f26470d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, mqVar.f26470d0));
                return;
            case 4:
                ((ja0) this.f30177b).Z();
                return;
            case 5:
                ((ie0) this.f30177b).q();
                return;
            case 6:
                ((zg0) this.f30177b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((lo0) this.f30177b).f26217y0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19479y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f30177b).run();
                return;
            case 9:
                ((gy0) this.f30177b).z0(false);
                return;
            default:
                ((s51) this.f30177b).d();
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
