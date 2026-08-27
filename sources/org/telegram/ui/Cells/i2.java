package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gy;

public final class i2 extends jh.h7 {
    public final p2 S;

    public i2(p2 p2Var) {
        super(null, false);
        this.S = p2Var;
    }

    @Override
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return (((chat == null || chat.linked_community_id == 0) && (user == null || user.linked_community_id == 0)) || this.S.K0) ? false : true;
    }

    @Override
    public final boolean d(long j10) {
        p2 p2Var = this.S;
        int i10 = p2Var.B0;
        gy gyVar = p2Var.v4;
        if (gyVar == null || p2Var.K0) {
            return false;
        }
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            if (user == null || user.linked_community_id == 0) {
                return false;
            }
            gyVar.showDialog(new oh.j0(gyVar, user.linked_community_id));
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || chat.linked_community_id == 0) {
            return false;
        }
        gyVar.showDialog(new oh.j0(gyVar, chat.linked_community_id));
        return true;
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
