package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class df1 extends cg.b {
    public final TLRPC.TL_forumTopic f36216c;

    public df1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f36216c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && df1.class == obj.getClass()) {
            df1 df1Var = (df1) obj;
            int i10 = this.f2505a;
            if (i10 == df1Var.f2505a && i10 == 0 && this.f36216c.f20895id == df1Var.f36216c.f20895id) {
                return true;
            }
        }
        return false;
    }
}
