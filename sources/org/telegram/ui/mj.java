package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class mj extends org.telegram.ui.Components.go {
    public final wn f35613v0;

    public mj(wn wnVar, Context context, wn wnVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, wnVar2, z10, d6Var);
        this.f35613v0 = wnVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        wn wnVar = this.f35613v0;
        if (!wnVar.Oa && !wnVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.m2) wnVar).inBubbleMode;
            if (!z10 && wnVar.f39519j0 != null && !wnVar.f39633s3) {
                if (!wnVar.F9() || wnVar.f39498h4) {
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
        wn wnVar = this.f35613v0;
        TLRPC.User user = wnVar.f39470f;
        if (user != null && user.linked_community_id != 0) {
            wnVar.showDialog(new fi.k0(wnVar, wnVar.f39470f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            wnVar.showDialog(new fi.k0(wnVar, wnVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        wn wnVar = this.f35613v0;
        if (wnVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        wnVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f35613v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
