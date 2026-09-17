package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jg1 extends pg.a {
    public final TLRPC.TL_forumTopic f37771c;

    public jg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f37771c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || jg1.class != obj.getClass()) {
            return false;
        }
        jg1 jg1Var = (jg1) obj;
        if (this.f44072a != jg1Var.f44072a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f37771c;
        if (tL_forumTopic2 == null || (tL_forumTopic = jg1Var.f37771c) == null || tL_forumTopic2.f19921id == tL_forumTopic.f19921id) {
            return true;
        }
        return false;
    }
}
