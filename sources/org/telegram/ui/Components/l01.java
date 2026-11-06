package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class l01 {
    public TLRPC.TL_forumTopic f35466a;
    public org.telegram.messenger.uv f35467b;
    public final n01 f35468c;

    public l01(n01 n01Var) {
        this.f35468c = n01Var;
    }

    public final long a() {
        org.telegram.messenger.uv uvVar = this.f35467b;
        if (uvVar != null) {
            return uvVar.f25886a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f35466a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f35468c.f36190c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f27004id;
    }
}
