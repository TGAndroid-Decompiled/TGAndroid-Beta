package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class qj extends org.telegram.ui.Components.sn {
    public final un A0;

    public qj(un unVar, Context context, un unVar2, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, unVar2, z10, p6Var);
        this.A0 = unVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        un unVar = this.A0;
        if (!unVar.f42100ib && !unVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.k2) unVar).inBubbleMode;
            if (!z10 && unVar.f42102j0 != null && !unVar.G3) {
                if (!unVar.Y9() || unVar.f42256v4) {
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
        un unVar = this.A0;
        TLRPC.User user = unVar.f42054f;
        if (user != null && user.linked_community_id != 0) {
            unVar.showDialog(new yh.z(unVar, unVar.f42054f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            unVar.showDialog(new yh.z(unVar, unVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        un unVar = this.A0;
        if (unVar.X9()) {
            str = "";
        } else {
            str = null;
        }
        unVar.Ga(str);
    }

    @Override
    public final boolean o() {
        if (this.A0.f42059f4 == 3) {
            return true;
        }
        return false;
    }
}
