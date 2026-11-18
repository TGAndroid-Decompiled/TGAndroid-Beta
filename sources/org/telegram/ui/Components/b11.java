package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class b11 {
    public TLRPC.TL_forumTopic f33505a;
    public org.telegram.messenger.ov f33506b;
    public final f11 f33507c;

    public b11(f11 f11Var) {
        this.f33507c = f11Var;
    }

    public final long a() {
        org.telegram.messenger.ov ovVar = this.f33506b;
        if (ovVar != null) {
            return ovVar.f26106a;
        }
        TLRPC.TL_forumTopic tL_forumTopic = this.f33505a;
        if (tL_forumTopic == null) {
            return 0L;
        }
        if (this.f33507c.f34877c) {
            return org.telegram.messenger.n5.o(tL_forumTopic.from_id);
        }
        return tL_forumTopic.f28457id;
    }
}
