package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hg1 implements v11 {
    public final TLRPC.TL_forumTopic f34218a;
    public final ig1 f34219b;

    public hg1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f34219b = ig1Var;
        this.f34218a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        lg1 lg1Var = this.f34219b.f34582a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f34218a;
        lg1.U(lg1Var, tL_forumTopic.f18395id);
        AndroidUtilities.runOnUIThread(new w81(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(wk0 wk0Var) {
    }
}
