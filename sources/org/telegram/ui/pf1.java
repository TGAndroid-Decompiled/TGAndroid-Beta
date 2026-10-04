package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pf1 extends og.a {
    public final TLRPC.TL_forumTopic f39471c;

    public pf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f39471c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pf1.class == obj.getClass()) {
            pf1 pf1Var = (pf1) obj;
            int i10 = this.f17182a;
            if (i10 == pf1Var.f17182a && i10 == 0 && this.f39471c.f20089id == pf1Var.f39471c.f20089id) {
                return true;
            }
        }
        return false;
    }
}
