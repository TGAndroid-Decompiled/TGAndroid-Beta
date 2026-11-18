package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
public final class a2 extends j70 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f40764o1;
    public final String f40765p1;
    public final TLRPC.InputPeer f40766q1;
    public final boolean f40767r1;
    public final boolean f40768s1;
    public final boolean f40769t1;
    public final Activity f40770u1;
    public final org.telegram.ui.ActionBar.h2 f40771v1;
    public final org.telegram.messenger.c f40772w1;
    public final boolean f40773x1;

    public a2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.n1 = user;
        this.f40764o1 = chat2;
        this.f40765p1 = str;
        this.f40766q1 = inputPeer;
        this.f40767r1 = z10;
        this.f40768s1 = z11;
        this.f40769t1 = z12;
        this.f40770u1 = activity;
        this.f40771v1 = h2Var;
        this.f40772w1 = cVar;
        this.f40773x1 = z13;
    }

    @Override
    public final void J0() {
        b2.b(this.n1, this.f40764o1, this.f40765p1, this.f40766q1, false, this.f40767r1, this.f40768s1, this.f40769t1, this.f40770u1, this.f40771v1, this.f40772w1, false, true, this.f40773x1);
    }
}
