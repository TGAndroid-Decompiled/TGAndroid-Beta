package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class mj extends org.telegram.ui.Components.fo {
    public final xn f35348v0;

    public mj(xn xnVar, Context context, xn xnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, xnVar2, z10, d6Var);
        this.f35348v0 = xnVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        xn xnVar = this.f35348v0;
        if (!xnVar.Oa && !xnVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.n2) xnVar).inBubbleMode;
            if (!z10 && xnVar.f39421j0 != null && !xnVar.f39535s3) {
                if (!xnVar.F9() || xnVar.f39400h4) {
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
        xn xnVar = this.f35348v0;
        TLRPC.User user = xnVar.f39372f;
        if (user != null && user.linked_community_id != 0) {
            xnVar.showDialog(new fi.k0(xnVar, xnVar.f39372f.linked_community_id, null, null));
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
        xn xnVar = this.f35348v0;
        if (xnVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        xnVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f35348v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
