package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p01 {
    public TLRPC.TL_forumTopic f36730a;
    public org.telegram.messenger.uv f36731b;
    public final s01 f36732c;

    public p01(s01 s01Var) {
        this.f36732c = s01Var;
    }

    public final long a() {
        org.telegram.messenger.uv uvVar = this.f36731b;
        if (uvVar != null) {
            return uvVar.f25894a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f36730a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f36732c.f37817c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f27005id;
    }
}
