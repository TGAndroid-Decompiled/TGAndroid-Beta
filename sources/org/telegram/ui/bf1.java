package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bf1 extends bg.b {
    public final TLRPC.TL_forumTopic f32951c;

    public bf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f32951c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf1.class == obj.getClass()) {
            bf1 bf1Var = (bf1) obj;
            int i10 = this.f1808a;
            if (i10 == bf1Var.f1808a && i10 == 0 && this.f32951c.f19236id == bf1Var.f32951c.f19236id) {
                return true;
            }
        }
        return false;
    }
}
