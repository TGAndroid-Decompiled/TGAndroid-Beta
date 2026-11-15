package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class s01 {
    public TLRPC.TL_forumTopic f39134a;
    public org.telegram.messenger.sv f39135b;
    public final v01 f39136c;

    public s01(v01 v01Var) {
        this.f39136c = v01Var;
    }

    public final long a() {
        org.telegram.messenger.sv svVar = this.f39135b;
        if (svVar != null) {
            return svVar.f26569a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f39134a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f39136c.f40212c) {
            return org.telegram.messenger.m5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f28103id;
    }
}
