package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class gj extends org.telegram.ui.Components.xn {
    public final tn f38600r0;

    public gj(tn tnVar, Context context, tn tnVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, tnVar2, z10, c6Var);
        this.f38600r0 = tnVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        tn tnVar = this.f38600r0;
        if (!tnVar.Ka && !tnVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.o2) tnVar).inBubbleMode;
            if (!z10 && tnVar.f42802f0 != null && !tnVar.f42915o3) {
                if (!tnVar.F9() || tnVar.f42779d4) {
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
        tn tnVar = this.f38600r0;
        TLRPC.User user = tnVar.f42801f;
        if (user != null && user.linked_community_id != 0) {
            tnVar.showDialog(new qh.i0(tnVar, tnVar.f42801f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = tnVar.f42787e;
        if (chat != null && chat.linked_community_id != 0) {
            tnVar.showDialog(new qh.i0(tnVar, tnVar.f42787e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        tn tnVar = this.f38600r0;
        if (tnVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        tnVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f38600r0.N3 == 3) {
            return true;
        }
        return false;
    }
}
