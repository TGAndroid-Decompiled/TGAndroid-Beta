package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class mf1 implements d11 {
    public final TLRPC.TL_forumTopic f36288a;
    public final nf1 f36289b;

    public mf1(nf1 nf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f36289b = nf1Var;
        this.f36288a = tL_forumTopic;
    }

    @Override
    public final void b0() {
        qf1 qf1Var = this.f36289b.f36618a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36288a;
        qf1.U(qf1Var, tL_forumTopic.f19236id);
        AndroidUtilities.runOnUIThread(new l01(26, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(jk0 jk0Var) {
    }
}
