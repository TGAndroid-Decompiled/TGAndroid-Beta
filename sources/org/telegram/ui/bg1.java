package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class bg1 extends pg.a {
    public final TLRPC.TL_forumTopic f34328c;

    public bg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f34328c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bg1.class == obj.getClass()) {
            bg1 bg1Var = (bg1) obj;
            int i10 = this.f42904a;
            if (i10 == bg1Var.f42904a && i10 == 0 && this.f34328c.f18968id == bg1Var.f34328c.f18968id) {
                return true;
            }
        }
        return false;
    }
}
