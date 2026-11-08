package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class p01 {
    public TLRPC.TL_forumTopic f36756a;
    public org.telegram.messenger.uv f36757b;
    public final s01 f36758c;

    public p01(s01 s01Var) {
        this.f36758c = s01Var;
    }

    public final long a() {
        org.telegram.messenger.uv uvVar = this.f36757b;
        if (uvVar != null) {
            return uvVar.f25896a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f36756a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f36758c.f37833c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f27008id;
    }
}
