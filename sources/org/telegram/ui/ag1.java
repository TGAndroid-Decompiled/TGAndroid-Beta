package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ag1 implements o11 {
    public final TLRPC.TL_forumTopic f34816a;
    public final bg1 f34817b;

    public ag1(bg1 bg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f34817b = bg1Var;
        this.f34816a = tL_forumTopic;
    }

    @Override
    public final void d0() {
        eg1 eg1Var = this.f34817b.f35090a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f34816a;
        eg1.S(eg1Var, tL_forumTopic.f20094id);
        AndroidUtilities.runOnUIThread(new g91(11, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(rk0 rk0Var) {
    }
}
