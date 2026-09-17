package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gg1 implements x11 {
    public final TLRPC.TL_forumTopic f36697a;
    public final hg1 f36698b;

    public gg1(hg1 hg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f36698b = hg1Var;
        this.f36697a = tL_forumTopic;
    }

    @Override
    public final void b0() {
        kg1 kg1Var = this.f36698b.f37025a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f36697a;
        kg1.U(kg1Var, tL_forumTopic.f19948id);
        AndroidUtilities.runOnUIThread(new w81(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(wk0 wk0Var) {
    }
}
