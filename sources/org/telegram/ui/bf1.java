package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class bf1 implements s01 {
    public final TLRPC.TL_forumTopic f36785a;
    public final cf1 f36786b;

    public bf1(cf1 cf1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f36786b = cf1Var;
        this.f36785a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        ff1 ff1Var = this.f36786b.f37098a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36785a;
        ff1.U(ff1Var, tL_forumTopic.f22444id);
        AndroidUtilities.runOnUIThread(new t31(17, this, tL_forumTopic), 300L);
    }

    @Override
    public final void m(bk0 bk0Var) {
    }
}
