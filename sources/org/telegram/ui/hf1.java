package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hf1 extends qg.a {
    public final TLRPC.TL_forumTopic f39876c;

    public hf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f39876c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || hf1.class != obj.getClass()) {
            return false;
        }
        hf1 hf1Var = (hf1) obj;
        if (this.f47075a != hf1Var.f47075a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39876c;
        if (tL_forumTopic2 == null || (tL_forumTopic = hf1Var.f39876c) == null || tL_forumTopic2.f22080id == tL_forumTopic.f22080id) {
            return true;
        }
        return false;
    }
}
