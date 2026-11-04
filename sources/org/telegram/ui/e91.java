package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class e91 extends sg.a {
    public final TLRPC.TL_forumTopic f44941c;

    public e91(int i3, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i3, true);
        this.f44941c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e91.class == obj.getClass()) {
            e91 e91Var = (e91) obj;
            int i3 = this.f54715a;
            if (i3 == e91Var.f54715a && i3 == 0 && this.f44941c.f27053id == e91Var.f44941c.f27053id) {
                return true;
            }
        }
        return false;
    }
}
