package org.telegram.ui.Cells;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uy;
public final class j2 extends bi.j9 {
    public final r2 S;

    public j2(r2 r2Var) {
        super(null, false);
        this.S = r2Var;
    }

    @Override
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        if (((chat != null && chat.linked_community_id != 0) || (user != null && user.linked_community_id != 0)) && !this.S.O0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d(long j3) {
        r2 r2Var = this.S;
        int i10 = r2Var.F0;
        uy uyVar = r2Var.f22691z4;
        if (uyVar != null && !r2Var.O0) {
            if (j3 > 0) {
                TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
                if (user != null && user.linked_community_id != 0) {
                    uyVar.showDialog(new gi.k0(uyVar, user.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (chat != null && chat.linked_community_id != 0) {
                uyVar.showDialog(new gi.k0(uyVar, chat.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.f22575d0;
        if (n2Var == null) {
            return;
        }
        n2Var.f(r2Var);
    }

    @Override
    public final void f(long j3) {
        r2 r2Var = this.S;
        n2 n2Var = r2Var.f22575d0;
        if (n2Var == null) {
            return;
        }
        if (r2Var.J0 != 0) {
            n2Var.c();
        } else {
            n2Var.e(r2Var);
        }
    }
}
