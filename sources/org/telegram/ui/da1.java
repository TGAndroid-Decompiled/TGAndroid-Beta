package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class da1 extends rg.a {
    public final TLRPC.TL_forumTopic f46904c;

    public da1(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, false);
        this.f46904c = tL_forumTopic;
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
        if (this.f56589a != da1Var.f56589a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f46904c;
        if (tL_forumTopic2 == null || (tL_forumTopic = da1Var.f46904c) == null || tL_forumTopic2.f28457id == tL_forumTopic.f28457id) {
            return true;
        }
        return false;
    }
}
