package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c11 {
    public TLRPC.TL_forumTopic f33939a;
    public org.telegram.messenger.pv f33940b;
    public final g11 f33941c;

    public c11(g11 g11Var) {
        this.f33941c = g11Var;
    }

    public final long a() {
        org.telegram.messenger.pv pvVar = this.f33940b;
        if (pvVar != null) {
            return pvVar.f26314a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f33939a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f33941c.f35331c) {
            return org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f28450id;
    }
}
