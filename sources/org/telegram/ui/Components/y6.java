package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class y6 implements org.telegram.ui.ActionBar.j6 {
    public final int f30590a;
    public final Object f30591b;

    public y6(Object obj, int i10) {
        this.f30590a = i10;
        this.f30591b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f30590a;
    }

    @Override
    public final void b() {
        switch (this.f30590a) {
            case 0:
                j8 j8Var = (j8) this.f30591b;
                j8Var.f25358l0.getSearchField().setCursorColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = j8Var.f25346b0;
                w0Var.setIconColor(j8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.i6.f19147i6;
                org.telegram.ui.ActionBar.i6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = j8Var.N;
                w0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Wi));
                org.telegram.ui.ActionBar.i6.B1(w0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                z80 z80Var = j8Var.S;
                z80Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ti));
                z80Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                w0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.i6.E8;
                w0Var2.G(j8Var.getThemedColor(i12), false);
                w0Var2.G(j8Var.getThemedColor(i12), true);
                w0Var2.B(j8Var.getThemedColor(i11));
                return;
            case 1:
                ak akVar = (ak) this.f30591b;
                ai.w0 w0Var3 = akVar.f22703s;
                if (w0Var3 != null) {
                    int childCount = w0Var3.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var3.getChildAt(i13);
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
                il ilVar = (il) this.f30591b;
                ilVar.f25185r.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ui, ilVar.f27103a));
                ilVar.f25185r.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, ilVar.f27103a));
                ilVar.f25185r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, ilVar.f27103a), true);
                ilVar.f25185r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, ilVar.f27103a), false);
                if (ilVar.H != null) {
                    if (org.telegram.ui.ActionBar.i6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, ilVar.f27103a)) < 0.721f) {
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
                oq oqVar = (oq) this.f30591b;
                org.telegram.ui.ActionBar.w0 w0Var4 = oqVar.I;
                w0Var4.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, oqVar.f27187d0));
                org.telegram.ui.ActionBar.i6.w1(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, oqVar.f27187d0), w0Var4.getBackground());
                w0Var4.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, oqVar.f27187d0), false);
                w0Var4.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, oqVar.f27187d0), true);
                w0Var4.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, oqVar.f27187d0));
                return;
            case 4:
                ((oa0) this.f30591b).Z();
                return;
            case 5:
                ((ke0) this.f30591b).q();
                return;
            case 6:
                ((ch0) this.f30591b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((mo0) this.f30591b).f26517y0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19444y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f30591b).run();
                return;
            case 9:
                ((hy0) this.f30591b).z0(false);
                return;
            default:
                ((t51) this.f30591b).d();
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
