package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jf1 extends cg.b {
    public final TLRPC.TL_forumTopic f38044c;

    public jf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f38044c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jf1.class == obj.getClass()) {
            jf1 jf1Var = (jf1) obj;
            int i10 = this.f2505a;
            if (i10 == jf1Var.f2505a && i10 == 0 && this.f38044c.f20897id == jf1Var.f38044c.f20897id) {
                return true;
            }
        }
        return false;
    }
}
