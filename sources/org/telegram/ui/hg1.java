package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hg1 implements v11 {
    public final TLRPC.TL_forumTopic f34202a;
    public final ig1 f34203b;

    public hg1(ig1 ig1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f34203b = ig1Var;
        this.f34202a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        lg1 lg1Var = this.f34203b.f34562a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f34202a;
        lg1.U(lg1Var, tL_forumTopic.f18380id);
        AndroidUtilities.runOnUIThread(new w81(14, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(wk0 wk0Var) {
    }
}
