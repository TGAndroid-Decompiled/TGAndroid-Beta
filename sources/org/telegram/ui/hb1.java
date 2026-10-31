package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hb1 extends hg.b {
    public final TLRPC.TL_forumTopic f37887c;

    public hb1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f37887c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hb1.class == obj.getClass()) {
            hb1 hb1Var = (hb1) obj;
            int i10 = this.f7680a;
            if (i10 == hb1Var.f7680a && i10 == 0 && this.f37887c.f19845id == hb1Var.f37887c.f19845id) {
                return true;
            }
        }
        return false;
    }
}
