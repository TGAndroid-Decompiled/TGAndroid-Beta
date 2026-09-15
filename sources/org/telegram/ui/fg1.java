package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class fg1 implements v11 {
    public final TLRPC.TL_forumTopic f33573a;
    public final gg1 f33574b;

    public fg1(gg1 gg1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f33574b = gg1Var;
        this.f33573a = tL_forumTopic;
    }

    @Override
    public final void c0() {
        jg1 jg1Var = this.f33574b.f33901a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f33573a;
        jg1.U(jg1Var, tL_forumTopic.f18164id);
        AndroidUtilities.runOnUIThread(new nb1(8, this, tL_forumTopic), 300L);
    }

    @Override
    public final void v(tk0 tk0Var) {
    }
}
