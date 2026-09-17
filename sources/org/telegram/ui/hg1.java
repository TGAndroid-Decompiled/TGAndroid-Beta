package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hg1 implements x11 {
    public final TLRPC.TL_forumTopic f34269a;
    public final ig1 f34270b;

    public hg1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f34270b = ig1Var;
        this.f34269a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        lg1 lg1Var = this.f34270b.f34564a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f34269a;
        lg1.U(lg1Var, tL_forumTopic.f18173id);
        AndroidUtilities.runOnUIThread(new qb1(8, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(vk0 vk0Var) {
    }
}
