package org.telegram.ui.Cells;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.bx;
public final class n2 extends fi.e7 {
    public final u2 S;

    public n2(u2 u2Var) {
        super(null, false);
        this.S = u2Var;
    }

    @Override
    public final boolean c(TLRPC.Chat chat, TLRPC.User user) {
        if (((chat != null && chat.linked_community_id != 0) || (user != null && user.linked_community_id != 0)) && !this.S.P0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean d(long j3) {
        u2 u2Var = this.S;
        int i7 = u2Var.G0;
        bx bxVar = u2Var.E4;
        if (bxVar != null && !u2Var.P0) {
            if (j3 > 0) {
                TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
                if (c22 != null && c22.linked_community_id != 0) {
                    bxVar.showDialog(new li.c0(bxVar, c22.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            if (O0 != null && O0.linked_community_id != 0) {
                bxVar.showDialog(new li.c0(bxVar, O0.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        u2 u2Var = this.S;
        q2 q2Var = u2Var.f31992e0;
        if (q2Var == null) {
            return;
        }
        q2Var.w(u2Var);
    }

    @Override
    public final void f(long j3) {
        u2 u2Var = this.S;
        q2 q2Var = u2Var.f31992e0;
        if (q2Var == null) {
            return;
        }
        if (u2Var.K0 != 0) {
            q2Var.q();
        } else {
            q2Var.u(u2Var);
        }
    }
}
