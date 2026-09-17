package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class pj extends org.telegram.ui.Components.co {
    public final co f39533v0;

    public pj(co coVar, Context context, co coVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, coVar2, z10, f6Var);
        this.f39533v0 = coVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        co coVar = this.f39533v0;
        if (!coVar.Oa && !coVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.n2) coVar).inBubbleMode;
            if (!z10 && coVar.f35299j0 != null && !coVar.f35413s3) {
                if (!coVar.F9() || coVar.f35278h4) {
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
        co coVar = this.f39533v0;
        TLRPC.User user = coVar.f35250f;
        if (user != null && user.linked_community_id != 0) {
            coVar.showDialog(new gi.k0(coVar, coVar.f35250f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = coVar.f35238e;
        if (chat != null && chat.linked_community_id != 0) {
            coVar.showDialog(new gi.k0(coVar, coVar.f35238e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        co coVar = this.f39533v0;
        if (coVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        coVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f39533v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
