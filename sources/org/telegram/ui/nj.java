package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class nj extends org.telegram.ui.Components.ho {
    public final yn f39005v0;

    public nj(yn ynVar, Context context, yn ynVar2, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, ynVar2, z10, d6Var);
        this.f39005v0 = ynVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        yn ynVar = this.f39005v0;
        if (!ynVar.Ma && !ynVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.n2) ynVar).inBubbleMode;
            if (!z10 && ynVar.f43359h0 != null && !ynVar.f43471q3) {
                if (!ynVar.E9() || ynVar.f43339f4) {
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
        yn ynVar = this.f39005v0;
        TLRPC.User user = ynVar.f43334f;
        if (user != null && user.linked_community_id != 0) {
            ynVar.showDialog(new fi.k0(ynVar, ynVar.f43334f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = ynVar.f43322e;
        if (chat != null && chat.linked_community_id != 0) {
            ynVar.showDialog(new fi.k0(ynVar, ynVar.f43322e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        yn ynVar = this.f39005v0;
        if (ynVar.D9()) {
            str = "";
        } else {
            str = null;
        }
        ynVar.ka(str);
    }

    @Override
    public final boolean o() {
        if (this.f39005v0.P3 == 3) {
            return true;
        }
        return false;
    }
}
