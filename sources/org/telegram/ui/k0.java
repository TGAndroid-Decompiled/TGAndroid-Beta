package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class k0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34883f;
    public final Object f34884g;

    public k0(j4 j4Var, c3 c3Var, org.telegram.ui.Components.q90 q90Var) {
        this.e = j4Var;
        this.f34883f = c3Var;
        this.f34884g = q90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                j4 j4Var = (j4) this.e;
                j4Var.f37321c.l(j4Var.v, true);
                View view = j4Var.f37325s;
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
                    AndroidUtilities.runOnUIThread(new zj(((jn) this.f34884g).f34766a, 9), 250L);
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
                org.telegram.ui.Components.q90 q90Var = (org.telegram.ui.Components.q90) this.f34884g;
                j4 j4Var = (j4) this.e;
                org.telegram.ui.Components.m90 m90Var = j4Var.f37321c;
                c3 c3Var = (c3) this.f34883f;
                if (c3Var != null) {
                    view = c3Var.f32502b;
                } else {
                    view = null;
                }
                j4Var.f37325s = view;
                org.telegram.ui.Components.z01 z01Var = (org.telegram.ui.Components.z01) q90Var.f27627i;
                m90Var.l(j4Var.v, true);
                if (c3Var != null) {
                    j4Var.v = org.telegram.ui.Components.m90.i(c3Var.d, q90Var.f27627i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ld, false);
                    j4Var.v.f(org.telegram.ui.ActionBar.i6.l1(0.8f, w02), org.telegram.ui.ActionBar.i6.l1(1.3f, w02), org.telegram.ui.ActionBar.i6.l1(1.0f, w02), org.telegram.ui.ActionBar.i6.l1(4.0f, w02));
                    j4Var.v.f28536w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    m90Var.b(j4Var.v, c3Var);
                }
                View view2 = j4Var.f37325s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                jn jnVar = (jn) this.f34884g;
                jnVar.f34766a.f39961vb = ((MessageObject) this.e).getId();
                xn xnVar = jnVar.f34766a;
                xnVar.f39975wb = 0;
                xnVar.f39988xb = null;
                ((org.telegram.ui.Cells.u1) this.f34883f).invalidate();
                return;
        }
    }

    public k0(jn jnVar, MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var) {
        this.f34884g = jnVar;
        this.e = messageObject;
        this.f34883f = u1Var;
    }
}
