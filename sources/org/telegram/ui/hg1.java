package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hg1 implements u11 {
    public final TLRPC.TL_forumTopic f38372a;
    public final ig1 f38373b;

    public hg1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38373b = ig1Var;
        this.f38372a = tL_forumTopic;
    }

    @Override
    public final void a0() {
        lg1 lg1Var = this.f38373b.f38680a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38372a;
        lg1.U(lg1Var, tL_forumTopic.f20094id);
        AndroidUtilities.runOnUIThread(new n31(22, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(vk0 vk0Var) {
    }
}
