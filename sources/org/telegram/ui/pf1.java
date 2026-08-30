package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pf1 extends bg.b {
    public final TLRPC.TL_forumTopic f37302c;

    public pf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f37302c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || pf1.class != obj.getClass()) {
            return false;
        }
        pf1 pf1Var = (pf1) obj;
        if (this.f1808a != pf1Var.f1808a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f37302c;
        if (tL_forumTopic2 == null || (tL_forumTopic = pf1Var.f37302c) == null || tL_forumTopic2.f19236id == tL_forumTopic.f19236id) {
            return true;
        }
        return false;
    }
}
