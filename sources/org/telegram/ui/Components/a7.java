package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class a7 implements org.telegram.ui.ActionBar.i6 {
    public final int f24246a;
    public final Object f24247b;

    public a7(Object obj, int i10) {
        this.f24246a = i10;
        this.f24247b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f24246a;
    }

    @Override
    public final void b() {
        switch (this.f24246a) {
            case 0:
                l8 l8Var = (l8) this.f24247b;
                l8Var.f28068l0.getSearchField().setCursorColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                org.telegram.ui.ActionBar.u0 u0Var = l8Var.f28055b0;
                u0Var.setIconColor(l8Var.getThemedColor(((Integer) u0Var.getTag()).intValue()));
                Drawable background = u0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.h6.f20651i6;
                org.telegram.ui.ActionBar.h6.C1(background, l8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.u0 u0Var2 = l8Var.N;
                u0Var2.setIconColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Wi));
                org.telegram.ui.ActionBar.h6.C1(u0Var2.getBackground(), l8Var.getThemedColor(i10), true);
                s90 s90Var = l8Var.S;
                s90Var.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ti));
                s90Var.setProgressColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Vi));
                l8Var.I0();
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                u0Var.B(l8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.h6.E8;
                u0Var2.G(l8Var.getThemedColor(i12), false);
                u0Var2.G(l8Var.getThemedColor(i12), true);
                u0Var2.B(l8Var.getThemedColor(i11));
                return;
            case 1:
                ek ekVar = (ek) this.f24247b;
                ai.w0 w0Var = ekVar.f25718s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof dk) {
                            ((dk) childAt).b();
                        }
                    }
                }
                wi wiVar = ekVar.I;
                if (wiVar != null) {
                    wiVar.e();
                    return;
                }
                return;
            case 2:
                zl zlVar = (zl) this.f24247b;
                zlVar.f33417r.setIconColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ui, zlVar.f30569a));
                zlVar.f33417r.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, zlVar.f30569a));
                zlVar.f33417r.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, zlVar.f30569a), true);
                zlVar.f33417r.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, zlVar.f30569a), false);
                if (zlVar.H != null) {
                    if (org.telegram.ui.ActionBar.h6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, zlVar.f30569a)) < 0.721f) {
                        if (!zlVar.U) {
                            zlVar.U = true;
                            zlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (zlVar.U) {
                        zlVar.U = false;
                        zlVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                er erVar = (er) this.f24247b;
                org.telegram.ui.ActionBar.u0 u0Var3 = erVar.I;
                u0Var3.setIconColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, erVar.f25771d0));
                org.telegram.ui.ActionBar.h6.x1(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, erVar.f25771d0), u0Var3.getBackground());
                u0Var3.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, erVar.f25771d0), false);
                u0Var3.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, erVar.f25771d0), true);
                u0Var3.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, erVar.f25771d0));
                return;
            case 4:
                ((hb0) this.f24247b).Z();
                return;
            case 5:
                ((ff0) this.f24247b).s();
                return;
            case 6:
                ((wh0) this.f24247b).T();
                return;
            case 7:
                NumberTextView numberTextView = ((jp0) this.f24247b).f27619x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20948y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f24247b).run();
                return;
            case 9:
                ((dz0) this.f24247b).A0(false);
                return;
            default:
                ((q61) this.f24247b).d();
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
