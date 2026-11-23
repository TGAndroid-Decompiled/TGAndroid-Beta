package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class b11 {
    public TLRPC.TL_forumTopic f33601a;
    public org.telegram.messenger.ov f33602b;
    public final f11 f33603c;

    public b11(f11 f11Var) {
        this.f33603c = f11Var;
    }

    public final long a() {
        org.telegram.messenger.ov ovVar = this.f33602b;
        if (ovVar != null) {
            return ovVar.f26201a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f33601a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f33603c.f34950c) {
            return org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f28544id;
    }
}
