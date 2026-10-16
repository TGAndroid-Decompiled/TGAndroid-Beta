package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yy;
public final class k2 extends bi.m9 {
    public final s2 S;

    public k2(s2 s2Var) {
        super(null, false);
        this.S = s2Var;
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
        s2 s2Var = this.S;
        int i10 = s2Var.F0;
        yy yyVar = s2Var.D4;
        if (yyVar != null && !s2Var.O0) {
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && user.linked_community_id != 0) {
                    yyVar.showDialog(new gi.k0(yyVar, user.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null && chat.linked_community_id != 0) {
                yyVar.showDialog(new gi.k0(yyVar, chat.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        s2 s2Var = this.S;
        o2 o2Var = s2Var.f21514d0;
        if (o2Var == null) {
            return;
        }
        o2Var.g(s2Var);
    }

    @Override
    public final void f(long j10) {
        s2 s2Var = this.S;
        o2 o2Var = s2Var.f21514d0;
        if (o2Var == null) {
            return;
        }
        if (s2Var.J0 != 0) {
            o2Var.c();
        } else {
            o2Var.f(s2Var);
        }
    }
}
