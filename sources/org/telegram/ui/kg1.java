package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg1 extends og.a {
    public final TLRPC.TL_forumTopic f35282c;

    public kg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f35282c = tL_forumTopic;
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
        if (this.f15543a != kg1Var.f15543a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f35282c;
        if (tL_forumTopic2 == null || (tL_forumTopic = kg1Var.f35282c) == null || tL_forumTopic2.f18173id == tL_forumTopic.f18173id) {
            return true;
        }
        return false;
    }
}
