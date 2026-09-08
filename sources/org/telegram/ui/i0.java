package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends of.e {
    public final int d = 0;
    public final Object f37170e;
    public final Object f37171f;
    public final Object f37172g;

    public i0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.e90 e90Var) {
        this.f37170e = i4Var;
        this.f37171f = b3Var;
        this.f37172g = e90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.f37170e;
                i4Var.f41462c.l(i4Var.v, true);
                View view = i4Var.f41467s;
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
                    AndroidUtilities.runOnUIThread(new ak(((on) this.f37172g).f39310a, 9), 250L);
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
                org.telegram.ui.Components.e90 e90Var = (org.telegram.ui.Components.e90) this.f37172g;
                i4 i4Var = (i4) this.f37170e;
                org.telegram.ui.Components.a90 a90Var = i4Var.f41462c;
                b3 b3Var = (b3) this.f37171f;
                if (b3Var != null) {
                    view = b3Var.f34638b;
                } else {
                    view = null;
                }
                i4Var.f41467s = view;
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) e90Var.f25650i;
                a90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.a90.i(b3Var.d, e90Var.f25650i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.j6.l1(0.8f, w02), org.telegram.ui.ActionBar.j6.l1(1.3f, w02), org.telegram.ui.ActionBar.j6.l1(1.0f, w02), org.telegram.ui.ActionBar.j6.l1(4.0f, w02));
                    i4Var.v.f26717w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    a90Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f41467s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                on onVar = (on) this.f37172g;
                onVar.f39310a.f35498wb = ((MessageObject) this.f37170e).getId();
                co coVar = onVar.f39310a;
                coVar.f35511xb = 0;
                coVar.f35523yb = null;
                ((org.telegram.ui.Cells.t1) this.f37171f).invalidate();
                return;
        }
    }

    public i0(on onVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f37172g = onVar;
        this.f37170e = messageObject;
        this.f37171f = t1Var;
    }
}
