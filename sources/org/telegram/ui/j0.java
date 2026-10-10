package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class j0 extends of.e {
    public final int d = 0;
    public final Object f38828e;
    public final Object f38829f;
    public final Object f38830g;

    public j0(i4 i4Var, b3 b3Var, org.telegram.ui.Components.ga0 ga0Var) {
        this.f38828e = i4Var;
        this.f38829f = b3Var;
        this.f38830g = ga0Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                i4 i4Var = (i4) this.f38828e;
                i4Var.f41930c.l(i4Var.v, true);
                View view = i4Var.f41935s;
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
                    AndroidUtilities.runOnUIThread(new ck(((ln) this.f38830g).f39680a, 10), 250L);
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
                org.telegram.ui.Components.ga0 ga0Var = (org.telegram.ui.Components.ga0) this.f38830g;
                i4 i4Var = (i4) this.f38828e;
                org.telegram.ui.Components.ca0 ca0Var = i4Var.f41930c;
                b3 b3Var = (b3) this.f38829f;
                if (b3Var != null) {
                    view = b3Var.f36155b;
                } else {
                    view = null;
                }
                i4Var.f41935s = view;
                org.telegram.ui.Components.q11 q11Var = (org.telegram.ui.Components.q11) ga0Var.f26673i;
                ca0Var.l(i4Var.v, true);
                if (b3Var != null) {
                    i4Var.v = org.telegram.ui.Components.ca0.i(b3Var.d, ga0Var.f26673i, 0.0f);
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ld, false);
                    i4Var.v.g(org.telegram.ui.ActionBar.i6.m1(0.8f, x02), org.telegram.ui.ActionBar.i6.m1(1.3f, x02), org.telegram.ui.ActionBar.i6.m1(1.0f, x02), org.telegram.ui.ActionBar.i6.m1(4.0f, x02));
                    i4Var.v.f27651x.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    ca0Var.b(i4Var.v, b3Var);
                }
                View view2 = i4Var.f41935s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                ln lnVar = (ln) this.f38830g;
                lnVar.f39680a.f45031wb = ((MessageObject) this.f38828e).getId();
                zn znVar = lnVar.f39680a;
                znVar.f45045xb = 0;
                znVar.f45057yb = null;
                ((org.telegram.ui.Cells.u1) this.f38829f).invalidate();
                return;
        }
    }

    public j0(ln lnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f38830g = lnVar;
        this.f38828e = messageObject;
        this.f38829f = u1Var;
    }
}
