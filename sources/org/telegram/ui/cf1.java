package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cf1 extends pg.a {
    public final TLRPC.TL_forumTopic f36326c;

    public cf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f36326c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || cf1.class != obj.getClass()) {
            return false;
        }
        cf1 cf1Var = (cf1) obj;
        if (this.f44712a != cf1Var.f44712a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f36326c;
        if (tL_forumTopic2 == null || (tL_forumTopic = cf1Var.f36326c) == null || tL_forumTopic2.f20396id == tL_forumTopic.f20396id) {
            return true;
        }
        return false;
    }
}
