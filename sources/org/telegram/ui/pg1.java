package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pg1 extends pg.a {
    public final TLRPC.TL_forumTopic f38922c;

    public pg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, false);
        this.f38922c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || pg1.class != obj.getClass()) {
            return false;
        }
        pg1 pg1Var = (pg1) obj;
        if (this.f42904a != pg1Var.f42904a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f38922c;
        if (tL_forumTopic2 == null || (tL_forumTopic = pg1Var.f38922c) == null || tL_forumTopic2.f18968id == tL_forumTopic.f18968id) {
            return true;
        }
        return false;
    }
}
