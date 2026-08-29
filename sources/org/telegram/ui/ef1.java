package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ef1 extends zf.a {
    public final TLRPC.TL_forumTopic f37806c;

    public ef1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f37806c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ef1.class != obj.getClass()) {
            return false;
        }
        ef1 ef1Var = (ef1) obj;
        if (this.f50845a != ef1Var.f50845a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f37806c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ef1Var.f37806c) == null || tL_forumTopic2.f22444id == tL_forumTopic.f22444id) {
            return true;
        }
        return false;
    }
}
