package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mg1 extends og.a {
    public final TLRPC.TL_forumTopic f40042c;

    public mg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f40042c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || mg1.class != obj.getClass()) {
            return false;
        }
        mg1 mg1Var = (mg1) obj;
        if (this.f16877a != mg1Var.f16877a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f40042c;
        if (tL_forumTopic2 == null || (tL_forumTopic = mg1Var.f40042c) == null || tL_forumTopic2.f19855id == tL_forumTopic.f19855id) {
            return true;
        }
        return false;
    }
}
