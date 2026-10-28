package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ef1 implements i11 {
    public final TLRPC.TL_forumTopic f38858a;
    public final ff1 f38859b;

    public ef1(ff1 ff1Var, TLRPC.TL_forumTopic tL_forumTopic) {
        this.f38859b = ff1Var;
        this.f38858a = tL_forumTopic;
    }

    @Override
    public final void Y() {
        if1 if1Var = this.f38859b.f39352a;
        TLRPC.TL_forumTopic tL_forumTopic = this.f38858a;
        if1.V(if1Var, tL_forumTopic.f22080id);
        AndroidUtilities.runOnUIThread(new yc1(5, this, tL_forumTopic), 300L);
    }

    @Override
    public final void t(qk0 qk0Var) {
    }
}
