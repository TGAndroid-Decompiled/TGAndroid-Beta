package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class lj extends org.telegram.ui.Components.bo {
    public final xn f38762s0;

    public lj(xn xnVar, Context context, xn xnVar2, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, xnVar2, z4, g6Var);
        this.f38762s0 = xnVar;
    }

    @Override
    public final boolean a() {
        boolean z4;
        xn xnVar = this.f38762s0;
        if (!xnVar.La && !xnVar.isInPreviewMode()) {
            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inBubbleMode;
            if (!z4 && xnVar.f43191g0 != null && !xnVar.f43304p3) {
                if (!xnVar.F9() || xnVar.f43170e4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean d() {
        xn xnVar = this.f38762s0;
        TLRPC.User user = xnVar.f43178f;
        if (user != null && user.linked_community_id != 0) {
            xnVar.showDialog(new th.i0(xnVar, xnVar.f43178f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = xnVar.f43165e;
        if (chat != null && chat.linked_community_id != 0) {
            xnVar.showDialog(new th.i0(xnVar, xnVar.f43165e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        xn xnVar = this.f38762s0;
        if (xnVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        xnVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f38762s0.O3 == 3) {
            return true;
        }
        return false;
    }
}
