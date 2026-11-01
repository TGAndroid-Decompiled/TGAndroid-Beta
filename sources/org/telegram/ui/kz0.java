package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class kz0 extends org.telegram.ui.Components.tk0 {
    public final Context f39035c;
    public final oz0 d;

    public kz0(oz0 oz0Var, Context context) {
        this.d = oz0Var;
        this.f39035c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i10;
        oz0 oz0Var = this.d;
        int i11 = oz0Var.f40310f;
        if (oz0Var.e < 0) {
            i10 = oz0Var.getMediaDataController().h.size();
        } else {
            i10 = 0;
        }
        return i11 + i10 + 1;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        oz0 oz0Var = this.d;
        if (i10 == oz0Var.f40309c) {
            return 2;
        }
        if (i10 == oz0Var.e) {
            return 3;
        }
        if (i10 != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        if (d(i10) != 1) {
            return;
        }
        oz0 oz0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) oz0Var.getMediaDataController().h.get(i10 - oz0Var.d);
        String str = tL_availableReaction.reaction;
        i11 = ((org.telegram.ui.ActionBar.k2) oz0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.vi.b0(i11).Q());
        i12 = ((org.telegram.ui.ActionBar.k2) oz0Var).currentAccount;
        ((org.telegram.ui.Cells.x) c1Var.f47909a).a(tL_availableReaction, contains, i12);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        nz0 nz0Var;
        oz0 oz0Var = this.d;
        Context context = this.f39035c;
        if (i10 == 0) {
            z4Var = ((org.telegram.ui.ActionBar.k2) oz0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, z4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.f23662x = oz0Var;
            nz0Var = z9Var;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    nz0Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View bnVar = new org.telegram.ui.Components.bn(context, 19);
                    bnVar.setTag(-33024);
                    nz0Var = bnVar;
                }
            } else {
                nz0 nz0Var2 = new nz0(oz0Var, context);
                nz0Var2.a(false);
                nz0Var = nz0Var2;
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            b9Var.setText(org.telegram.messenger.dd.L0(2131751353, null));
            nz0Var = b9Var;
        }
        return new s4.c1(nz0Var);
    }
}
