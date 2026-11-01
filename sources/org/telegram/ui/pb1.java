package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class pb1 implements sy0 {
    public final TLRPC.TL_forumTopic f40445a;
    public final qb1 f40446b;

    public pb1(qb1 qb1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f40446b = qb1Var;
        this.f40445a = tL_forumTopic;
    }

    @Override
    public final void b0() {
        tb1 tb1Var = this.f40446b.f40741a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f40445a;
        tb1.Z(tb1Var, tL_forumTopic.f19846id);
        org.telegram.messenger.i0.h3(new y01(15, this, tL_forumTopic), 300L);
    }

    @Override
    public final void w(si0 si0Var) {
    }
}
