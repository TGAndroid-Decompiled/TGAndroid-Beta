package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fb1 extends hg.b {
    public final TLRPC.TL_forumTopic f37097c;

    public fb1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f37097c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fb1.class == obj.getClass()) {
            fb1 fb1Var = (fb1) obj;
            int i10 = this.f7681a;
            if (i10 == fb1Var.f7681a && i10 == 0 && this.f37097c.f19846id == fb1Var.f37097c.f19846id) {
                return true;
            }
        }
        return false;
    }
}
