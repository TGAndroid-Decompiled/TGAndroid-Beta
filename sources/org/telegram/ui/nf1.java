package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nf1 extends og.a {
    public final TLRPC.TL_forumTopic f35984c;

    public nf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f35984c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nf1.class == obj.getClass()) {
            nf1 nf1Var = (nf1) obj;
            int i10 = this.f15731a;
            if (i10 == nf1Var.f15731a && i10 == 0 && this.f35984c.f18404id == nf1Var.f35984c.f18404id) {
                return true;
            }
        }
        return false;
    }
}
