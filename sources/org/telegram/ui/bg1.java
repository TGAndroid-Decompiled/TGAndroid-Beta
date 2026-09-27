package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bg1 extends og.a {
    public final TLRPC.TL_forumTopic f32356c;

    public bg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f32356c = tL_forumTopic;
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
        if (this.f15754a != bg1Var.f15754a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f32356c;
        if (tL_forumTopic2 == null || (tL_forumTopic = bg1Var.f32356c) == null || tL_forumTopic2.f18381id == tL_forumTopic.f18381id) {
            return true;
        }
        return false;
    }
}
