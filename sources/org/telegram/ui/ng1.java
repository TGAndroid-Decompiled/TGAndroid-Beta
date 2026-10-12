package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ng1 implements b21 {
    public final TLRPC.TL_forumTopic f38714a;
    public final og1 f38715b;

    public ng1(og1 og1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38715b = og1Var;
        this.f38714a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        rg1 rg1Var = this.f38715b.f38954a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38714a;
        rg1.U(rg1Var, tL_forumTopic.f19268id);
        AndroidUtilities.runOnUIThread(new je1(3, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(al0 al0Var) {
    }
}
