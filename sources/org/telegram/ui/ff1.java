package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ff1 extends qg.a {
    public final TLRPC.TL_forumTopic f39358c;

    public ff1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f39358c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ff1.class != obj.getClass()) {
            return false;
        }
        ff1 ff1Var = (ff1) obj;
        if (this.f47040a != ff1Var.f47040a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39358c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ff1Var.f39358c) == null || tL_forumTopic2.f22079id == tL_forumTopic.f22079id) {
            return true;
        }
        return false;
    }
}
