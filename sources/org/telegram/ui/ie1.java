package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ie1 extends pg.a {
    public final TLRPC.TL_forumTopic f37952c;

    public ie1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f37952c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ie1.class == obj.getClass()) {
            ie1 ie1Var = (ie1) obj;
            int i10 = this.f44288a;
            if (i10 == ie1Var.f44288a && i10 == 0 && this.f37952c.f20325id == ie1Var.f37952c.f20325id) {
                return true;
            }
        }
        return false;
    }
}
