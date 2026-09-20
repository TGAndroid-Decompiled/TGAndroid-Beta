package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class oj extends org.telegram.ui.Components.eo {
    public final zn f36322v0;

    public oj(zn znVar, Context context, zn znVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, znVar2, z10, f6Var);
        this.f36322v0 = znVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        zn znVar = this.f36322v0;
        if (!znVar.Oa && !znVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
            if (!z10 && znVar.f40355j0 != null && !znVar.f40469s3) {
                if (!znVar.F9() || znVar.f40334h4) {
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
        zn znVar = this.f36322v0;
        TLRPC.User user = znVar.f40305f;
        if (user != null && user.linked_community_id != 0) {
            znVar.showDialog(new fi.k0(znVar, znVar.f40305f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            znVar.showDialog(new fi.k0(znVar, znVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        zn znVar = this.f36322v0;
        if (znVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        znVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f36322v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
