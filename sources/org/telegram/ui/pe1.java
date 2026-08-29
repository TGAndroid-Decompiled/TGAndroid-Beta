package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pe1 extends zf.a {
    public final TLRPC.TL_forumTopic f41396c;

    public pe1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f41396c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pe1.class == obj.getClass()) {
            pe1 pe1Var = (pe1) obj;
            int i10 = this.f50845a;
            if (i10 == pe1Var.f50845a && i10 == 0 && this.f41396c.f22444id == pe1Var.f41396c.f22444id) {
                return true;
            }
        }
        return false;
    }
}
