package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class aa1 extends rg.a {
    public final TLRPC.TL_forumTopic f43611c;

    public aa1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f43611c = tL_forumTopic;
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
        if (this.f54439a != aa1Var.f54439a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f43611c;
        if (tL_forumTopic2 == null || (tL_forumTopic = aa1Var.f43611c) == null || tL_forumTopic2.f27005id == tL_forumTopic.f27005id) {
            return true;
        }
        return false;
    }
}
