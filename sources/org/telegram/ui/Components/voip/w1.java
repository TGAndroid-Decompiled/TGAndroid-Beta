package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v60;
public final class w1 extends v60 {
    public final TLRPC.User f39599m1;
    public final TLRPC.Chat n1;
    public final String f39600o1;
    public final TLRPC.InputPeer f39601p1;
    public final boolean f39602q1;
    public final boolean f39603r1;
    public final Activity f39604s1;
    public final org.telegram.ui.ActionBar.f2 f39605t1;
    public final org.telegram.messenger.c f39606u1;

    public w1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z9, boolean z10, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.f39599m1 = user;
        this.n1 = chat2;
        this.f39600o1 = str;
        this.f39601p1 = inputPeer;
        this.f39602q1 = z9;
        this.f39603r1 = z10;
        this.f39604s1 = activity;
        this.f39605t1 = f2Var;
        this.f39606u1 = cVar;
    }

    @Override
    public final void I0() {
        y1.b(this.f39599m1, this.n1, this.f39600o1, this.f39601p1, true, this.f39602q1, this.f39603r1, false, this.f39604s1, this.f39605t1, this.f39606u1, false, false, false);
    }
}
