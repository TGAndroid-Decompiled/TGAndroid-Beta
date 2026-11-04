package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qi extends org.telegram.ui.Components.jn {
    public final wm B0;

    public qi(wm wmVar, Context context, wm wmVar2, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, wmVar2, z10, e6Var);
        this.B0 = wmVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        wm wmVar = this.B0;
        if (!wmVar.jb && !wmVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.d2) wmVar).inBubbleMode;
            if (!z10 && wmVar.f51371k0 != null && !wmVar.H3) {
                if (!wmVar.da() || wmVar.f51525w4) {
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
        wm wmVar = this.B0;
        TLRPC.User user = wmVar.f51306f;
        if (user != null && user.linked_community_id != 0) {
            wmVar.showDialog(new ji.b0(wmVar, wmVar.f51306f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = wmVar.f51292e;
        if (chat != null && chat.linked_community_id != 0) {
            wmVar.showDialog(new ji.b0(wmVar, wmVar.f51292e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        wm wmVar = this.B0;
        if (wmVar.ca()) {
            str = "";
        } else {
            str = null;
        }
        wmVar.La(str);
    }

    @Override
    public final boolean o() {
        if (this.B0.f51325g4 == 3) {
            return true;
        }
        return false;
    }
}
