package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.py;
public final class j2 extends oh.i7 {
    public final r2 S;

    public j2(r2 r2Var) {
        super(null, false);
        this.S = r2Var;
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
        r2 r2Var = this.S;
        int i10 = r2Var.C0;
        py pyVar = r2Var.f23528w4;
        if (pyVar != null && !r2Var.L0) {
            if (j10 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                if (user != null && user.linked_community_id != 0) {
                    pyVar.showDialog(new th.i0(pyVar, user.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat != null && chat.linked_community_id != 0) {
                pyVar.showDialog(new th.i0(pyVar, chat.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.f23413a0;
        if (n2Var == null) {
            return;
        }
        n2Var.f(r2Var);
    }

    @Override
    public final void f(long j10) {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.f23413a0;
        if (n2Var == null) {
            return;
        }
        if (r2Var.G0 != 0) {
            n2Var.c();
        } else {
            n2Var.e(r2Var);
        }
    }
}
