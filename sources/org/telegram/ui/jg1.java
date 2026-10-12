package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class jg1 implements w11 {
    public final TLRPC.TL_forumTopic f39206a;
    public final kg1 f39207b;

    public jg1(kg1 kg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f39207b = kg1Var;
        this.f39206a = tL_forumTopic;
    }

    @Override
    public final void b0() {
        ng1 ng1Var = this.f39207b.f39491a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f39206a;
        ng1.U(ng1Var, tL_forumTopic.f19854id);
        AndroidUtilities.runOnUIThread(new w31(19, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(wk0 wk0Var) {
    }
}
