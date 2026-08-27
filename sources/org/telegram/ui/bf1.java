package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class bf1 extends xf.a {

    public final TLRPC.TL_forumTopic f36810c;

    public bf1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f36810c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || bf1.class != obj.getClass()) {
            return false;
        }
        bf1 bf1Var = (bf1) obj;
        if (this.f49413a != bf1Var.f49413a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f36810c;
        return tL_forumTopic2 == null || (tL_forumTopic = bf1Var.f36810c) == null || tL_forumTopic2.f22432id == tL_forumTopic.f22432id;
    }
}
