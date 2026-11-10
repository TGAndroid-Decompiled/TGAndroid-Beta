package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p01 {
    public TLRPC.TL_forumTopic f36747a;
    public org.telegram.messenger.uv f36748b;
    public final s01 f36749c;

    public p01(s01 s01Var) {
        this.f36749c = s01Var;
    }

    public final long a() {
        org.telegram.messenger.uv uvVar = this.f36748b;
        if (uvVar != null) {
            return uvVar.f25900a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f36747a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f36749c.f37795c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f27012id;
    }
}
