package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ne1 extends xf.a {

    public final TLRPC.TL_forumTopic f40813c;

    public ne1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f40813c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ne1.class == obj.getClass()) {
            ne1 ne1Var = (ne1) obj;
            int i10 = this.f49413a;
            if (i10 == ne1Var.f49413a && i10 == 0 && this.f40813c.f22432id == ne1Var.f40813c.f22432id) {
                return true;
            }
        }
        return false;
    }
}
