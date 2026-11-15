package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class s01 {
    public TLRPC.TL_forumTopic f39131a;
    public org.telegram.messenger.sv f39132b;
    public final v01 f39133c;

    public s01(v01 v01Var) {
        this.f39133c = v01Var;
    }

    public final long a() {
        org.telegram.messenger.sv svVar = this.f39132b;
        if (svVar != null) {
            return svVar.f26578a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f39131a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f39133c.f40212c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f28103id;
    }
}
