package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class af1 implements c11 {
    public final TLRPC.TL_forumTopic f35670a;
    public final bf1 f35671b;

    public af1(bf1 bf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f35671b = bf1Var;
        this.f35670a = tL_forumTopic;
    }

    @Override
    public final void O() {
        ef1 ef1Var = this.f35671b.f36074a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f35670a;
        ef1.U(ef1Var, tL_forumTopic.f20395id);
        AndroidUtilities.runOnUIThread(new o71(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void r(ik0 ik0Var) {
    }
}
