package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class oj extends org.telegram.ui.Components.go {
    public final xn f36220v0;

    public oj(xn xnVar, Context context, xn xnVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, xnVar2, z10, e6Var);
        this.f36220v0 = xnVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        xn xnVar = this.f36220v0;
        if (!xnVar.Oa && !xnVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.o2) xnVar).inBubbleMode;
            if (!z10 && xnVar.f39802j0 != null && !xnVar.f39916s3) {
                if (!xnVar.F9() || xnVar.f39781h4) {
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
        xn xnVar = this.f36220v0;
        TLRPC.User user = xnVar.f39752f;
        if (user != null && user.linked_community_id != 0) {
            xnVar.showDialog(new fi.k0(xnVar, xnVar.f39752f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = xnVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            xnVar.showDialog(new fi.k0(xnVar, xnVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        xn xnVar = this.f36220v0;
        if (xnVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        xnVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f36220v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
