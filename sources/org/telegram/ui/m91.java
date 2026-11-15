package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class m91 extends rg.a {
    public final TLRPC.TL_forumTopic f49191c;

    public m91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.f49191c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m91.class == obj.getClass()) {
            m91 m91Var = (m91) obj;
            int i7 = this.f56015a;
            if (i7 == m91Var.f56015a && i7 == 0 && this.f49191c.f28103id == m91Var.f49191c.f28103id) {
                return true;
            }
        }
        return false;
    }
}
