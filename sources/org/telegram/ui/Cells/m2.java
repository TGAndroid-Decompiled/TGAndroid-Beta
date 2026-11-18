package org.telegram.ui.Cells;

import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cx;
public final class m2 extends fi.e7 {
    public final t2 S;

    public m2(t2 t2Var) {
        super(null, false);
        this.S = t2Var;
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
        t2 t2Var = this.S;
        int i7 = t2Var.G0;
        cx cxVar = t2Var.E4;
        if (cxVar != null && !t2Var.P0) {
            if (j3 > 0) {
                TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(j3));
                if (c22 != null && c22.linked_community_id != 0) {
                    cxVar.showDialog(new li.d0(cxVar, c22.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-j3));
            if (O0 != null && O0.linked_community_id != 0) {
                cxVar.showDialog(new li.d0(cxVar, O0.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.f31863e0;
        if (p2Var == null) {
            return;
        }
        p2Var.w(t2Var);
    }

    @Override
    public final void f(long j3) {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.f31863e0;
        if (p2Var == null) {
            return;
        }
        if (t2Var.K0 != 0) {
            p2Var.q();
        } else {
            p2Var.u(t2Var);
        }
    }
}
