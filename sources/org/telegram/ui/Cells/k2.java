package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dy;
public final class k2 extends ih.l7 {
    public final r2 S;

    public k2(r2 r2Var) {
        super(null, false);
        this.S = r2Var;
    }

    @Override
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        if (((chat != null && chat.linked_community_id != 0) || (user != null && user.linked_community_id != 0)) && !this.S.K0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d(long j10) {
        r2 r2Var = this.S;
        int i9 = r2Var.B0;
        dy dyVar = r2Var.v4;
        if (dyVar != null && !r2Var.K0) {
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
                if (user != null && user.linked_community_id != 0) {
                    dyVar.showDialog(new nh.j0(dyVar, user.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            if (chat != null && chat.linked_community_id != 0) {
                dyVar.showDialog(new nh.j0(dyVar, chat.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.W;
        if (n2Var == null) {
            return;
        }
        n2Var.f(r2Var);
    }

    @Override
    public final void f(long j10) {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.W;
        if (n2Var == null) {
            return;
        }
        if (r2Var.F0 != 0) {
            n2Var.c();
        } else {
            n2Var.e(r2Var);
        }
    }
}
