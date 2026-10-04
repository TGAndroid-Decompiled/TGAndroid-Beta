package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dg1 extends og.a {
    public final TLRPC.TL_forumTopic f35769c;

    public dg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f35769c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || dg1.class != obj.getClass()) {
            return false;
        }
        dg1 dg1Var = (dg1) obj;
        if (this.f17183a != dg1Var.f17183a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f35769c;
        if (tL_forumTopic2 == null || (tL_forumTopic = dg1Var.f35769c) == null || tL_forumTopic2.f20090id == tL_forumTopic.f20090id) {
            return true;
        }
        return false;
    }
}
