package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ne1 extends pg.a {
    public final TLRPC.TL_forumTopic f39813c;

    public ne1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f39813c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ne1.class == obj.getClass()) {
            ne1 ne1Var = (ne1) obj;
            int i10 = this.f44712a;
            if (i10 == ne1Var.f44712a && i10 == 0 && this.f39813c.f20396id == ne1Var.f39813c.f20396id) {
                return true;
            }
        }
        return false;
    }
}
