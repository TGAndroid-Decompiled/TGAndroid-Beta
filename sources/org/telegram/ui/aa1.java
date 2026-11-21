package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class aa1 implements ix0 {
    public final TLRPC.TL_forumTopic f45554a;
    public final ba1 f45555b;

    public aa1(ba1 ba1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f45555b = ba1Var;
        this.f45554a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        ea1 ea1Var = this.f45555b.f45826a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f45554a;
        ea1.Z(ea1Var, tL_forumTopic.f28483id);
        org.telegram.messenger.g0.h3(new mz0(15, this, tL_forumTopic), 300L);
    }

    @Override
    public final void k(uh0 uh0Var) {
    }
}
