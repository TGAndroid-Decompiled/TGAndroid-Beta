package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class aa1 implements jx0 {
    public final TLRPC.TL_forumTopic f43656a;
    public final ba1 f43657b;

    public aa1(ba1 ba1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f43657b = ba1Var;
        this.f43656a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        ea1 ea1Var = this.f43657b.f43946a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f43656a;
        ea1.Z(ea1Var, tL_forumTopic.f27008id);
        org.telegram.messenger.g0.i3(new ax0(22, this, tL_forumTopic), 300L);
    }

    @Override
    public final void t(qh0 qh0Var) {
    }
}
