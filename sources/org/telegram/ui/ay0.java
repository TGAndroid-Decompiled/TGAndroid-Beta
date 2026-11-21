package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class ay0 extends org.telegram.ui.Components.dk0 {
    public final Context f45729c;
    public final ey0 d;

    public ay0(ey0 ey0Var, Context context) {
        this.d = ey0Var;
        this.f45729c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59165f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i7;
        ey0 ey0Var = this.d;
        int i10 = ey0Var.f47413f;
        if (ey0Var.f47412e < 0) {
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
        if (i7 == ey0Var.f47411c) {
            return 2;
        }
        if (i7 == ey0Var.f47412e) {
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
        i10 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ri.d0(i10).S());
        i11 = ((org.telegram.ui.ActionBar.g2) ey0Var).currentAccount;
        ((org.telegram.ui.Cells.x) f1Var.f59161a).a(tL_availableReaction, contains, i11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        dy0 dy0Var;
        ey0 ey0Var = this.d;
        Context context = this.f45729c;
        if (i7 == 0) {
            r4Var = ((org.telegram.ui.ActionBar.g2) ey0Var).parentLayout;
            org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context, r4Var, 2);
            baVar.setImportantForAccessibility(4);
            baVar.f30495x = ey0Var;
            dy0Var = baVar;
        } else if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    dy0Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View lnVar = new org.telegram.ui.Components.ln(context, 22);
                    lnVar.setTag(-33024);
                    dy0Var = lnVar;
                }
            } else {
                dy0 dy0Var2 = new dy0(ey0Var, context);
                dy0Var2.a(false);
                dy0Var = dy0Var2;
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(org.telegram.messenger.gd.N0(2131751340, null));
            dy0Var = a9Var;
        }
        return new v4.f1(dy0Var);
    }
}
