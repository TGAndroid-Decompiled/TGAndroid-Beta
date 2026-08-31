package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class of1 implements f11 {
    public final TLRPC.TL_forumTopic f39745a;
    public final pf1 f39746b;

    public of1(pf1 pf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f39746b = pf1Var;
        this.f39745a = tL_forumTopic;
    }

    @Override
    public final void d0() {
        sf1 sf1Var = this.f39746b.f40030a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39745a;
        sf1.U(sf1Var, tL_forumTopic.f20895id);
        AndroidUtilities.runOnUIThread(new w01(25, this, tL_forumTopic), 300L);
    }

    @Override
    public final void u(lk0 lk0Var) {
    }
}
