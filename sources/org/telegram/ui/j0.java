package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34610f;
    public final Object f34611g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.o90 o90Var) {
        this.e = i4Var;
        this.f34610f = b3Var;
        this.f34611g = o90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.e;
                i4Var.f36422c.l(i4Var.v, true);
                View view = i4Var.f36426s;
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
                    AndroidUtilities.runOnUIThread(new xj(((in) this.f34611g).f34558a, 9), 250L);
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
                org.telegram.ui.Components.o90 o90Var = (org.telegram.ui.Components.o90) this.f34611g;
                i4 i4Var = (i4) this.e;
                org.telegram.ui.Components.k90 k90Var = i4Var.f36422c;
                b3 b3Var = (b3) this.f34610f;
                if (b3Var != null) {
                    view = b3Var.f32300b;
                } else {
                    view = null;
                }
                i4Var.f36426s = view;
                org.telegram.ui.Components.x01 x01Var = (org.telegram.ui.Components.x01) o90Var.f26972i;
                k90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.k90.i(b3Var.d, o90Var.f26972i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.h6.l1(0.8f, w02), org.telegram.ui.ActionBar.h6.l1(1.3f, w02), org.telegram.ui.ActionBar.h6.l1(1.0f, w02), org.telegram.ui.ActionBar.h6.l1(4.0f, w02));
                    i4Var.v.f27930w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    k90Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f36426s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                in inVar = (in) this.f34611g;
                inVar.f34558a.f39680vb = ((MessageObject) this.e).getId();
                wn wnVar = inVar.f34558a;
                wnVar.f39694wb = 0;
                wnVar.f39707xb = null;
                ((org.telegram.ui.Cells.u1) this.f34610f).invalidate();
                return;
        }
    }

    public j0(in inVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f34611g = inVar;
        this.e = messageObject;
        this.f34610f = u1Var;
    }
}
