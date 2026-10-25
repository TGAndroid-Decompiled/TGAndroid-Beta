package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class cf1 implements g11 {
    public final TLRPC.TL_forumTopic f38444a;
    public final df1 f38445b;

    public cf1(df1 df1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38445b = df1Var;
        this.f38444a = tL_forumTopic;
    }

    @Override
    public final void Y() {
        gf1 gf1Var = this.f38445b.f38855a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38444a;
        gf1.V(gf1Var, tL_forumTopic.f22079id);
        AndroidUtilities.runOnUIThread(new zc1(4, this, tL_forumTopic), 300L);
    }

    @Override
    public final void t(ok0 ok0Var) {
    }
}
