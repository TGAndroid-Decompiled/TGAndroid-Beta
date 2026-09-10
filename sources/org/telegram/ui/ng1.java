package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ng1 extends ng.a {
    public final TLRPC.TL_forumTopic f35271c;

    public ng1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f35271c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ng1.class != obj.getClass()) {
            return false;
        }
        ng1 ng1Var = (ng1) obj;
        if (this.f14046a != ng1Var.f14046a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f35271c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ng1Var.f35271c) == null || tL_forumTopic2.f17247id == tL_forumTopic.f17247id) {
            return true;
        }
        return false;
    }
}
