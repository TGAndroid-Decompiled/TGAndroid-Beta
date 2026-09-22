package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34343f;
    public final Object f34344g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.o90 o90Var) {
        this.e = h4Var;
        this.f34343f = a3Var;
        this.f34344g = o90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.e;
                h4Var.f37982c.l(h4Var.v, true);
                View view = h4Var.f37986s;
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
                    AndroidUtilities.runOnUIThread(new ak(((ln) this.f34344g).f35505a, 9), 250L);
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
                org.telegram.ui.Components.o90 o90Var = (org.telegram.ui.Components.o90) this.f34344g;
                h4 h4Var = (h4) this.e;
                org.telegram.ui.Components.k90 k90Var = h4Var.f37982c;
                a3 a3Var = (a3) this.f34343f;
                if (a3Var != null) {
                    view = a3Var.f31991b;
                } else {
                    view = null;
                }
                h4Var.f37986s = view;
                org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) o90Var.f27022i;
                k90Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.k90.i(a3Var.d, o90Var.f27022i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    h4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    h4Var.v.f27872w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    k90Var.b(h4Var.v, a3Var);
                }
                View view2 = h4Var.f37986s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                ln lnVar = (ln) this.f34344g;
                lnVar.f35505a.f40535vb = ((MessageObject) this.e).getId();
                zn znVar = lnVar.f35505a;
                znVar.f40549wb = 0;
                znVar.f40562xb = null;
                ((org.telegram.ui.Cells.u1) this.f34343f).invalidate();
                return;
        }
    }

    public i0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f34344g = lnVar;
        this.e = messageObject;
        this.f34343f = u1Var;
    }
}
