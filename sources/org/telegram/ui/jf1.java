package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jf1 extends bg.b {
    public final TLRPC.TL_forumTopic f35268c;

    public jf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f35268c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jf1.class == obj.getClass()) {
            jf1 jf1Var = (jf1) obj;
            int i10 = this.f1830a;
            if (i10 == jf1Var.f1830a && i10 == 0 && this.f35268c.f19211id == jf1Var.f35268c.f19211id) {
                return true;
            }
        }
        return false;
    }
}
