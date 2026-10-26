package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class cf1 implements g11 {
    public final TLRPC.TL_forumTopic f38447a;
    public final df1 f38448b;

    public cf1(df1 df1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38448b = df1Var;
        this.f38447a = tL_forumTopic;
    }

    @Override
    public final void Y() {
        gf1 gf1Var = this.f38448b.f38858a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38447a;
        gf1.V(gf1Var, tL_forumTopic.f22079id);
        AndroidUtilities.runOnUIThread(new zc1(4, this, tL_forumTopic), 300L);
    }

    @Override
    public final void t(ok0 ok0Var) {
    }
}
