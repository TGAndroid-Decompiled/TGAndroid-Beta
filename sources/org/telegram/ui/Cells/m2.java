package org.telegram.ui.Cells;

import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ww;
public final class m2 extends di.n7 {
    public final t2 S;

    public m2(t2 t2Var) {
        super(null, false);
        this.S = t2Var;
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
        t2 t2Var = this.S;
        int i7 = t2Var.F0;
        ww wwVar = t2Var.D4;
        if (wwVar != null && !t2Var.O0) {
            if (j3 > 0) {
                TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
                if (a22 != null && a22.linked_community_id != 0) {
                    wwVar.showDialog(new ii.d0(wwVar, a22.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            if (M0 != null && M0.linked_community_id != 0) {
                wwVar.showDialog(new ii.d0(wwVar, M0.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.f30405d0;
        if (p2Var == null) {
            return;
        }
        p2Var.w(t2Var);
    }

    @Override
    public final void f(long j3) {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.f30405d0;
        if (p2Var == null) {
            return;
        }
        if (t2Var.J0 != 0) {
            p2Var.q();
        } else {
            p2Var.u(t2Var);
        }
    }
}
