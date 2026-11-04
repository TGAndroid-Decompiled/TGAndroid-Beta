package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l01 {
    public TLRPC.TL_forumTopic f35539a;
    public org.telegram.messenger.mv f35540b;
    public final n01 f35541c;

    public l01(n01 n01Var) {
        this.f35541c = n01Var;
    }

    public final long a() {
        org.telegram.messenger.mv mvVar = this.f35540b;
        if (mvVar != null) {
            return mvVar.f24264a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f35539a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f35541c.f36312c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f27053id;
    }
}
