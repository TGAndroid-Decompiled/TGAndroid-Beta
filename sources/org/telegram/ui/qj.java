package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qj extends org.telegram.ui.Components.uo {
    public final zn f41224v0;

    public qj(zn znVar, Context context, zn znVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, znVar2, z10, d6Var);
        this.f41224v0 = znVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        zn znVar = this.f41224v0;
        if (!znVar.Pa && !znVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.m2) znVar).inBubbleMode;
            if (!z10 && znVar.f44847j0 != null && !znVar.f44961s3) {
                if (!znVar.K9() || znVar.f44826h4) {
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
        zn znVar = this.f41224v0;
        TLRPC.User user = znVar.f44798f;
        if (user != null && user.linked_community_id != 0) {
            znVar.showDialog(new fi.k0(znVar, znVar.f44798f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = znVar.f44786e;
        if (chat != null && chat.linked_community_id != 0) {
            znVar.showDialog(new fi.k0(znVar, znVar.f44786e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        zn znVar = this.f41224v0;
        if (znVar.J9()) {
            str = "";
        } else {
            str = null;
        }
        znVar.qa(str);
    }

    @Override
    public final boolean p() {
        if (this.f41224v0.R3 == 3) {
            return true;
        }
        return false;
    }
}
