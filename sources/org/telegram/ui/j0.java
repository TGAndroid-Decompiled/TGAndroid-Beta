package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends nf.e {
    public final int d = 0;
    public final Object f37522e;
    public final Object f37523f;
    public final Object f37524g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.r90 r90Var) {
        this.f37522e = i4Var;
        this.f37523f = b3Var;
        this.f37524g = r90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.f37522e;
                i4Var.f40704c.l(i4Var.v, true);
                View view = i4Var.f40709s;
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
                    AndroidUtilities.runOnUIThread(new dn(((kn) this.f37524g).f38003a, 6), 250L);
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
                org.telegram.ui.Components.r90 r90Var = (org.telegram.ui.Components.r90) this.f37524g;
                i4 i4Var = (i4) this.f37522e;
                org.telegram.ui.Components.n90 n90Var = i4Var.f40704c;
                b3 b3Var = (b3) this.f37523f;
                if (b3Var != null) {
                    view = b3Var.f34973b;
                } else {
                    view = null;
                }
                i4Var.f40709s = view;
                org.telegram.ui.Components.i11 i11Var = (org.telegram.ui.Components.i11) r90Var.f30306i;
                n90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.n90.i(b3Var.d, r90Var.f30306i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.i6.l1(0.8f, w02), org.telegram.ui.ActionBar.i6.l1(1.3f, w02), org.telegram.ui.ActionBar.i6.l1(1.0f, w02), org.telegram.ui.ActionBar.i6.l1(4.0f, w02));
                    i4Var.v.f31346w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    n90Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f40709s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                kn knVar = (kn) this.f37524g;
                knVar.f38003a.f43511tb = ((MessageObject) this.f37522e).getId();
                yn ynVar = knVar.f38003a;
                ynVar.f43524ub = 0;
                ynVar.f43536vb = null;
                ((org.telegram.ui.Cells.u1) this.f37523f).invalidate();
                return;
        }
    }

    public j0(kn knVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f37524g = knVar;
        this.f37522e = messageObject;
        this.f37523f = u1Var;
    }
}
