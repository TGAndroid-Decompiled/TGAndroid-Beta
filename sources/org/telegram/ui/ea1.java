package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ea1 extends rg.a {
    public final TLRPC.TL_forumTopic f45222c;

    public ea1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f45222c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ea1.class != obj.getClass()) {
            return false;
        }
        ea1 ea1Var = (ea1) obj;
        if (this.f54543a != ea1Var.f54543a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f45222c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ea1Var.f45222c) == null || tL_forumTopic2.f27012id == tL_forumTopic.f27012id) {
            return true;
        }
        return false;
    }
}
