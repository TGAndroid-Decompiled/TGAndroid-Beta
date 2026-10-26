package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cy;
public final class i2 extends di.w7 {
    public final p2 S;

    public i2(p2 p2Var) {
        super(null, false);
        this.S = p2Var;
    }

    @Override
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        if (((chat != null && chat.linked_community_id != 0) || (user != null && user.linked_community_id != 0)) && !this.S.O0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d(long j10) {
        p2 p2Var = this.S;
        int i10 = p2Var.F0;
        cy cyVar = p2Var.D4;
        if (cyVar != null && !p2Var.O0) {
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && user.linked_community_id != 0) {
                    cyVar.showDialog(new ii.j0(cyVar, user.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null && chat.linked_community_id != 0) {
                cyVar.showDialog(new ii.j0(cyVar, chat.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        p2 p2Var = this.S;
        l2 l2Var = p2Var.f24643d0;
        if (l2Var == null) {
            return;
        }
        l2Var.f(p2Var);
    }

    @Override
    public final void f(long j10) {
        p2 p2Var = this.S;
        l2 l2Var = p2Var.f24643d0;
        if (l2Var == null) {
            return;
        }
        if (p2Var.J0 != 0) {
            l2Var.c();
        } else {
            l2Var.e(p2Var);
        }
    }
}
