package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bg1 extends og.a {
    public final TLRPC.TL_forumTopic f32419c;

    public bg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f32419c = tL_forumTopic;
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
        if (this.f15715a != bg1Var.f15715a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f32419c;
        if (tL_forumTopic2 == null || (tL_forumTopic = bg1Var.f32419c) == null || tL_forumTopic2.f18388id == tL_forumTopic.f18388id) {
            return true;
        }
        return false;
    }
}
