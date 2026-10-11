package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jg1 extends og.a {
    public final TLRPC.TL_forumTopic f39052c;

    public jg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f39052c = tL_forumTopic;
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
        if (this.f17175a != jg1Var.f17175a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39052c;
        if (tL_forumTopic2 == null || (tL_forumTopic = jg1Var.f39052c) == null || tL_forumTopic2.f20084id == tL_forumTopic.f20084id) {
            return true;
        }
        return false;
    }
}
