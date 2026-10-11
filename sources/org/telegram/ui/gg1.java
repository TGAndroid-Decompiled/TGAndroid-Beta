package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gg1 implements t11 {
    public final TLRPC.TL_forumTopic f38086a;
    public final hg1 f38087b;

    public gg1(hg1 hg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38087b = hg1Var;
        this.f38086a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        kg1 kg1Var = this.f38087b.f38408a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38086a;
        kg1.U(kg1Var, tL_forumTopic.f20084id);
        AndroidUtilities.runOnUIThread(new m31(21, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(uk0 uk0Var) {
    }
}
