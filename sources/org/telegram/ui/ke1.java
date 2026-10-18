package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ke1 extends pg.a {
    public final TLRPC.TL_forumTopic f38501c;

    public ke1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f38501c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ke1.class == obj.getClass()) {
            ke1 ke1Var = (ke1) obj;
            int i10 = this.f44291a;
            if (i10 == ke1Var.f44291a && i10 == 0 && this.f38501c.f20324id == ke1Var.f38501c.f20324id) {
                return true;
            }
        }
        return false;
    }
}
