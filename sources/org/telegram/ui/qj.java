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
        if (!unVar.f42289ib && !unVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.k2) unVar).inBubbleMode;
            if (!z10 && unVar.f42291j0 != null && !unVar.G3) {
                if (!unVar.T9() || unVar.f42445v4) {
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
        TLRPC.User user = unVar.f42243f;
        if (user != null && user.linked_community_id != 0) {
            unVar.showDialog(new yh.a0(unVar, unVar.f42243f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            unVar.showDialog(new yh.a0(unVar, unVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        un unVar = this.A0;
        if (unVar.S9()) {
            str = "";
        } else {
            str = null;
        }
        unVar.Ba(str);
    }

    @Override
    public final boolean o() {
        if (this.A0.f42248f4 == 3) {
            return true;
        }
        return false;
    }
}
