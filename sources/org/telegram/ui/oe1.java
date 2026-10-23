package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class oe1 extends pg.a {
    public final TLRPC.TL_forumTopic f40146c;

    public oe1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f40146c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oe1.class == obj.getClass()) {
            oe1 oe1Var = (oe1) obj;
            int i10 = this.f44713a;
            if (i10 == oe1Var.f44713a && i10 == 0 && this.f40146c.f20395id == oe1Var.f40146c.f20395id) {
                return true;
            }
        }
        return false;
    }
}
