package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class s6 implements org.telegram.ui.ActionBar.g6 {
    public final int f32379a;
    public final Object f32380b;

    public s6(Object obj, int i9) {
        this.f32379a = i9;
        this.f32380b = obj;
    }

    @Override
    public final void a(float f10) {
        int i9 = this.f32379a;
    }

    @Override
    public final void b() {
        switch (this.f32379a) {
            case 0:
                c8 c8Var = (c8) this.f32380b;
                c8Var.f27389h0.getSearchField().setCursorColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = c8Var.X;
                w0Var.setIconColor(c8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i9 = org.telegram.ui.ActionBar.f6.f23092i6;
                org.telegram.ui.ActionBar.f6.B1(background, c8Var.getThemedColor(i9), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = c8Var.J;
                w0Var2.setIconColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Wi));
                org.telegram.ui.ActionBar.f6.B1(w0Var2.getBackground(), c8Var.getThemedColor(i9), true);
                v70 v70Var = c8Var.O;
                v70Var.setBackgroundColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ti));
                v70Var.setProgressColor(c8Var.getThemedColor(org.telegram.ui.ActionBar.f6.Vi));
                c8Var.H0();
                int i10 = org.telegram.ui.ActionBar.f6.G8;
                w0Var.B(c8Var.getThemedColor(i10));
                int i11 = org.telegram.ui.ActionBar.f6.E8;
                w0Var2.G(c8Var.getThemedColor(i11), false);
                w0Var2.G(c8Var.getThemedColor(i11), true);
                w0Var2.B(c8Var.getThemedColor(i10));
                return;
            case 1:
                pj pjVar = (pj) this.f32380b;
                gh.f1 f1Var = pjVar.f31679s;
                if (f1Var != null) {
                    int childCount = f1Var.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = f1Var.getChildAt(i12);
                        if (childAt instanceof oj) {
                            ((oj) childAt).b();
                        }
                    }
                }
                gi giVar = pjVar.E;
                if (giVar != null) {
                    giVar.d();
                    return;
                }
                return;
            case 2:
                xk xkVar = (xk) this.f32380b;
                xkVar.f34705r.setIconColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ui, xkVar.f27492a));
                xkVar.f34705r.B(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, xkVar.f27492a));
                xkVar.f34705r.G(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, xkVar.f27492a), true);
                xkVar.f34705r.G(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, xkVar.f27492a), false);
                if (xkVar.D != null) {
                    if (org.telegram.ui.ActionBar.f6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, xkVar.f27492a)) < 0.721f) {
                        if (!xkVar.Q) {
                            xkVar.Q = true;
                            xkVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (xkVar.Q) {
                        xkVar.Q = false;
                        xkVar.D.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                cq cqVar = (cq) this.f32380b;
                org.telegram.ui.ActionBar.w0 w0Var3 = cqVar.E;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, cqVar.W));
                org.telegram.ui.ActionBar.f6.w1(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I5, cqVar.W), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, cqVar.W), false);
                w0Var3.G(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, cqVar.W), true);
                w0Var3.B(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G8, cqVar.W));
                return;
            case 4:
                ((k90) this.f32380b).Y();
                return;
            case 5:
                ((hd0) this.f32380b).q();
                return;
            case 6:
                ((ag0) this.f32380b).R();
                return;
            case 7:
                NumberTextView numberTextView = ((hn0) this.f32380b).f29153t0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23371y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f32380b).run();
                return;
            case 9:
                ((cx0) this.f32380b).y0(false);
                return;
            default:
                ((h41) this.f32380b).d();
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
