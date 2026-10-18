package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class jj extends org.telegram.ui.Components.oo {
    public final sn f38235v0;

    public jj(sn snVar, Context context, sn snVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, snVar2, z10, d6Var);
        this.f38235v0 = snVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        sn snVar = this.f38235v0;
        if (!snVar.Pa && !snVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.n2) snVar).inBubbleMode;
            if (!z10 && snVar.f41277j0 != null && !snVar.f41392s3) {
                if (!snVar.K9() || snVar.f41258h4) {
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
        sn snVar = this.f38235v0;
        TLRPC.User user = snVar.f41229f;
        if (user != null && user.linked_community_id != 0) {
            snVar.showDialog(new hi.k0(snVar, snVar.f41229f.linked_community_id, null, null));
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
        sn snVar = this.f38235v0;
        if (snVar.J9()) {
            str = "";
        } else {
            str = null;
        }
        snVar.qa(str);
    }

    @Override
    public final boolean o() {
        if (this.f38235v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
