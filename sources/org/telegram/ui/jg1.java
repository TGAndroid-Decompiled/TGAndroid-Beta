package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class jg1 extends og.a {
    public final TLRPC.TL_forumTopic f34908c;

    public jg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f34908c = tL_forumTopic;
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
        if (this.f15531a != jg1Var.f15531a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f34908c;
        if (tL_forumTopic2 == null || (tL_forumTopic = jg1Var.f34908c) == null || tL_forumTopic2.f18161id == tL_forumTopic.f18161id) {
            return true;
        }
        return false;
    }
}
