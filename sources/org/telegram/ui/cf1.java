package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cf1 extends wf.a {
    public final TLRPC.TL_forumTopic f37197c;

    public cf1(int i9, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i9, false);
        this.f37197c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || cf1.class != obj.getClass()) {
            return false;
        }
        cf1 cf1Var = (cf1) obj;
        if (this.f48814a != cf1Var.f48814a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f37197c;
        if (tL_forumTopic2 == null || (tL_forumTopic = cf1Var.f37197c) == null || tL_forumTopic2.f22432id == tL_forumTopic.f22432id) {
            return true;
        }
        return false;
    }
}
