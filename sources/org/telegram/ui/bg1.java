package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bg1 extends og.a {
    public final TLRPC.TL_forumTopic f35138c;

    public bg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f35138c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || bg1.class != obj.getClass()) {
            return false;
        }
        bg1 bg1Var = (bg1) obj;
        if (this.f17192a != bg1Var.f17192a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f35138c;
        if (tL_forumTopic2 == null || (tL_forumTopic = bg1Var.f35138c) == null || tL_forumTopic2.f20099id == tL_forumTopic.f20099id) {
            return true;
        }
        return false;
    }
}
