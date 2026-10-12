package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qg1 extends pg.a {
    public final TLRPC.TL_forumTopic f39443c;

    public qg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f39443c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || qg1.class != obj.getClass()) {
            return false;
        }
        qg1 qg1Var = (qg1) obj;
        if (this.f43203a != qg1Var.f43203a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39443c;
        if (tL_forumTopic2 == null || (tL_forumTopic = qg1Var.f39443c) == null || tL_forumTopic2.f19268id == tL_forumTopic.f19268id) {
            return true;
        }
        return false;
    }
}
