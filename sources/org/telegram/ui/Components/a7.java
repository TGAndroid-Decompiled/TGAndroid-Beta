package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class a7 implements org.telegram.ui.ActionBar.j6 {
    public final int f24498a;
    public final Object f24499b;

    public a7(Object obj, int i10) {
        this.f24498a = i10;
        this.f24499b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f24498a;
    }

    @Override
    public final void b() {
        switch (this.f24498a) {
            case 0:
                l8 l8Var = (l8) this.f24499b;
                l8Var.f28204l0.getSearchField().setCursorColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = l8Var.f28191b0;
                v0Var.setIconColor(l8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.i6.f20892i6;
                org.telegram.ui.ActionBar.i6.C1(background, l8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = l8Var.N;
                v0Var2.setIconColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Wi));
                org.telegram.ui.ActionBar.i6.C1(v0Var2.getBackground(), l8Var.getThemedColor(i10), true);
                p90 p90Var = l8Var.S;
                p90Var.setBackgroundColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ti));
                p90Var.setProgressColor(l8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Vi));
                l8Var.I0();
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                v0Var.B(l8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.i6.E8;
                v0Var2.G(l8Var.getThemedColor(i12), false);
                v0Var2.G(l8Var.getThemedColor(i12), true);
                v0Var2.B(l8Var.getThemedColor(i11));
                return;
            case 1:
                ck ckVar = (ck) this.f24499b;
                ai.w0 w0Var = ckVar.f25313s;
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
                xl xlVar = (xl) this.f24499b;
                xlVar.f32975r.setIconColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ui, xlVar.f30210a));
                xlVar.f32975r.B(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, xlVar.f30210a));
                xlVar.f32975r.G(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, xlVar.f30210a), true);
                xlVar.f32975r.G(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, xlVar.f30210a), false);
                if (xlVar.H != null) {
                    if (org.telegram.ui.ActionBar.i6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, xlVar.f30210a)) < 0.721f) {
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
                cr crVar = (cr) this.f24499b;
                org.telegram.ui.ActionBar.v0 v0Var3 = crVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, crVar.f25393d0));
                org.telegram.ui.ActionBar.i6.x1(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I5, crVar.f25393d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.E8, crVar.f25393d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, crVar.f25393d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G8, crVar.f25393d0));
                return;
            case 4:
                ((eb0) this.f24499b).Z();
                return;
            case 5:
                ((df0) this.f24499b).s();
                return;
            case 6:
                ((th0) this.f24499b).T();
                return;
            case 7:
                NumberTextView numberTextView = ((ep0) this.f24499b).f26148x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21187y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f24499b).run();
                return;
            case 9:
                ((yy0) this.f24499b).A0(false);
                return;
            default:
                ((m61) this.f24499b).d();
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
