package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ij extends org.telegram.ui.Components.po {
    public final un f40253z0;

    public ij(un unVar, Context context, un unVar2, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, unVar2, z10, u6Var);
        this.f40253z0 = unVar;
    }

    @Override
    public final boolean a() {
        boolean z10;
        un unVar = this.f40253z0;
        if (!unVar.f44204bb && !unVar.isInPreviewMode()) {
            z10 = ((org.telegram.ui.ActionBar.r2) unVar).inBubbleMode;
            if (!z10 && unVar.f44294j0 != null && !unVar.E3) {
                if (!unVar.O9() || unVar.f44422t4) {
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
        un unVar = this.f40253z0;
        TLRPC.User user = unVar.f44245f;
        if (user != null && user.linked_community_id != 0) {
            unVar.showDialog(new ii.j0(unVar, unVar.f44245f.linked_community_id, null, null));
            return true;
        }
        TLRPC.Chat chat = unVar.e;
        if (chat != null && chat.linked_community_id != 0) {
            unVar.showDialog(new ii.j0(unVar, unVar.e.linked_community_id, null, null));
            return true;
        }
        return false;
    }

    @Override
    public final void f() {
        String str;
        un unVar = this.f40253z0;
        if (unVar.N9()) {
            str = "";
        } else {
            str = null;
        }
        unVar.va(str);
    }

    @Override
    public final boolean o() {
        if (this.f40253z0.f44224d4 == 3) {
            return true;
        }
        return false;
    }
}
