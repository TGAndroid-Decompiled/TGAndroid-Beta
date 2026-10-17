package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class l0 extends pf.c {
    public final int d = 1;
    public final Object e;
    public final Object f38711f;
    public final Object f38712g;

    public l0(l4 l4Var, d3 d3Var, org.telegram.ui.Components.y90 y90Var) {
        this.e = l4Var;
        this.f38711f = d3Var;
        this.f38712g = y90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                l4 l4Var = (l4) this.e;
                l4Var.f36086c.l(l4Var.v, true);
                View view = l4Var.f36090s;
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
                    AndroidUtilities.runOnUIThread(new vj(((en) this.f38712g).f36569a, 10), 250L);
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
                org.telegram.ui.Components.y90 y90Var = (org.telegram.ui.Components.y90) this.f38712g;
                l4 l4Var = (l4) this.e;
                org.telegram.ui.Components.u90 u90Var = l4Var.f36086c;
                d3 d3Var = (d3) this.f38711f;
                if (d3Var != null) {
                    view = d3Var.f36048b;
                } else {
                    view = null;
                }
                l4Var.f36090s = view;
                org.telegram.ui.Components.h11 h11Var = (org.telegram.ui.Components.h11) y90Var.f32586i;
                u90Var.l(l4Var.v, true);
                if (d3Var != null) {
                    l4Var.v = org.telegram.ui.Components.u90.i(d3Var.d, y90Var.f32586i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    l4Var.v.g(org.telegram.ui.ActionBar.h6.m1(0.8f, x02), org.telegram.ui.ActionBar.h6.m1(1.3f, x02), org.telegram.ui.ActionBar.h6.m1(1.0f, x02), org.telegram.ui.ActionBar.h6.m1(4.0f, x02));
                    l4Var.v.f24909x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    u90Var.b(l4Var.v, d3Var);
                }
                View view2 = l4Var.f36090s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                en enVar = (en) this.f38712g;
                enVar.f36569a.f41430wb = ((MessageObject) this.e).getId();
                sn snVar = enVar.f36569a;
                snVar.f41444xb = 0;
                snVar.f41457yb = null;
                ((org.telegram.ui.Cells.u1) this.f38711f).invalidate();
                return;
        }
    }

    public l0(en enVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f38712g = enVar;
        this.e = messageObject;
        this.f38711f = u1Var;
    }
}
