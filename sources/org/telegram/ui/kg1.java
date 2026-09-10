package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class kg1 implements b21 {
    public final TLRPC.TL_forumTopic f34367a;
    public final lg1 f34368b;

    public kg1(lg1 lg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f34368b = lg1Var;
        this.f34367a = tL_forumTopic;
    }

    @Override
    public final void Z() {
        og1 og1Var = this.f34368b.f34714a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f34367a;
        og1.U(og1Var, tL_forumTopic.f17247id);
        AndroidUtilities.runOnUIThread(new r91(11, this, tL_forumTopic), 300L);
    }

    @Override
    public final void u(vk0 vk0Var) {
    }
}
