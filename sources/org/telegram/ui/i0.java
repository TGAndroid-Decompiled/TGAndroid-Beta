package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34323f;
    public final Object f34324g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.l90 l90Var) {
        this.e = h4Var;
        this.f34323f = a3Var;
        this.f34324g = l90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.e;
                h4Var.f37981c.l(h4Var.v, true);
                View view = h4Var.f37985s;
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
                    AndroidUtilities.runOnUIThread(new zj(((ln) this.f34324g).f35482a, 9), 250L);
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
                org.telegram.ui.Components.l90 l90Var = (org.telegram.ui.Components.l90) this.f34324g;
                h4 h4Var = (h4) this.e;
                org.telegram.ui.Components.h90 h90Var = h4Var.f37981c;
                a3 a3Var = (a3) this.f34323f;
                if (a3Var != null) {
                    view = a3Var.f31970b;
                } else {
                    view = null;
                }
                h4Var.f37985s = view;
                org.telegram.ui.Components.y01 y01Var = (org.telegram.ui.Components.y01) l90Var.f26069i;
                h90Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.h90.i(a3Var.d, l90Var.f26069i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    h4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    h4Var.v.f26860w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    h90Var.b(h4Var.v, a3Var);
                }
                View view2 = h4Var.f37985s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                ln lnVar = (ln) this.f34324g;
                lnVar.f35482a.f40514vb = ((MessageObject) this.e).getId();
                zn znVar = lnVar.f35482a;
                znVar.f40528wb = 0;
                znVar.f40541xb = null;
                ((org.telegram.ui.Cells.u1) this.f34323f).invalidate();
                return;
        }
    }

    public i0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f34324g = lnVar;
        this.e = messageObject;
        this.f34323f = u1Var;
    }
}
