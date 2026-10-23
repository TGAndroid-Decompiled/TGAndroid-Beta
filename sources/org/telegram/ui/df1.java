package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class df1 extends pg.a {
    public final TLRPC.TL_forumTopic f36616c;

    public df1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f36616c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || df1.class != obj.getClass()) {
            return false;
        }
        df1 df1Var = (df1) obj;
        if (this.f44713a != df1Var.f44713a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f36616c;
        if (tL_forumTopic2 == null || (tL_forumTopic = df1Var.f36616c) == null || tL_forumTopic2.f20395id == tL_forumTopic.f20395id) {
            return true;
        }
        return false;
    }
}
