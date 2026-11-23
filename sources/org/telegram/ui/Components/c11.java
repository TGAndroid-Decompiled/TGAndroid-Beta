package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class c11 {
    public TLRPC.TL_forumTopic f33975a;
    public org.telegram.messenger.pv f33976b;
    public final g11 f33977c;

    public c11(g11 g11Var) {
        this.f33977c = g11Var;
    }

    public final long a() {
        org.telegram.messenger.pv pvVar = this.f33976b;
        if (pvVar != null) {
            return pvVar.f26350a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f33975a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f33977c.f35369c) {
            return org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f28486id;
    }
}
