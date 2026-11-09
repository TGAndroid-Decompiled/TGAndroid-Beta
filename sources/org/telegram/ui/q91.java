package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class q91 extends rg.a {
    public final TLRPC.TL_forumTopic f48989c;

    public q91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.f48989c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q91.class == obj.getClass()) {
            q91 q91Var = (q91) obj;
            int i7 = this.f54544a;
            if (i7 == q91Var.f54544a && i7 == 0 && this.f48989c.f27008id == q91Var.f48989c.f27008id) {
                return true;
            }
        }
        return false;
    }
}
