package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class a7 implements org.telegram.ui.ActionBar.i6 {
    public final int f24522a;
    public final Object f24523b;

    public a7(Object obj, int i10) {
        this.f24522a = i10;
        this.f24523b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f24522a;
    }

    @Override
    public final void b() {
        switch (this.f24522a) {
            case 0:
                l8 l8Var = (l8) this.f24523b;
                l8Var.f28243l0.getSearchField().setCursorColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                org.telegram.ui.ActionBar.u0 u0Var = l8Var.f28230b0;
                u0Var.setIconColor(l8Var.getThemedColor(((Integer) u0Var.getTag()).intValue()));
                Drawable background = u0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.h6.f20913i6;
                org.telegram.ui.ActionBar.h6.C1(background, l8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.u0 u0Var2 = l8Var.N;
                u0Var2.setIconColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Wi));
                org.telegram.ui.ActionBar.h6.C1(u0Var2.getBackground(), l8Var.getThemedColor(i10), true);
                o90 o90Var = l8Var.S;
                o90Var.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ti));
                o90Var.setProgressColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Vi));
                l8Var.I0();
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                u0Var.B(l8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.h6.E8;
                u0Var2.G(l8Var.getThemedColor(i12), false);
                u0Var2.G(l8Var.getThemedColor(i12), true);
                u0Var2.B(l8Var.getThemedColor(i11));
                return;
            case 1:
                ck ckVar = (ck) this.f24523b;
                ai.w0 w0Var = ckVar.f25375s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof bk) {
                            ((bk) childAt).b();
                        }
                    }
                }
                ui uiVar = ckVar.I;
                if (uiVar != null) {
                    uiVar.e();
                    return;
                }
                return;
            case 2:
                xl xlVar = (xl) this.f24523b;
                xlVar.f33013r.setIconColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ui, xlVar.f30244a));
                xlVar.f33013r.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, xlVar.f30244a));
                xlVar.f33013r.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, xlVar.f30244a), true);
                xlVar.f33013r.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, xlVar.f30244a), false);
                if (xlVar.H != null) {
                    if (org.telegram.ui.ActionBar.h6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20822d6, xlVar.f30244a)) < 0.721f) {
                        if (!xlVar.U) {
                            xlVar.U = true;
                            xlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (xlVar.U) {
                        xlVar.U = false;
                        xlVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                cr crVar = (cr) this.f24523b;
                org.telegram.ui.ActionBar.u0 u0Var3 = crVar.I;
                u0Var3.setIconColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, crVar.f25455d0));
                org.telegram.ui.ActionBar.h6.x1(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, crVar.f25455d0), u0Var3.getBackground());
                u0Var3.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, crVar.f25455d0), false);
                u0Var3.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, crVar.f25455d0), true);
                u0Var3.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, crVar.f25455d0));
                return;
            case 4:
                ((db0) this.f24523b).Z();
                return;
            case 5:
                ((cf0) this.f24523b).s();
                return;
            case 6:
                ((th0) this.f24523b).T();
                return;
            case 7:
                NumberTextView numberTextView = ((ep0) this.f24523b).f26186x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21209y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f24523b).run();
                return;
            case 9:
                ((yy0) this.f24523b).A0(false);
                return;
            default:
                ((m61) this.f24523b).d();
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
