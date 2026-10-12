package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mg1 extends og.a {
    public final TLRPC.TL_forumTopic f40039c;

    public mg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f40039c = tL_forumTopic;
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
        if (this.f16876a != mg1Var.f16876a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f40039c;
        if (tL_forumTopic2 == null || (tL_forumTopic = mg1Var.f40039c) == null || tL_forumTopic2.f19854id == tL_forumTopic.f19854id) {
            return true;
        }
        return false;
    }
}
