package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class fg1 implements v11 {
    public final TLRPC.TL_forumTopic f33534a;
    public final gg1 f33535b;

    public fg1(gg1 gg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f33535b = gg1Var;
        this.f33534a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        jg1 jg1Var = this.f33535b.f33843a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f33534a;
        jg1.U(jg1Var, tL_forumTopic.f18348id);
        AndroidUtilities.runOnUIThread(new x81(12, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(vk0 vk0Var) {
    }
}
