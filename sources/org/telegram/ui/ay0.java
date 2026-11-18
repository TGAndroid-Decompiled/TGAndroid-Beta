package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class ay0 extends org.telegram.ui.Components.bk0 {
    public final Context f45703c;
    public final ey0 d;

    public ay0(ey0 ey0Var, Context context) {
        this.d = ey0Var;
        this.f45703c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i7;
        ey0 ey0Var = this.d;
        int i10 = ey0Var.f47388f;
        if (ey0Var.f47387e < 0) {
            i7 = ey0Var.getMediaDataController().h.size();
        } else {
            i7 = 0;
        }
        return i10 + i7 + 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        ey0 ey0Var = this.d;
        if (i7 == ey0Var.f47386c) {
            return 2;
        }
        if (i7 == ey0Var.f47387e) {
            return 3;
        }
        if (i7 != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        ey0 ey0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ey0Var.getMediaDataController().h.get(i7 - ey0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.h2) ey0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ri.d0(i10).S());
        i11 = ((org.telegram.ui.ActionBar.h2) ey0Var).currentAccount;
        ((org.telegram.ui.Cells.x) f1Var.f59122a).a(tL_availableReaction, contains, i11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.s4 s4Var;
        dy0 dy0Var;
        ey0 ey0Var = this.d;
        Context context = this.f45703c;
        if (i7 == 0) {
            s4Var = ((org.telegram.ui.ActionBar.h2) ey0Var).parentLayout;
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context, s4Var, 2);
            aaVar.setImportantForAccessibility(4);
            aaVar.f30408x = ey0Var;
            dy0Var = aaVar;
        } else if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    dy0Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View jnVar = new org.telegram.ui.Components.jn(context, 22);
                    jnVar.setTag(-33024);
                    dy0Var = jnVar;
                }
            } else {
                dy0 dy0Var2 = new dy0(ey0Var, context);
                dy0Var2.a(false);
                dy0Var = dy0Var2;
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.gd.M0(2131751341, null));
            dy0Var = z8Var;
        }
        return new v4.f1(dy0Var);
    }
}
