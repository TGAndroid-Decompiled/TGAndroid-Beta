package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class kg1 extends og.a {
    public final TLRPC.TL_forumTopic f39288c;

    public kg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f39288c = tL_forumTopic;
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
        if (this.f17125a != kg1Var.f17125a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39288c;
        if (tL_forumTopic2 == null || (tL_forumTopic = kg1Var.f39288c) == null || tL_forumTopic2.f20090id == tL_forumTopic.f20090id) {
            return true;
        }
        return false;
    }
}
