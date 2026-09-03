package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class t6 implements org.telegram.ui.ActionBar.l6 {
    public final int f31278a;
    public final Object f31279b;

    public t6(Object obj, int i10) {
        this.f31278a = i10;
        this.f31279b = obj;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f31278a;
    }

    @Override
    public final void b() {
        switch (this.f31278a) {
            case 0:
                c8 c8Var = (c8) this.f31279b;
                c8Var.f25813i0.getSearchField().setCursorColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.Y;
                w0Var.setIconColor(c8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.k6.f21752i6;
                org.telegram.ui.ActionBar.k6.B1(background, c8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.K;
                w0Var2.setIconColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Wi));
                org.telegram.ui.ActionBar.k6.B1(w0Var2.getBackground(), c8Var.getThemedColor(i10), true);
                p80 p80Var = c8Var.P;
                p80Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ti));
                p80Var.setProgressColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.k6.Vi));
                c8Var.I0();
                int i11 = org.telegram.ui.ActionBar.k6.G8;
                w0Var.B(c8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.k6.E8;
                w0Var2.G(c8Var.getThemedColor(i12), false);
                w0Var2.G(c8Var.getThemedColor(i12), true);
                w0Var2.B(c8Var.getThemedColor(i11));
                return;
            case 1:
                sj sjVar = (sj) this.f31279b;
                mh.d1 d1Var = sjVar.f31069s;
                if (d1Var != null) {
                    int childCount = d1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = d1Var.getChildAt(i13);
                        if (childAt instanceof rj) {
                            ((rj) childAt).b();
                        }
                    }
                }
                ii iiVar = sjVar.F;
                if (iiVar != null) {
                    iiVar.e();
                    return;
                }
                return;
            case 2:
                cl clVar = (cl) this.f31279b;
                clVar.f25990r.setIconColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ui, clVar.f26589a));
                clVar.f25990r.B(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, clVar.f26589a));
                clVar.f25990r.G(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, clVar.f26589a), true);
                clVar.f25990r.G(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, clVar.f26589a), false);
                if (clVar.E != null) {
                    if (org.telegram.ui.ActionBar.k6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, clVar.f26589a)) < 0.721f) {
                        if (!clVar.R) {
                            clVar.R = true;
                            clVar.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (clVar.R) {
                        clVar.R = false;
                        clVar.E.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                mq mqVar = (mq) this.f31279b;
                org.telegram.ui.ActionBar.w0 w0Var3 = mqVar.F;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, mqVar.f29226a0));
                org.telegram.ui.ActionBar.k6.w1(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.I5, mqVar.f29226a0), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, mqVar.f29226a0), false);
                w0Var3.G(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.F8, mqVar.f29226a0), true);
                w0Var3.B(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G8, mqVar.f29226a0));
                return;
            case 4:
                ((fa0) this.f31279b).Z();
                return;
            case 5:
                ((fe0) this.f31279b).q();
                return;
            case 6:
                ((xg0) this.f31279b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((do0) this.f31279b).f26339u0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22040y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f31279b).run();
                return;
            case 9:
                ((xx0) this.f31279b).z0(false);
                return;
            default:
                ((d51) this.f31279b).d();
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
