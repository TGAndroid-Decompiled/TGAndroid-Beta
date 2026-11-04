package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class o91 implements xw0 {
    public final TLRPC.TL_forumTopic f48240a;
    public final p91 f48241b;

    public o91(p91 p91Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f48241b = p91Var;
        this.f48240a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        s91 s91Var = this.f48241b.f48498a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f48240a;
        s91.Z(s91Var, tL_forumTopic.f27053id);
        org.telegram.messenger.g0.i3(new qv0(26, this, tL_forumTopic), 300L);
    }

    @Override
    public final void l(lh0 lh0Var) {
    }
}
