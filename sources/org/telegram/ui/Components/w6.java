package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
public final class w6 implements org.telegram.ui.ActionBar.j6 {
    public final int f29618a;
    public final Object f29619b;

    public w6(Object obj, int i10) {
        this.f29618a = i10;
        this.f29619b = obj;
    }

    @Override
    public final void a(float f7) {
        int i10 = this.f29618a;
    }

    @Override
    public final void b() {
        switch (this.f29618a) {
            case 0:
                h8 h8Var = (h8) this.f29619b;
                h8Var.f24565l0.getSearchField().setCursorColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Oi));
                org.telegram.ui.ActionBar.v0 v0Var = h8Var.f24553b0;
                v0Var.setIconColor(h8Var.getThemedColor(((Integer) v0Var.getTag()).intValue()));
                Drawable background = v0Var.getBackground();
                int i10 = org.telegram.ui.ActionBar.i6.f18926i6;
                org.telegram.ui.ActionBar.i6.B1(background, h8Var.getThemedColor(i10), true);
                org.telegram.ui.ActionBar.v0 v0Var2 = h8Var.N;
                v0Var2.setIconColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Wi));
                org.telegram.ui.ActionBar.i6.B1(v0Var2.getBackground(), h8Var.getThemedColor(i10), true);
                m80 m80Var = h8Var.S;
                m80Var.setBackgroundColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Ti));
                m80Var.setProgressColor(h8Var.getThemedColor(org.telegram.ui.ActionBar.i6.Vi));
                h8Var.I0();
                int i11 = org.telegram.ui.ActionBar.i6.G8;
                v0Var.B(h8Var.getThemedColor(i11));
                int i12 = org.telegram.ui.ActionBar.i6.E8;
                v0Var2.G(h8Var.getThemedColor(i12), false);
                v0Var2.G(h8Var.getThemedColor(i12), true);
                v0Var2.B(h8Var.getThemedColor(i11));
                return;
            case 1:
                yj yjVar = (yj) this.f29619b;
                ai.w0 w0Var = yjVar.f30269s;
                if (w0Var != null) {
                    int childCount = w0Var.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = w0Var.getChildAt(i13);
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
                gl glVar = (gl) this.f29619b;
                glVar.f24405r.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ui, glVar.f26461a));
                glVar.f24405r.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, glVar.f26461a));
                glVar.f24405r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, glVar.f26461a), true);
                glVar.f24405r.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, glVar.f26461a), false);
                if (glVar.H != null) {
                    if (org.telegram.ui.ActionBar.i6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18836d6, glVar.f26461a)) < 0.721f) {
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
                mq mqVar = (mq) this.f29619b;
                org.telegram.ui.ActionBar.v0 v0Var3 = mqVar.I;
                v0Var3.setIconColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, mqVar.f26220d0));
                org.telegram.ui.ActionBar.i6.w1(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.I5, mqVar.f26220d0), v0Var3.getBackground());
                v0Var3.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, mqVar.f26220d0), false);
                v0Var3.G(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, mqVar.f26220d0), true);
                v0Var3.B(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G8, mqVar.f26220d0));
                return;
            case 4:
                ((ba0) this.f29619b).Z();
                return;
            case 5:
                ((ae0) this.f29619b).q();
                return;
            case 6:
                ((pg0) this.f29619b).S();
                return;
            case 7:
                NumberTextView numberTextView = ((yn0) this.f29619b).f30308x0;
                if (numberTextView != null) {
                    numberTextView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19220y8, false));
                    return;
                }
                return;
            case 8:
                ((Runnable) this.f29619b).run();
                return;
            case 9:
                ((vx0) this.f29619b).z0(false);
                return;
            default:
                ((e51) this.f29619b).d();
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
