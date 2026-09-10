package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class x6 implements org.telegram.ui.ActionBar.k6 {
    public final int f28954a;
    public final Object f28955b;

    public x6(Object obj, int i10) {
        this.f28954a = i10;
        this.f28955b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f28954a;
    }

    @Override
    public final void b() {
        switch (this.f28954a) {
            case 0:
                j8 j8Var = (j8) this.f28955b;
                j8Var.f24290l0.getSearchField().setCursorColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = j8Var.f24278b0;
                w0Var.setIconColor(j8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.f18017i6;
                org.telegram.ui.ActionBar.j6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = j8Var.N;
                w0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(w0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                w80 w80Var = j8Var.S;
                w80Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                w80Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                w0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                w0Var2.G(j8Var.getThemedColor(i12), false);
                w0Var2.G(j8Var.getThemedColor(i12), true);
                w0Var2.B(j8Var.getThemedColor(i11));
                return;
            case 1:
                bk bkVar = (bk) this.f28955b;
                bi.y1 y1Var = bkVar.f21845s;
                if (y1Var != null) {
                    int childCount = y1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = y1Var.getChildAt(i13);
                        if (childAt instanceof ak) {
                            ((ak) childAt).b();
                        }
                    }
                }
                ui uiVar = bkVar.I;
                if (uiVar != null) {
                    uiVar.e();
                    return;
                }
                return;
            case 2:
                ll llVar = (ll) this.f28955b;
                llVar.f25041r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, llVar.f26421a));
                llVar.f25041r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, llVar.f26421a));
                llVar.f25041r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, llVar.f26421a), true);
                llVar.f25041r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, llVar.f26421a), false);
                if (llVar.H != null) {
                    if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, llVar.f26421a)) < 0.721f) {
                        if (!llVar.U) {
                            llVar.U = true;
                            llVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (llVar.U) {
                        llVar.U = false;
                        llVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                sq sqVar = (sq) this.f28955b;
                org.telegram.ui.ActionBar.w0 w0Var3 = sqVar.I;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, sqVar.f27157d0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, sqVar.f27157d0), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, sqVar.f27157d0), false);
                w0Var3.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, sqVar.f27157d0), true);
                w0Var3.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, sqVar.f27157d0));
                return;
            case 4:
                ((la0) this.f28955b).Z();
                return;
            case 5:
                ((je0) this.f28955b).q();
                return;
            case 6:
                ((zg0) this.f28955b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((ho0) this.f28955b).f23734x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18308y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f28955b).run();
                return;
            case 9:
                ((hy0) this.f28955b).z0(false);
                return;
            default:
                ((r51) this.f28955b).d();
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
