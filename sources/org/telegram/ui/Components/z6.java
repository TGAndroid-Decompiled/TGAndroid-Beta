package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class z6 implements org.telegram.ui.ActionBar.i6 {
    public final int f32865a;
    public final Object f32866b;

    public z6(Object obj, int i10) {
        this.f32865a = i10;
        this.f32866b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f32865a;
    }

    @Override
    public final void b() {
        switch (this.f32865a) {
            case 0:
                k8 k8Var = (k8) this.f32866b;
                k8Var.f27757l0.getSearchField().setCursorColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Oi));
                org.telegram.ui.ActionBar.u0 u0Var = k8Var.f27745b0;
                u0Var.setIconColor(k8Var.getThemedColor(((Integer) u0Var.getTag()).intValue()));
                Drawable background = u0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.h6.f21078i6;
                org.telegram.ui.ActionBar.h6.C1(background, k8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.u0 u0Var2 = k8Var.N;
                u0Var2.setIconColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Wi));
                org.telegram.ui.ActionBar.h6.C1(u0Var2.getBackground(), k8Var.getThemedColor(i10), true);
                g90 g90Var = k8Var.S;
                g90Var.setBackgroundColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ti));
                g90Var.setProgressColor(k8Var.getThemedColor(org.telegram.ui.ActionBar.h6.Vi));
                k8Var.I0();
                int i11 = org.telegram.ui.ActionBar.h6.G8;
                u0Var.B(k8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.h6.E8;
                u0Var2.G(k8Var.getThemedColor(i12), false);
                u0Var2.G(k8Var.getThemedColor(i12), true);
                u0Var2.B(k8Var.getThemedColor(i11));
                return;
            case 1:
                xj xjVar = (xj) this.f32866b;
                ai.u1 u1Var = xjVar.f32407s;
                if (u1Var != null) {
                    int childCount = u1Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = u1Var.getChildAt(i13);
                        if (childAt instanceof wj) {
                            ((wj) childAt).b();
                        }
                    }
                }
                pi piVar = xjVar.I;
                if (piVar != null) {
                    piVar.d();
                    return;
                }
                return;
            case 2:
                rl rlVar = (rl) this.f32866b;
                rlVar.f29987r.setIconColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ui, rlVar.f28224a));
                rlVar.f29987r.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, rlVar.f28224a));
                rlVar.f29987r.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, rlVar.f28224a), true);
                rlVar.f29987r.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, rlVar.f28224a), false);
                if (rlVar.H != null) {
                    if (org.telegram.ui.ActionBar.h6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20989d6, rlVar.f28224a)) < 0.721f) {
                        if (!rlVar.U) {
                            rlVar.U = true;
                            rlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (rlVar.U) {
                        rlVar.U = false;
                        rlVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                wq wqVar = (wq) this.f32866b;
                org.telegram.ui.ActionBar.u0 u0Var3 = wqVar.I;
                u0Var3.setIconColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, wqVar.f32195d0));
                org.telegram.ui.ActionBar.h6.x1(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.I5, wqVar.f32195d0), u0Var3.getBackground());
                u0Var3.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, wqVar.f32195d0), false);
                u0Var3.G(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, wqVar.f32195d0), true);
                u0Var3.B(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G8, wqVar.f32195d0));
                return;
            case 4:
                ((wa0) this.f32866b).Z();
                return;
            case 5:
                ((te0) this.f32866b).s();
                return;
            case 6:
                ((kh0) this.f32866b).T();
                return;
            case 7:
                NumberTextView numberTextView = ((vo0) this.f32866b).f31372x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21379y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f32866b).run();
                return;
            case 9:
                ((py0) this.f32866b).A0(false);
                return;
            default:
                ((c61) this.f32866b).d();
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
