package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class da1 extends rg.a {
    public final TLRPC.TL_forumTopic f46906c;

    public da1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f46906c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || da1.class != obj.getClass()) {
            return false;
        }
        da1 da1Var = (da1) obj;
        if (this.f56630a != da1Var.f56630a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f46906c;
        if (tL_forumTopic2 == null || (tL_forumTopic = da1Var.f46906c) == null || tL_forumTopic2.f28483id == tL_forumTopic.f28483id) {
            return true;
        }
        return false;
    }
}
