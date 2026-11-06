package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class aa1 extends rg.a {
    public final TLRPC.TL_forumTopic f43587c;

    public aa1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f43587c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || aa1.class != obj.getClass()) {
            return false;
        }
        aa1 aa1Var = (aa1) obj;
        if (this.f54415a != aa1Var.f54415a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f43587c;
        if (tL_forumTopic2 == null || (tL_forumTopic = aa1Var.f43587c) == null || tL_forumTopic2.f27004id == tL_forumTopic.f27004id) {
            return true;
        }
        return false;
    }
}
