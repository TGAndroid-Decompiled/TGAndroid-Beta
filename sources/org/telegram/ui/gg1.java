package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gg1 implements w11 {
    public final TLRPC.TL_forumTopic f33851a;
    public final hg1 f33852b;

    public gg1(hg1 hg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f33852b = hg1Var;
        this.f33851a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        kg1 kg1Var = this.f33852b.f34259a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f33851a;
        kg1.U(kg1Var, tL_forumTopic.f18161id);
        AndroidUtilities.runOnUIThread(new pb1(8, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(tk0 tk0Var) {
    }
}
