package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qy;
public final class i2 extends nh.i7 {
    public final q2 S;

    public i2(q2 q2Var) {
        super(null, false);
        this.S = q2Var;
    }

    @Override
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        if (((chat != null && chat.linked_community_id != 0) || (user != null && user.linked_community_id != 0)) && !this.S.L0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d(long j10) {
        q2 q2Var = this.S;
        int i10 = q2Var.C0;
        qy qyVar = q2Var.f21668w4;
        if (qyVar != null && !q2Var.L0) {
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && user.linked_community_id != 0) {
                    qyVar.showDialog(new sh.i0(qyVar, user.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null && chat.linked_community_id != 0) {
                qyVar.showDialog(new sh.i0(qyVar, chat.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        q2 q2Var = this.S;
        m2 m2Var = q2Var.f21553a0;
        if (m2Var == null) {
            return;
        }
        m2Var.f(q2Var);
    }

    @Override
    public final void f(long j10) {
        q2 q2Var = this.S;
        m2 m2Var = q2Var.f21553a0;
        if (m2Var == null) {
            return;
        }
        if (q2Var.G0 != 0) {
            m2Var.c();
        } else {
            m2Var.e(q2Var);
        }
    }
}
