package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class mg1 implements b21 {
    public final TLRPC.TL_forumTopic f38004a;
    public final ng1 f38005b;

    public mg1(ng1 ng1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38005b = ng1Var;
        this.f38004a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        qg1 qg1Var = this.f38005b.f38393a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38004a;
        qg1.U(qg1Var, tL_forumTopic.f18968id);
        AndroidUtilities.runOnUIThread(new i11(28, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(zk0 zk0Var) {
    }
}
