package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i70;
public final class a2 extends i70 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f40768o1;
    public final String f40769p1;
    public final TLRPC.InputPeer f40770q1;
    public final boolean f40771r1;
    public final boolean f40772s1;
    public final Activity f40773t1;
    public final org.telegram.ui.ActionBar.g2 f40774u1;
    public final org.telegram.messenger.c f40775v1;

    public a2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.n1 = user;
        this.f40768o1 = chat2;
        this.f40769p1 = str;
        this.f40770q1 = inputPeer;
        this.f40771r1 = z10;
        this.f40772s1 = z11;
        this.f40773t1 = activity;
        this.f40774u1 = g2Var;
        this.f40775v1 = cVar;
    }

    @Override
    public final void J0() {
        c2.b(this.n1, this.f40768o1, this.f40769p1, this.f40770q1, true, this.f40771r1, this.f40772s1, false, this.f40773t1, this.f40774u1, this.f40775v1, false, false, false);
    }
}
