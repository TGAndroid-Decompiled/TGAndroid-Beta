package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class aa1 implements ix0 {
    public final TLRPC.TL_forumTopic f45525a;
    public final ba1 f45526b;

    public aa1(ba1 ba1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f45526b = ba1Var;
        this.f45525a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        ea1 ea1Var = this.f45526b.f45778a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45525a;
        ea1.Z(ea1Var, tL_forumTopic.f28450id);
        org.telegram.messenger.g0.h3(new b31(13, this, tL_forumTopic), 300L);
    }

    @Override
    public final void k(uh0 uh0Var) {
    }
}
