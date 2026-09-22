package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class i0 extends nf.e {
    public final int d = 0;
    public final Object e;
    public final Object f34382f;
    public final Object f34383g;

    public i0(h4 h4Var, a3 a3Var, org.telegram.ui.Components.d90 d90Var) {
        this.e = h4Var;
        this.f34382f = a3Var;
        this.f34383g = d90Var;
    }

    @Override
    public void b() {
        switch (this.d) {
            case 0:
                h4 h4Var = (h4) this.e;
                h4Var.f37827c.l(h4Var.v, true);
                View view = h4Var.f37831s;
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
                    AndroidUtilities.runOnUIThread(new ak(((nn) this.f34383g).f36017a, 9), 250L);
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
                org.telegram.ui.Components.d90 d90Var = (org.telegram.ui.Components.d90) this.f34383g;
                h4 h4Var = (h4) this.e;
                org.telegram.ui.Components.z80 z80Var = h4Var.f37827c;
                a3 a3Var = (a3) this.f34382f;
                if (a3Var != null) {
                    view = a3Var.f31663b;
                } else {
                    view = null;
                }
                h4Var.f37831s = view;
                org.telegram.ui.Components.k01 k01Var = (org.telegram.ui.Components.k01) d90Var.f23247i;
                z80Var.l(h4Var.v, true);
                if (a3Var != null) {
                    h4Var.v = org.telegram.ui.Components.z80.i(a3Var.d, d90Var.f23247i, 0.0f);
                    int w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ld, false);
                    h4Var.v.f(org.telegram.ui.ActionBar.i6.l1(0.8f, w02), org.telegram.ui.ActionBar.i6.l1(1.3f, w02), org.telegram.ui.ActionBar.i6.l1(1.0f, w02), org.telegram.ui.ActionBar.i6.l1(4.0f, w02));
                    h4Var.v.f24276w.setStrokeWidth(AndroidUtilities.dpf2(1.25f));
                    z80Var.b(h4Var.v, a3Var);
                }
                View view2 = h4Var.f37831s;
                if (view2 != null) {
                    view2.invalidate();
                }
                super.d();
                return;
            default:
                nn nnVar = (nn) this.f34383g;
                nnVar.f36017a.f32503vb = ((MessageObject) this.e).getId();
                bo boVar = nnVar.f36017a;
                boVar.f32517wb = 0;
                boVar.f32530xb = null;
                ((org.telegram.ui.Cells.t1) this.f34382f).invalidate();
                return;
        }
    }

    public i0(nn nnVar, MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var) {
        this.f34383g = nnVar;
        this.e = messageObject;
        this.f34382f = t1Var;
    }
}
