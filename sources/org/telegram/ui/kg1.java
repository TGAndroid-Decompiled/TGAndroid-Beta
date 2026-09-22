package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg1 extends og.a {
    public final TLRPC.TL_forumTopic f35203c;

    public kg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f35203c = tL_forumTopic;
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
        if (this.f15719a != kg1Var.f15719a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f35203c;
        if (tL_forumTopic2 == null || (tL_forumTopic = kg1Var.f35203c) == null || tL_forumTopic2.f18395id == tL_forumTopic.f18395id) {
            return true;
        }
        return false;
    }
}
