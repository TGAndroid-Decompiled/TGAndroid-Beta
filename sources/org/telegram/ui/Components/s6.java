package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;

public final class s6 implements org.telegram.ui.ActionBar.h6 {

    public final int f32342a;

    public final Object f32343b;

    public s6(Object obj, int i10) {
        this.f32342a = i10;
        this.f32343b = obj;
    }

    @Override
    public final void a(float f10) {
        int i10 = this.f32342a;
    }

    @Override
    public final void b() {
        switch (this.f32342a) {
            case 0:
                b8 b8Var = (b8) this.f32343b;
                b8Var.f27021h0.getSearchField().setCursorColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = b8Var.X;
                v0Var.setIconColor(b8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.g6.f23144i6;
                org.telegram.ui.ActionBar.g6.B1(background, b8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = b8Var.J;
                v0Var2.setIconColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Wi));
                org.telegram.ui.ActionBar.g6.B1(v0Var2.getBackground(), b8Var.getThemedColor(i10), true);
                z70 z70Var = b8Var.O;
                z70Var.setBackgroundColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
                z70Var.setProgressColor(b8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
                b8Var.I0();
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                v0Var.B(b8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.g6.E8;
                v0Var2.G(b8Var.getThemedColor(i12), false);
                v0Var2.G(b8Var.getThemedColor(i12), true);
                v0Var2.B(b8Var.getThemedColor(i11));
                break;
            case 1:
                lj ljVar = (lj) this.f32343b;
                hh.f1 f1Var = ljVar.f30397s;
                if (f1Var != null) {
                    int childCount = f1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = f1Var.getChildAt(i13);
                        if (childAt instanceof kj) {
                            ((kj) childAt).b();
                        }
                    }
                }
                ci ciVar = ljVar.E;
                if (ciVar != null) {
                    ciVar.d();
                }
                break;
            case 2:
                tk tkVar = (tk) this.f32343b;
                tkVar.f32815r.setIconColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ui, tkVar.f34899a));
                tkVar.f32815r.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, tkVar.f34899a));
                tkVar.f32815r.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, tkVar.f34899a), true);
                tkVar.f32815r.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, tkVar.f34899a), false);
                if (tkVar.D != null) {
                    if (!org.telegram.ui.ActionBar.g6.I.q() && AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, tkVar.f34899a)) >= 0.721f) {
                        if (tkVar.Q) {
                            tkVar.Q = false;
                            tkVar.D.setMapStyle(null);
                        }
                    } else if (!tkVar.Q) {
                        tkVar.Q = true;
                        tkVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                    }
                }
                break;
            case 3:
                aq aqVar = (aq) this.f32343b;
                org.telegram.ui.ActionBar.v0 v0Var3 = aqVar.E;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, aqVar.W));
                org.telegram.ui.ActionBar.g6.w1(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I5, aqVar.W), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, aqVar.W), false);
                v0Var3.G(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.F8, aqVar.W), true);
                v0Var3.B(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G8, aqVar.W));
                break;
            case 4:
                ((o90) this.f32343b).Z();
                break;
            case 5:
                ((md0) this.f32343b).r();
                break;
            case 6:
                ((cg0) this.f32343b).S();
                break;
            case 7:
                NumberTextView numberTextView = ((jn0) this.f32343b).f29760t0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23425y8, false));
                }
                break;
            case 8:
                ((Runnable) this.f32343b).run();
                break;
            case 9:
                ((ex0) this.f32343b).z0(false);
                break;
            default:
                ((j41) this.f32343b).d();
                break;
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
