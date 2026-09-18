package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ig1 extends og.a {
    public final TLRPC.TL_forumTopic f34527c;

    public ig1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f34527c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || ig1.class != obj.getClass()) {
            return false;
        }
        ig1 ig1Var = (ig1) obj;
        if (this.f15672a != ig1Var.f15672a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f34527c;
        if (tL_forumTopic2 == null || (tL_forumTopic = ig1Var.f34527c) == null || tL_forumTopic2.f18348id == tL_forumTopic.f18348id) {
            return true;
        }
        return false;
    }
}
