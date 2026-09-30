package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34696f;
    public final Object f34697g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.r90 r90Var) {
        this.e = i4Var;
        this.f34696f = b3Var;
        this.f34697g = r90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.e;
                i4Var.f36526c.l(i4Var.v, true);
                View view = i4Var.f36530s;
                if (view != null) {
                    view.invalidate();
                }
                c(false);
                return;
            default:
                super.b();
                return;
        }
    }

    @Override
    public void c(boolean z10) {
        switch (this.d) {
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f34697g).f34642a, 9), 250L);
                    return;
                }
                return;
            default:
                super.c(z10);
                return;
        }
    }

    @Override
    public final void d() {
        View view;
        switch (this.d) {
            case 0:
                org.telegram.ui.Components.r90 r90Var = (org.telegram.ui.Components.r90) this.f34697g;
                i4 i4Var = (i4) this.e;
                org.telegram.ui.Components.n90 n90Var = i4Var.f36526c;
                b3 b3Var = (b3) this.f34696f;
                if (b3Var != null) {
                    view = b3Var.f32374b;
                } else {
                    view = null;
                }
                i4Var.f36530s = view;
                org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) r90Var.f27881i;
                n90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.n90.i(b3Var.d, r90Var.f27881i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.h6.l1(0.8f, w02), org.telegram.ui.ActionBar.h6.l1(1.3f, w02), org.telegram.ui.ActionBar.h6.l1(1.0f, w02), org.telegram.ui.ActionBar.h6.l1(4.0f, w02));
                    i4Var.v.f28820w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    n90Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f36530s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                in inVar = (in) this.f34697g;
                inVar.f34642a.f39772vb = ((MessageObject) this.e).getId();
                wn wnVar = inVar.f34642a;
                wnVar.f39786wb = 0;
                wnVar.f39799xb = null;
                ((org.telegram.ui.Cells.u1) this.f34696f).invalidate();
                return;
        }
    }

    public j0(in inVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f34697g = inVar;
        this.e = messageObject;
        this.f34696f = u1Var;
    }
}
