package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class cg1 extends pg.a {
    public final TLRPC.TL_forumTopic f34947c;

    public cg1(int i10, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i10, true);
        this.f34947c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cg1.class == obj.getClass()) {
            cg1 cg1Var = (cg1) obj;
            int i10 = this.f43203a;
            if (i10 == cg1Var.f43203a && i10 == 0 && this.f34947c.f19268id == cg1Var.f34947c.f19268id) {
                return true;
            }
        }
        return false;
    }
}
