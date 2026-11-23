package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class da1 extends rg.a {
    public final TLRPC.TL_forumTopic f46869c;

    public da1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f46869c = tL_forumTopic;
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
        if (this.f56599a != da1Var.f56599a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f46869c;
        if (tL_forumTopic2 == null || (tL_forumTopic = da1Var.f46869c) == null || tL_forumTopic2.f28450id == tL_forumTopic.f28450id) {
            return true;
        }
        return false;
    }
}
