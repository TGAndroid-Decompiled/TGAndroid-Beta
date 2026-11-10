package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ba1 implements kx0 {
    public final TLRPC.TL_forumTopic f43995a;
    public final ca1 f43996b;

    public ba1(ca1 ca1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f43996b = ca1Var;
        this.f43995a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        fa1 fa1Var = this.f43996b.f44287a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43995a;
        fa1.Z(fa1Var, tL_forumTopic.f27012id);
        org.telegram.messenger.g0.i3(new rw0(23, this, tL_forumTopic), 300L);
    }

    @Override
    public final void t(rh0 rh0Var) {
    }
}
