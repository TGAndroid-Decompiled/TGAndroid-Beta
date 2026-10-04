package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class dg1 extends og.a {
    public final TLRPC.TL_forumTopic f35768c;

    public dg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f35768c = tL_forumTopic;
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
        if (this.f17182a != dg1Var.f17182a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f35768c;
        if (tL_forumTopic2 == null || (tL_forumTopic = dg1Var.f35768c) == null || tL_forumTopic2.f20089id == tL_forumTopic.f20089id) {
            return true;
        }
        return false;
    }
}
