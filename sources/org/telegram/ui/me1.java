package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class me1 extends wf.a {
    public final TLRPC.TL_forumTopic f40405c;

    public me1(int i9, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i9, true);
        this.f40405c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && me1.class == obj.getClass()) {
            me1 me1Var = (me1) obj;
            int i9 = this.f48814a;
            if (i9 == me1Var.f48814a && i9 == 0 && this.f40405c.f22432id == me1Var.f40405c.f22432id) {
                return true;
            }
        }
        return false;
    }
}
