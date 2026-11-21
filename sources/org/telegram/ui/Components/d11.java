package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class d11 {
    public TLRPC.TL_forumTopic f34350a;
    public org.telegram.messenger.ov f34351b;
    public final h11 f34352c;

    public d11(h11 h11Var) {
        this.f34352c = h11Var;
    }

    public final long a() {
        org.telegram.messenger.ov ovVar = this.f34351b;
        if (ovVar != null) {
            return ovVar.f26132a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f34350a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f34352c.f35730c) {
            return org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f28483id;
    }
}
