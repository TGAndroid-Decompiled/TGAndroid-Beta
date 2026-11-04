package org.telegram.ui.Cells;

import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uw;
public final class m2 extends ei.o7 {
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
    public final boolean d(long j10) {
        t2 t2Var = this.S;
        int i3 = t2Var.G0;
        uw uwVar = t2Var.E4;
        if (uwVar != null && !t2Var.P0) {
            if (j10 > 0) {
                TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
                if (a22 != null && a22.linked_community_id != 0) {
                    uwVar.showDialog(new ji.b0(uwVar, a22.linked_community_id));
                    return true;
                }
                return false;
            }
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            if (M0 != null && M0.linked_community_id != 0) {
                uwVar.showDialog(new ji.b0(uwVar, M0.linked_community_id));
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e() {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.f30485e0;
        if (p2Var == null) {
            return;
        }
        p2Var.w(t2Var);
    }

    @Override
    public final void f(long j10) {
        t2 t2Var = this.S;
        p2 p2Var = t2Var.f30485e0;
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
