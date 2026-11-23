package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o91 extends rg.a {
    public final TLRPC.TL_forumTopic f50609c;

    public o91(int i7, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i7, true);
        this.f50609c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o91.class == obj.getClass()) {
            o91 o91Var = (o91) obj;
            int i7 = this.f56712a;
            if (i7 == o91Var.f56712a && i7 == 0 && this.f50609c.f28544id == o91Var.f50609c.f28544id) {
                return true;
            }
        }
        return false;
    }
}
