package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class by0 extends org.telegram.ui.Components.oj0 {
    public final Context f44174c;
    public final fy0 d;

    public by0(fy0 fy0Var, Context context) {
        this.d = fy0Var;
        this.f44174c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i7;
        fy0 fy0Var = this.d;
        int i10 = fy0Var.f45876f;
        if (fy0Var.f45875e < 0) {
            i7 = fy0Var.getMediaDataController().h.size();
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
        fy0 fy0Var = this.d;
        if (i7 == fy0Var.f45874c) {
            return 2;
        }
        if (i7 == fy0Var.f45875e) {
            return 3;
        }
        if (i7 != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        if (d(i7) != 1) {
            return;
        }
        fy0 fy0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) fy0Var.getMediaDataController().h.get(i7 - fy0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.f2) fy0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.ui.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.f2) fy0Var).currentAccount;
        ((org.telegram.ui.Cells.x) d1Var.f57052a).a(tL_availableReaction, contains, i11);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.r4 r4Var;
        ey0 ey0Var;
        fy0 fy0Var = this.d;
        Context context = this.f44174c;
        if (i7 == 0) {
            r4Var = ((org.telegram.ui.ActionBar.f2) fy0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, r4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.f31017x = fy0Var;
            ey0Var = z9Var;
        } else if (i7 != 2) {
            if (i7 != 3) {
                if (i7 != 4) {
                    ey0Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View smVar = new org.telegram.ui.Components.sm(context, 22);
                    smVar.setTag(-33024);
                    ey0Var = smVar;
                }
            } else {
                ey0 ey0Var2 = new ey0(fy0Var, context);
                ey0Var2.a(false);
                ey0Var = ey0Var2;
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(org.telegram.messenger.id.M0(2131751352, null));
            ey0Var = z8Var;
        }
        return new v4.d1(ey0Var);
    }
}
