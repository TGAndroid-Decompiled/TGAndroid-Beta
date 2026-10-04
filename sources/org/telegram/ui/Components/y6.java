package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class y6 implements org.telegram.ui.ActionBar.j6 {
    public final int f33094a;
    public final Object f33095b;

    public y6(Object obj, int i10) {
        this.f33094a = i10;
        this.f33095b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f33094a;
    }

    @Override
    public final void b() {
        switch (this.f33094a) {
            case 0:
                j8 j8Var = (j8) this.f33095b;
                j8Var.f27636l0.getSearchField().setCursorColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = j8Var.f27623b0;
                v0Var.setIconColor(j8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.i6.f20908i6;
                org.telegram.ui.ActionBar.i6.B1(background, j8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = j8Var.N;
                v0Var2.setIconColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Wi));
                org.telegram.ui.ActionBar.i6.B1(v0Var2.getBackground(), j8Var.getThemedColor(i10), true);
                a90 a90Var = j8Var.S;
                a90Var.setBackgroundColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ti));
                a90Var.setProgressColor(j8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Vi));
                j8Var.I0();
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                v0Var.B(j8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.i6.E8;
                v0Var2.G(j8Var.getThemedColor(i12), false);
                v0Var2.G(j8Var.getThemedColor(i12), true);
                v0Var2.B(j8Var.getThemedColor(i11));
                return;
            case 1:
                bk bkVar = (bk) this.f33095b;
                ai.w0 w0Var = bkVar.f24988s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
                        if (childAt instanceof ak) {
                            ((ak) childAt).b();
                        }
                    }
                }
                ti tiVar = bkVar.I;
                if (tiVar != null) {
                    tiVar.e();
                    return;
                }
                return;
            case 2:
                jl jlVar = (jl) this.f33095b;
                jlVar.f27820r.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ui, jlVar.f29641a));
                jlVar.f27820r.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, jlVar.f29641a));
                jlVar.f27820r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, jlVar.f29641a), true);
                jlVar.f27820r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, jlVar.f29641a), false);
                if (jlVar.H != null) {
                    if (org.telegram.ui.ActionBar.i6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20817d6, jlVar.f29641a)) < 0.721f) {
                        if (!jlVar.U) {
                            jlVar.U = true;
                            jlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (jlVar.U) {
                        jlVar.U = false;
                        jlVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                pq pqVar = (pq) this.f33095b;
                org.telegram.ui.ActionBar.v0 v0Var3 = pqVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, pqVar.f29714d0));
                org.telegram.ui.ActionBar.i6.w1(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, pqVar.f29714d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, pqVar.f29714d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, pqVar.f29714d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, pqVar.f29714d0));
                return;
            case 4:
                ((pa0) this.f33095b).Y();
                return;
            case 5:
                ((me0) this.f33095b).q();
                return;
            case 6:
                ((ch0) this.f33095b).Q();
                return;
            case 7:
                NumberTextView numberTextView = ((qo0) this.f33095b).f30138y0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21206y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f33095b).run();
                return;
            case 9:
                ((qy0) this.f33095b).z0(false);
                return;
            default:
                ((c61) this.f33095b).d();
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
