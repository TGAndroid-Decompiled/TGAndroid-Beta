package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34611f;
    public final Object f34612g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.q90 q90Var) {
        this.e = i4Var;
        this.f34611f = b3Var;
        this.f34612g = q90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.e;
                i4Var.f36423c.l(i4Var.v, true);
                View view = i4Var.f36427s;
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
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f34612g).f34559a, 9), 250L);
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
                org.telegram.ui.Components.q90 q90Var = (org.telegram.ui.Components.q90) this.f34612g;
                i4 i4Var = (i4) this.e;
                org.telegram.ui.Components.m90 m90Var = i4Var.f36423c;
                b3 b3Var = (b3) this.f34611f;
                if (b3Var != null) {
                    view = b3Var.f32302b;
                } else {
                    view = null;
                }
                i4Var.f36427s = view;
                org.telegram.ui.Components.z01 z01Var = (org.telegram.ui.Components.z01) q90Var.f27576i;
                m90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.m90.i(b3Var.d, q90Var.f27576i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.h6.l1(0.8f, w02), org.telegram.ui.ActionBar.h6.l1(1.3f, w02), org.telegram.ui.ActionBar.h6.l1(1.0f, w02), org.telegram.ui.ActionBar.h6.l1(4.0f, w02));
                    i4Var.v.f28518w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    m90Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f36427s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                in inVar = (in) this.f34612g;
                inVar.f34559a.f39679vb = ((MessageObject) this.e).getId();
                wn wnVar = inVar.f34559a;
                wnVar.f39693wb = 0;
                wnVar.f39706xb = null;
                ((org.telegram.ui.Cells.u1) this.f34611f).invalidate();
                return;
        }
    }

    public j0(in inVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f34612g = inVar;
        this.e = messageObject;
        this.f34611f = u1Var;
    }
}
