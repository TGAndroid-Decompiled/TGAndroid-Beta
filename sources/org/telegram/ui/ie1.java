package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ie1 extends pg.a {
    public final TLRPC.TL_forumTopic f37962c;

    public ie1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f37962c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ie1.class == obj.getClass()) {
            ie1 ie1Var = (ie1) obj;
            int i10 = this.f44299a;
            if (i10 == ie1Var.f44299a && i10 == 0 && this.f37962c.f20331id == ie1Var.f37962c.f20331id) {
                return true;
            }
        }
        return false;
    }
}
