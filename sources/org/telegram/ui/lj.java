package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class lj extends org.telegram.ui.Components.po {
    public final wn f41192z0;

    public lj(wn wnVar, Context context, wn wnVar2, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, wnVar2, z10, u6Var);
        this.f41192z0 = wnVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        wn wnVar = this.f41192z0;
        if (!wnVar.f45124fb && !wnVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.r2) wnVar).inBubbleMode;
            if (!z10 && wnVar.f45162j0 != null && !wnVar.E3) {
                if (!wnVar.R9() || wnVar.f45290t4) {
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
        wn wnVar = this.f41192z0;
        TLRPC.User user = wnVar.f45113f;
        if (user != null && user.linked_community_id != 0) {
            wnVar.showDialog(new ii.j0(wnVar, wnVar.f45113f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = wnVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            wnVar.showDialog(new ii.j0(wnVar, wnVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        wn wnVar = this.f41192z0;
        if (wnVar.Q9()) {
            str = "";
        } else {
            str = null;
        }
        wnVar.ya(str);
    }

    @Override
    public final boolean o() {
        if (this.f41192z0.f45091d4 == 3) {
            return true;
        }
        return false;
    }
}
