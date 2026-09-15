package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig1 extends og.a {
    public final TLRPC.TL_forumTopic f34672c;

    public ig1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f34672c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ig1.class != obj.getClass()) {
            return false;
        }
        ig1 ig1Var = (ig1) obj;
        if (this.f15533a != ig1Var.f15533a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f34672c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ig1Var.f34672c) == null || tL_forumTopic2.f18164id == tL_forumTopic.f18164id) {
            return true;
        }
        return false;
    }
}
