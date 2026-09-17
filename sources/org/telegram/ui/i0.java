package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34400f;
    public final Object f34401g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.d90 d90Var) {
        this.e = h4Var;
        this.f34400f = a3Var;
        this.f34401g = d90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.e;
                h4Var.f38582c.l(h4Var.v, true);
                View view = h4Var.f38586s;
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
                    AndroidUtilities.runOnUIThread(new bk(((nn) this.f34401g).f36134a, 9), 250L);
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
                org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) this.f34401g;
                h4 h4Var = (h4) this.e;
                org.telegram.ui.Components.z80 z80Var = h4Var.f38582c;
                a3 a3Var = (a3) this.f34400f;
                if (a3Var != null) {
                    view = a3Var.f31689b;
                } else {
                    view = null;
                }
                h4Var.f38586s = view;
                org.telegram.ui.Components.l01 l01Var = (org.telegram.ui.Components.l01) d90Var.f23240i;
                z80Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.z80.i(a3Var.d, d90Var.f23240i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    h4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    h4Var.v.f24148w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    z80Var.b(h4Var.v, a3Var);
                }
                View view2 = h4Var.f38586s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                nn nnVar = (nn) this.f34401g;
                nnVar.f36134a.f32500wb = ((MessageObject) this.e).getId();
                bo boVar = nnVar.f36134a;
                boVar.f32513xb = 0;
                boVar.f32525yb = null;
                ((org.telegram.ui.Cells.t1) this.f34400f).invalidate();
                return;
        }
    }

    public i0(nn nnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f34401g = nnVar;
        this.e = messageObject;
        this.f34400f = t1Var;
    }
}
