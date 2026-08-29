package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.fy;
public final class i2 extends lh.h7 {
    public final p2 S;

    public i2(p2 p2Var) {
        super(null, false);
        this.S = p2Var;
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
        p2 p2Var = this.S;
        int i10 = p2Var.B0;
        fy fyVar = p2Var.f24937v4;
        if (fyVar != null && !p2Var.K0) {
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && user.linked_community_id != 0) {
                    fyVar.showDialog(new qh.i0(fyVar, user.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null && chat.linked_community_id != 0) {
                fyVar.showDialog(new qh.i0(fyVar, chat.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        p2 p2Var = this.S;
        l2 l2Var = p2Var.W;
        if (l2Var == null) {
            return;
        }
        l2Var.f(p2Var);
    }

    @Override
    public final void f(long j10) {
        p2 p2Var = this.S;
        l2 l2Var = p2Var.W;
        if (l2Var == null) {
            return;
        }
        if (p2Var.F0 != 0) {
            l2Var.c();
        } else {
            l2Var.e(p2Var);
        }
    }
}
