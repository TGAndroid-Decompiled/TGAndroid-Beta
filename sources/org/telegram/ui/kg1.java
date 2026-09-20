package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg1 extends og.a {
    public final TLRPC.TL_forumTopic f35181c;

    public kg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f35181c = tL_forumTopic;
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
        if (this.f15704a != kg1Var.f15704a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f35181c;
        if (tL_forumTopic2 == null || (tL_forumTopic = kg1Var.f35181c) == null || tL_forumTopic2.f18380id == tL_forumTopic.f18380id) {
            return true;
        }
        return false;
    }
}
