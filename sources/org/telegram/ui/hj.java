package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class hj extends org.telegram.ui.Components.mo {
    public final sn f37877z0;

    public hj(sn snVar, Context context, sn snVar2, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, snVar2, z10, g6Var);
        this.f37877z0 = snVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        sn snVar = this.f37877z0;
        if (!snVar.f41469bb && !snVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.o2) snVar).inBubbleMode;
            if (!z10 && snVar.f41557j0 != null && !snVar.E3) {
                if (!snVar.K9() || snVar.f41686t4) {
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
        sn snVar = this.f37877z0;
        TLRPC.User user = snVar.f41509f;
        if (user != null && user.linked_community_id != 0) {
            snVar.showDialog(new hi.k0(snVar, snVar.f41509f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = snVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            snVar.showDialog(new hi.k0(snVar, snVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        sn snVar = this.f37877z0;
        if (snVar.J9()) {
            str = "";
        } else {
            str = null;
        }
        snVar.qa(str);
    }

    @Override
    public final boolean p() {
        if (this.f37877z0.f41489d4 == 3) {
            return true;
        }
        return false;
    }
}
