package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jg1 extends og.a {
    public final TLRPC.TL_forumTopic f39086c;

    public jg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f39086c = tL_forumTopic;
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
        if (this.f17211a != jg1Var.f17211a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39086c;
        if (tL_forumTopic2 == null || (tL_forumTopic = jg1Var.f39086c) == null || tL_forumTopic2.f20120id == tL_forumTopic.f20120id) {
            return true;
        }
        return false;
    }
}
