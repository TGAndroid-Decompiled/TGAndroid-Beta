package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ba1 extends rg.a {
    public final TLRPC.TL_forumTopic f45999c;

    public ba1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f45999c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ba1.class != obj.getClass()) {
            return false;
        }
        ba1 ba1Var = (ba1) obj;
        if (this.f56712a != ba1Var.f56712a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f45999c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ba1Var.f45999c) == null || tL_forumTopic2.f28544id == tL_forumTopic.f28544id) {
            return true;
        }
        return false;
    }
}
