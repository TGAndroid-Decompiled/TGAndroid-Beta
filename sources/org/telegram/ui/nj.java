package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class nj extends org.telegram.ui.Components.yn {
    public final zn f36526s0;

    public nj(zn znVar, Context context, zn znVar2, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, znVar2, z4, f6Var);
        this.f36526s0 = znVar;
    }

    @Override
    public final boolean a() {
        boolean z4;
        zn znVar = this.f36526s0;
        if (!znVar.La && !znVar.isInPreviewMode()) {
            z4 = ((org.telegram.ui.ActionBar.p2) znVar).inBubbleMode;
            if (!z4 && znVar.f40588g0 != null && !znVar.f40701p3) {
                if (!znVar.F9() || znVar.f40567e4) {
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
        zn znVar = this.f36526s0;
        TLRPC.User user = znVar.f40575f;
        if (user != null && user.linked_community_id != 0) {
            znVar.showDialog(new sh.i0(znVar, znVar.f40575f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = znVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            znVar.showDialog(new sh.i0(znVar, znVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        zn znVar = this.f36526s0;
        if (znVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        znVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f36526s0.O3 == 3) {
            return true;
        }
        return false;
    }
}
