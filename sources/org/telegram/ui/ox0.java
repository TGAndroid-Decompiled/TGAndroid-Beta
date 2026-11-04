package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class ox0 extends org.telegram.ui.Components.sj0 {
    public final Context f48378c;
    public final sx0 d;

    public ox0(sx0 sx0Var, Context context) {
        this.d = sx0Var;
        this.f48378c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 != 3 && i3 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        int i3;
        sx0 sx0Var = this.d;
        int i10 = sx0Var.f49644f;
        if (sx0Var.f49643e < 0) {
            i3 = sx0Var.getMediaDataController().h.size();
        } else {
            i3 = 0;
        }
        return i10 + i3 + 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        sx0 sx0Var = this.d;
        if (i3 == sx0Var.f49642c) {
            return 2;
        }
        if (i3 == sx0Var.f49643e) {
            return 3;
        }
        if (i3 != b() - 1) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        if (d(i3) != 1) {
            return;
        }
        sx0 sx0Var = this.d;
        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) sx0Var.getMediaDataController().h.get(i3 - sx0Var.d);
        String str = tL_availableReaction.reaction;
        i10 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        boolean contains = str.contains(org.telegram.messenger.li.b0(i10).Q());
        i11 = ((org.telegram.ui.ActionBar.d2) sx0Var).currentAccount;
        ((org.telegram.ui.Cells.x) d1Var.f55540a).a(tL_availableReaction, contains, i11);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.q4 q4Var;
        rx0 rx0Var;
        sx0 sx0Var = this.d;
        Context context = this.f48378c;
        if (i3 == 0) {
            q4Var = ((org.telegram.ui.ActionBar.d2) sx0Var).parentLayout;
            org.telegram.ui.Cells.z9 z9Var = new org.telegram.ui.Cells.z9(context, q4Var, 2);
            z9Var.setImportantForAccessibility(4);
            z9Var.f31070x = sx0Var;
            rx0Var = z9Var;
        } else if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    rx0Var = new org.telegram.ui.Cells.x(context, true, true);
                } else {
                    View smVar = new org.telegram.ui.Components.sm(context, 23);
                    smVar.setTag(-33024);
                    rx0Var = smVar;
                }
            } else {
                rx0 rx0Var2 = new rx0(sx0Var, context);
                rx0Var2.a(false);
                rx0Var = rx0Var2;
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            y8Var.setText(org.telegram.messenger.bd.M0(2131751353, null));
            rx0Var = y8Var;
        }
        return new u4.d1(rx0Var);
    }
}
