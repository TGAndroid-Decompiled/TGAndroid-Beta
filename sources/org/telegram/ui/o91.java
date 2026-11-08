package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o91 extends rg.a {
    public final TLRPC.TL_forumTopic f48337c;

    public o91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.f48337c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o91.class == obj.getClass()) {
            o91 o91Var = (o91) obj;
            int i7 = this.f54532a;
            if (i7 == o91Var.f54532a && i7 == 0 && this.f48337c.f27008id == o91Var.f48337c.f27008id) {
                return true;
            }
        }
        return false;
    }
}
