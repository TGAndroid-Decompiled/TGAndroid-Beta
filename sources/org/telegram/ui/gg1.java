package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gg1 implements t11 {
    public final TLRPC.TL_forumTopic f38120a;
    public final hg1 f38121b;

    public gg1(hg1 hg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38121b = hg1Var;
        this.f38120a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        kg1 kg1Var = this.f38121b.f38442a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38120a;
        kg1.U(kg1Var, tL_forumTopic.f20120id);
        AndroidUtilities.runOnUIThread(new m31(21, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(uk0 uk0Var) {
    }
}
