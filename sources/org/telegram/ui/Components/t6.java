package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class t6 implements org.telegram.ui.ActionBar.k6 {
    public final int f28904a;
    public final Object f28905b;

    public t6(Object obj, int i10) {
        this.f28904a = i10;
        this.f28905b = obj;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f28904a;
    }

    @Override
    public final void b() {
        switch (this.f28904a) {
            case 0:
                c8 c8Var = (c8) this.f28905b;
                c8Var.f23851i0.getSearchField().setCursorColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.Y;
                w0Var.setIconColor(c8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.f19971i6;
                org.telegram.ui.ActionBar.j6.B1(background, c8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.K;
                w0Var2.setIconColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(w0Var2.getBackground(), c8Var.getThemedColor(i10), true);
                o80 o80Var = c8Var.P;
                o80Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                o80Var.setProgressColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                c8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                w0Var.B(c8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                w0Var2.G(c8Var.getThemedColor(i12), false);
                w0Var2.G(c8Var.getThemedColor(i12), true);
                w0Var2.B(c8Var.getThemedColor(i11));
                return;
            case 1:
                qj qjVar = (qj) this.f28905b;
                lh.e1 e1Var = qjVar.f28194s;
                if (e1Var != null) {
                    int childCount = e1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = e1Var.getChildAt(i13);
                        if (childAt instanceof pj) {
                            ((pj) childAt).b();
                        }
                    }
                }
                hi hiVar = qjVar.F;
                if (hiVar != null) {
                    hiVar.e();
                    return;
                }
                return;
            case 2:
                al alVar = (al) this.f28905b;
                alVar.f23416r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, alVar.f24281a));
                alVar.f23416r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, alVar.f24281a));
                alVar.f23416r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, alVar.f24281a), true);
                alVar.f23416r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, alVar.f24281a), false);
                if (alVar.E != null) {
                    if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, alVar.f24281a)) < 0.721f) {
                        if (!alVar.R) {
                            alVar.R = true;
                            alVar.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (alVar.R) {
                        alVar.R = false;
                        alVar.E.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                jq jqVar = (jq) this.f28905b;
                org.telegram.ui.ActionBar.w0 w0Var3 = jqVar.F;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, jqVar.f26025a0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, jqVar.f26025a0), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, jqVar.f26025a0), false);
                w0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, jqVar.f26025a0), true);
                w0Var3.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, jqVar.f26025a0));
                return;
            case 4:
                ((ea0) this.f28905b).Z();
                return;
            case 5:
                ((ee0) this.f28905b).q();
                return;
            case 6:
                ((wg0) this.f28905b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((co0) this.f28905b).f24002u0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20258y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f28905b).run();
                return;
            case 9:
                ((xx0) this.f28905b).z0(false);
                return;
            default:
                ((e51) this.f28905b).d();
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

    private final void k(float f10) {
    }

    private final void l(float f10) {
    }

    private final void m(float f10) {
    }
}
