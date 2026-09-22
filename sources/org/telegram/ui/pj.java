package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class pj extends org.telegram.ui.Components.eo {
    public final zn f36602v0;

    public pj(zn znVar, Context context, zn znVar2, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, znVar2, z10, f6Var);
        this.f36602v0 = znVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        zn znVar = this.f36602v0;
        if (!znVar.Oa && !znVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.n2) znVar).inBubbleMode;
            if (!z10 && znVar.f40376j0 != null && !znVar.f40490s3) {
                if (!znVar.F9() || znVar.f40355h4) {
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
        zn znVar = this.f36602v0;
        TLRPC.User user = znVar.f40326f;
        if (user != null && user.linked_community_id != 0) {
            znVar.showDialog(new fi.k0(znVar, znVar.f40326f.linked_community_id, null, null));
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
        zn znVar = this.f36602v0;
        if (znVar.E9()) {
            str = "";
        } else {
            str = null;
        }
        znVar.la(str);
    }

    @Override
    public final boolean o() {
        if (this.f36602v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
