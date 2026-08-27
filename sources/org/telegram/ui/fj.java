package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

public final class fj extends org.telegram.ui.Components.rn {

    public final rn f38148r0;

    public fj(rn rnVar, Context context, rn rnVar2, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, rnVar2, z10, c6Var);
        this.f38148r0 = rnVar;
    }

    @Override
    public final boolean a() {
        rn rnVar = this.f38148r0;
        if (rnVar.Ka || rnVar.isInPreviewMode() || ((org.telegram.ui.ActionBar.n2) rnVar).inBubbleMode || rnVar.f42040f0 == null || rnVar.f42154o3) {
            return false;
        }
        return !rnVar.F9() || rnVar.f42017d4;
    }

    @Override
    public final boolean d() {
        rn rnVar = this.f38148r0;
        TLRPC.User user = rnVar.f42039f;
        if (user != null && user.linked_community_id != 0) {
            rnVar.showDialog(new oh.j0(rnVar, rnVar.f42039f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = rnVar.f42026e;
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        rnVar.showDialog(new oh.j0(rnVar, rnVar.f42026e.linked_community_id, null, null));
        return true;
    }

    @Override
    public final void f() {
        rn rnVar = this.f38148r0;
        rnVar.la(rnVar.E9() ? "" : null);
    }

    @Override
    public final boolean p() {
        return this.f38148r0.N3 == 3;
    }
}
