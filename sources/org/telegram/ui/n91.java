package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class n91 extends rg.a {
    public final TLRPC.TL_forumTopic f48000c;

    public n91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.f48000c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n91.class == obj.getClass()) {
            n91 n91Var = (n91) obj;
            int i7 = this.f54440a;
            if (i7 == n91Var.f54440a && i7 == 0 && this.f48000c.f27004id == n91Var.f48000c.f27004id) {
                return true;
            }
        }
        return false;
    }
}
