package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34292f;
    public final Object f34293g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.e90 e90Var) {
        this.e = i4Var;
        this.f34292f = b3Var;
        this.f34293g = e90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.e;
                i4Var.f36711c.l(i4Var.v, true);
                View view = i4Var.f36715s;
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
                    AndroidUtilities.runOnUIThread(new xj(((jn) this.f34293g).f34487a, 9), 250L);
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
                org.telegram.ui.Components.e90 e90Var = (org.telegram.ui.Components.e90) this.f34293g;
                i4 i4Var = (i4) this.e;
                org.telegram.ui.Components.a90 a90Var = i4Var.f36711c;
                b3 b3Var = (b3) this.f34292f;
                if (b3Var != null) {
                    view = b3Var.f31942b;
                } else {
                    view = null;
                }
                i4Var.f36715s = view;
                org.telegram.ui.Components.j01 j01Var = (org.telegram.ui.Components.j01) e90Var.f23625i;
                a90Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.a90.i(b3Var.d, e90Var.f23625i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ld, false);
                    i4Var.v.f(org.telegram.ui.ActionBar.h6.l1(0.8f, w02), org.telegram.ui.ActionBar.h6.l1(1.3f, w02), org.telegram.ui.ActionBar.h6.l1(1.0f, w02), org.telegram.ui.ActionBar.h6.l1(4.0f, w02));
                    i4Var.v.f24618w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    a90Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f36715s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                jn jnVar = (jn) this.f34293g;
                jnVar.f34487a.f39580vb = ((MessageObject) this.e).getId();
                xn xnVar = jnVar.f34487a;
                xnVar.f39594wb = 0;
                xnVar.f39607xb = null;
                ((org.telegram.ui.Cells.t1) this.f34292f).invalidate();
                return;
        }
    }

    public j0(jn jnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f34293g = jnVar;
        this.e = messageObject;
        this.f34292f = t1Var;
    }
}
