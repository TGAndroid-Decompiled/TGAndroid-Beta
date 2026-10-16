package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class b7 implements org.telegram.ui.ActionBar.h6 {
    public final int f23406a;
    public final Object f23407b;

    public b7(Object obj, int i10) {
        this.f23406a = i10;
        this.f23407b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f23406a;
    }

    @Override
    public final void b() {
        switch (this.f23406a) {
            case 0:
                m8 m8Var = (m8) this.f23407b;
                m8Var.f26981l0.getSearchField().setCursorColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Oi));
                org.telegram.ui.ActionBar.u0 u0Var = m8Var.f26969b0;
                u0Var.setIconColor(m8Var.getThemedColor(((Integer) u0Var.getTag()).intValue()));
                Drawable background = u0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.g6.f19690i6;
                org.telegram.ui.ActionBar.g6.C1(background, m8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.u0 u0Var2 = m8Var.N;
                u0Var2.setIconColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Wi));
                org.telegram.ui.ActionBar.g6.C1(u0Var2.getBackground(), m8Var.getThemedColor(i10), true);
                n90 n90Var = m8Var.S;
                n90Var.setBackgroundColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ti));
                n90Var.setProgressColor(m8Var.getThemedColor(org.telegram.ui.ActionBar.g6.Vi));
                m8Var.I0();
                int i11 = org.telegram.ui.ActionBar.g6.G8;
                u0Var.B(m8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.g6.E8;
                u0Var2.G(m8Var.getThemedColor(i12), false);
                u0Var2.G(m8Var.getThemedColor(i12), true);
                u0Var2.B(m8Var.getThemedColor(i11));
                return;
            case 1:
                zj zjVar = (zj) this.f23407b;
                bi.o0 o0Var = zjVar.f31579s;
                if (o0Var != null) {
                    int childCount = o0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = o0Var.getChildAt(i13);
                        if (childAt instanceof yj) {
                            ((yj) childAt).b();
                        }
                    }
                }
                ri riVar = zjVar.I;
                if (riVar != null) {
                    riVar.d();
                    return;
                }
                return;
            case 2:
                tl tlVar = (tl) this.f23407b;
                tlVar.f29109r.setIconColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.ui, tlVar.f27359a));
                tlVar.f29109r.B(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, tlVar.f27359a));
                tlVar.f29109r.G(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.F8, tlVar.f27359a), true);
                tlVar.f29109r.G(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, tlVar.f27359a), false);
                if (tlVar.H != null) {
                    if (org.telegram.ui.ActionBar.g6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, tlVar.f27359a)) < 0.721f) {
                        if (!tlVar.U) {
                            tlVar.U = true;
                            tlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (tlVar.U) {
                        tlVar.U = false;
                        tlVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                zq zqVar = (zq) this.f23407b;
                org.telegram.ui.ActionBar.u0 u0Var3 = zqVar.I;
                u0Var3.setIconColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, zqVar.f31670d0));
                org.telegram.ui.ActionBar.g6.x1(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.I5, zqVar.f31670d0), u0Var3.getBackground());
                u0Var3.G(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.E8, zqVar.f31670d0), false);
                u0Var3.G(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.F8, zqVar.f31670d0), true);
                u0Var3.B(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G8, zqVar.f31670d0));
                return;
            case 4:
                ((cb0) this.f23407b).Z();
                return;
            case 5:
                ((af0) this.f23407b).s();
                return;
            case 6:
                ((qh0) this.f23407b).T();
                return;
            case 7:
                NumberTextView numberTextView = ((zo0) this.f23407b).f31639x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19990y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f23407b).run();
                return;
            case 9:
                ((uy0) this.f23407b).A0(false);
                return;
            default:
                ((i61) this.f23407b).d();
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
