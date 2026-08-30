package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class lj extends org.telegram.ui.Components.zn {
    public final xn f36095s0;

    public lj(xn xnVar, Context context, xn xnVar2, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, xnVar2, z4, f6Var);
        this.f36095s0 = xnVar;
    }

    @Override
    public final boolean a() {
        boolean z4;
        xn xnVar = this.f36095s0;
        if (!xnVar.La && !xnVar.isInPreviewMode()) {
            z4 = ((org.telegram.ui.ActionBar.p2) xnVar).inBubbleMode;
            if (!z4 && xnVar.f40022g0 != null && !xnVar.f40135p3) {
                if (!xnVar.F9() || xnVar.f40001e4) {
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
        xn xnVar = this.f36095s0;
        TLRPC.User user = xnVar.f40009f;
        if (user != null && user.linked_community_id != 0) {
            xnVar.showDialog(new sh.i0(xnVar, xnVar.f40009f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            xnVar.showDialog(new sh.i0(xnVar, xnVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        xn xnVar = this.f36095s0;
        if (xnVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        xnVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f36095s0.O3 == 3) {
            return true;
        }
        return false;
    }
}
