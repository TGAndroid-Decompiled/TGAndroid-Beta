package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class jg1 implements w11 {
    public final TLRPC.TL_forumTopic f39209a;
    public final kg1 f39210b;

    public jg1(kg1 kg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f39210b = kg1Var;
        this.f39209a = tL_forumTopic;
    }

    @Override
    public final void b0() {
        ng1 ng1Var = this.f39210b.f39485a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39209a;
        ng1.U(ng1Var, tL_forumTopic.f19855id);
        AndroidUtilities.runOnUIThread(new u31(20, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(wk0 wk0Var) {
    }
}
