package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg1 extends og.a {
    public final TLRPC.TL_forumTopic f39334c;

    public kg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f39334c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || kg1.class != obj.getClass()) {
            return false;
        }
        kg1 kg1Var = (kg1) obj;
        if (this.f17129a != kg1Var.f17129a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39334c;
        if (tL_forumTopic2 == null || (tL_forumTopic = kg1Var.f39334c) == null || tL_forumTopic2.f20094id == tL_forumTopic.f20094id) {
            return true;
        }
        return false;
    }
}
