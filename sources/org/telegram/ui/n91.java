package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class n91 extends rg.a {
    public final TLRPC.TL_forumTopic f47974c;

    public n91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.f47974c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n91.class == obj.getClass()) {
            n91 n91Var = (n91) obj;
            int i7 = this.f54415a;
            if (i7 == n91Var.f54415a && i7 == 0 && this.f47974c.f27004id == n91Var.f47974c.f27004id) {
                return true;
            }
        }
        return false;
    }
}
