package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ke1 extends pg.a {
    public final TLRPC.TL_forumTopic f38515c;

    public ke1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f38515c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ke1.class == obj.getClass()) {
            ke1 ke1Var = (ke1) obj;
            int i10 = this.f44334a;
            if (i10 == ke1Var.f44334a && i10 == 0 && this.f38515c.f20331id == ke1Var.f38515c.f20331id) {
                return true;
            }
        }
        return false;
    }
}
