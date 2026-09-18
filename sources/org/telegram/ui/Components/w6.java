package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class w6 implements org.telegram.ui.ActionBar.k6 {
    public final int f29570a;
    public final Object f29571b;

    public w6(Object obj, int i10) {
        this.f29570a = i10;
        this.f29571b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f29570a;
    }

    @Override
    public final void b() {
        switch (this.f29570a) {
            case 0:
                h8 h8Var = (h8) this.f29571b;
                h8Var.f24560l0.getSearchField().setCursorColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Oi));
                org.telegram.ui.ActionBar.w0 w0Var = h8Var.f24548b0;
                w0Var.setIconColor(h8Var.getThemedColor(((Integer) w0Var.getTag()).intValue()));
                Drawable background = w0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.j6.f18953i6;
                org.telegram.ui.ActionBar.j6.B1(background, h8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.w0 w0Var2 = h8Var.N;
                w0Var2.setIconColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Wi));
                org.telegram.ui.ActionBar.j6.B1(w0Var2.getBackground(), h8Var.getThemedColor(i10), true);
                m80 m80Var = h8Var.S;
                m80Var.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ti));
                m80Var.setProgressColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.j6.Vi));
                h8Var.I0();
                int i11 = org.telegram.ui.ActionBar.j6.G8;
                w0Var.B(h8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.j6.E8;
                w0Var2.G(h8Var.getThemedColor(i12), false);
                w0Var2.G(h8Var.getThemedColor(i12), true);
                w0Var2.B(h8Var.getThemedColor(i11));
                return;
            case 1:
                yj yjVar = (yj) this.f29571b;
                ai.w0 w0Var3 = yjVar.f30258s;
                if (w0Var3 != null) {
                    int childCount = w0Var3.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var3.getChildAt(i13);
                        if (childAt instanceof xj) {
                            ((xj) childAt).b();
                        }
                    }
                }
                ri riVar = yjVar.I;
                if (riVar != null) {
                    riVar.e();
                    return;
                }
                return;
            case 2:
                gl glVar = (gl) this.f29571b;
                glVar.f24330r.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, glVar.f26462a));
                glVar.f24330r.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, glVar.f26462a));
                glVar.f24330r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, glVar.f26462a), true);
                glVar.f24330r.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, glVar.f26462a), false);
                if (glVar.H != null) {
                    if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18863d6, glVar.f26462a)) < 0.721f) {
                        if (!glVar.U) {
                            glVar.U = true;
                            glVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                            return;
                        }
                        return;
                    } else if (glVar.U) {
                        glVar.U = false;
                        glVar.H.setMapStyle(null);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 3:
                mq mqVar = (mq) this.f29571b;
                org.telegram.ui.ActionBar.w0 w0Var4 = mqVar.I;
                w0Var4.setIconColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, mqVar.f26249d0));
                org.telegram.ui.ActionBar.j6.w1(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I5, mqVar.f26249d0), w0Var4.getBackground());
                w0Var4.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.E8, mqVar.f26249d0), false);
                w0Var4.G(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, mqVar.f26249d0), true);
                w0Var4.B(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G8, mqVar.f26249d0));
                return;
            case 4:
                ((ba0) this.f29571b).Z();
                return;
            case 5:
                ((ae0) this.f29571b).q();
                return;
            case 6:
                ((qg0) this.f29571b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((zn0) this.f29571b).f30572y0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19247y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f29571b).run();
                return;
            case 9:
                ((wx0) this.f29571b).z0(false);
                return;
            default:
                ((f51) this.f29571b).d();
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
