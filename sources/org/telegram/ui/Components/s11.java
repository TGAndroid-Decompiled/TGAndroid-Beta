package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class s11 {
    public TLRPC.TL_forumTopic f30153a;
    public org.telegram.messenger.gw f30154b;
    public final u11 f30155c;

    public s11(u11 u11Var) {
        this.f30155c = u11Var;
    }

    public final long a() {
        org.telegram.messenger.gw gwVar = this.f30154b;
        if (gwVar != null) {
            return gwVar.f15965a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f30153a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f30155c.f30821c) {
            return org.telegram.messenger.o5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f19846id;
    }
}
