package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ba1 extends rg.a {
    public final TLRPC.TL_forumTopic f44241c;

    public ba1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f44241c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ba1.class != obj.getClass()) {
            return false;
        }
        ba1 ba1Var = (ba1) obj;
        if (this.f54532a != ba1Var.f54532a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f44241c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ba1Var.f44241c) == null || tL_forumTopic2.f27008id == tL_forumTopic.f27008id) {
            return true;
        }
        return false;
    }
}
