package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class y6 implements org.telegram.ui.ActionBar.i6 {
    public final int f30585a;
    public final Object f30586b;

    public y6(Object obj, int i10) {
        this.f30585a = i10;
        this.f30586b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f30585a;
    }

    @Override
    public final void b() {
        switch (this.f30585a) {
            case 0:
                j8 j8Var = (j8) this.f30586b;
                j8Var.f25343l0.getSearchField().setCursorColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                org.telegram.ui.ActionBar.u0 u0Var = j8Var.f25331b0;
                u0Var.setIconColor(j8Var.getThemedColor(((Integer) u0Var.getTag()).intValue()));
                Drawable background = u0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.h6.f19148i6;
                org.telegram.ui.ActionBar.h6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.u0 u0Var2 = j8Var.N;
                u0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Wi));
                org.telegram.ui.ActionBar.h6.B1(u0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                z80 z80Var = j8Var.S;
                z80Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ti));
                z80Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                u0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.h6.E8;
                u0Var2.G(j8Var.getThemedColor(i12), false);
                u0Var2.G(j8Var.getThemedColor(i12), true);
                u0Var2.B(j8Var.getThemedColor(i11));
                return;
            case 1:
                ak akVar = (ak) this.f30586b;
                ai.w0 w0Var = akVar.f22680s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof zj) {
                            ((zj) childAt).b();
                        }
                    }
                }
                si siVar = akVar.I;
                if (siVar != null) {
                    siVar.e();
                    return;
                }
                return;
            case 2:
                il ilVar = (il) this.f30586b;
                ilVar.f25163r.setIconColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ui, ilVar.f27075a));
                ilVar.f25163r.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, ilVar.f27075a));
                ilVar.f25163r.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, ilVar.f27075a), true);
                ilVar.f25163r.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, ilVar.f27075a), false);
                if (ilVar.H != null) {
                    if (org.telegram.ui.ActionBar.h6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, ilVar.f27075a)) < 0.721f) {
                        if (!ilVar.U) {
                            ilVar.U = true;
                            ilVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (ilVar.U) {
                        ilVar.U = false;
                        ilVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                oq oqVar = (oq) this.f30586b;
                org.telegram.ui.ActionBar.u0 u0Var3 = oqVar.I;
                u0Var3.setIconColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, oqVar.f27164d0));
                org.telegram.ui.ActionBar.h6.w1(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I5, oqVar.f27164d0), u0Var3.getBackground());
                u0Var3.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.E8, oqVar.f27164d0), false);
                u0Var3.G(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, oqVar.f27164d0), true);
                u0Var3.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G8, oqVar.f27164d0));
                return;
            case 4:
                ((pa0) this.f30586b).Z();
                return;
            case 5:
                ((me0) this.f30586b).q();
                return;
            case 6:
                ((ch0) this.f30586b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((no0) this.f30586b).f26840x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19444y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f30586b).run();
                return;
            case 9:
                ((hy0) this.f30586b).z0(false);
                return;
            default:
                ((t51) this.f30586b).d();
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
