package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class x6 implements org.telegram.ui.ActionBar.h6 {
    public final int f34602a;
    public final Object f34603b;

    public x6(Object obj, int i10) {
        this.f34602a = i10;
        this.f34603b = obj;
    }

    @Override
    public final void a(float f9) {
        int i10 = this.f34602a;
    }

    @Override
    public final void b() {
        switch (this.f34602a) {
            case 0:
                g8 g8Var = (g8) this.f34603b;
                g8Var.f28787h0.getSearchField().setCursorColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = g8Var.X;
                w0Var.setIconColor(g8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.g6.f23152i6;
                org.telegram.ui.ActionBar.g6.B1(background, g8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = g8Var.J;
                w0Var2.setIconColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Wi));
                org.telegram.ui.ActionBar.g6.B1(w0Var2.getBackground(), g8Var.getThemedColor(i10), true);
                i80 i80Var = g8Var.O;
                i80Var.setBackgroundColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
                i80Var.setProgressColor(g8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
                g8Var.I0();
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                w0Var.B(g8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.g6.E8;
                w0Var2.G(g8Var.getThemedColor(i12), false);
                w0Var2.G(g8Var.getThemedColor(i12), true);
                w0Var2.B(g8Var.getThemedColor(i11));
                return;
            case 1:
                sj sjVar = (sj) this.f34603b;
                jh.e1 e1Var = sjVar.f32656s;
                if (e1Var != null) {
                    int childCount = e1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = e1Var.getChildAt(i13);
                        if (childAt instanceof rj) {
                            ((rj) childAt).b();
                        }
                    }
                }
                ji jiVar = sjVar.E;
                if (jiVar != null) {
                    jiVar.e();
                    return;
                }
                return;
            case 2:
                bl blVar = (bl) this.f34603b;
                blVar.f27169r.setIconColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ui, blVar.f28402a));
                blVar.f27169r.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, blVar.f28402a));
                blVar.f27169r.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, blVar.f28402a), true);
                blVar.f27169r.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, blVar.f28402a), false);
                if (blVar.D != null) {
                    if (org.telegram.ui.ActionBar.g6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, blVar.f28402a)) < 0.721f) {
                        if (!blVar.Q) {
                            blVar.Q = true;
                            blVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (blVar.Q) {
                        blVar.Q = false;
                        blVar.D.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                gq gqVar = (gq) this.f34603b;
                org.telegram.ui.ActionBar.w0 w0Var3 = gqVar.E;
                w0Var3.setIconColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, gqVar.W));
                org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, gqVar.W), w0Var3.getBackground());
                w0Var3.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, gqVar.W), false);
                w0Var3.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, gqVar.W), true);
                w0Var3.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, gqVar.W));
                return;
            case 4:
                ((y90) this.f34603b).Z();
                return;
            case 5:
                ((vd0) this.f34603b).q();
                return;
            case 6:
                ((lg0) this.f34603b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((tn0) this.f34603b).f33006t0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f34603b).run();
                return;
            case 9:
                ((nx0) this.f34603b).z0(false);
                return;
            default:
                ((s41) this.f34603b).d();
                return;
        }
    }

    private final void c(float f9) {
    }

    private final void d(float f9) {
    }

    private final void e(float f9) {
    }

    private final void f(float f9) {
    }

    private final void g(float f9) {
    }

    private final void h(float f9) {
    }

    private final void i(float f9) {
    }

    private final void j(float f9) {
    }

    private final void k(float f9) {
    }

    private final void l(float f9) {
    }

    private final void m(float f9) {
    }
}
