package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class q01 {
    public TLRPC.TL_forumTopic f37148a;
    public org.telegram.messenger.uv f37149b;
    public final t01 f37150c;

    public q01(t01 t01Var) {
        this.f37150c = t01Var;
    }

    public final long a() {
        org.telegram.messenger.uv uvVar = this.f37149b;
        if (uvVar != null) {
            return uvVar.f25896a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f37148a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f37150c.f38211c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f27008id;
    }
}
