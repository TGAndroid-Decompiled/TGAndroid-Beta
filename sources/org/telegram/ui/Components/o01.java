package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class o01 {
    public TLRPC.TL_forumTopic f36451a;
    public org.telegram.messenger.uv f36452b;
    public final r01 f36453c;

    public o01(r01 r01Var) {
        this.f36453c = r01Var;
    }

    public final long a() {
        org.telegram.messenger.uv uvVar = this.f36452b;
        if (uvVar != null) {
            return uvVar.f25886a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f36451a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f36453c.f37457c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f27004id;
    }
}
