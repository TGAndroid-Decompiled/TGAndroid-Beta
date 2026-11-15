package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x60;
public final class b2 extends x60 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f40519o1;
    public final String f40520p1;
    public final TLRPC.InputPeer f40521q1;
    public final boolean f40522r1;
    public final boolean f40523s1;
    public final boolean f40524t1;
    public final Activity f40525u1;
    public final org.telegram.ui.ActionBar.e2 f40526v1;
    public final org.telegram.messenger.c f40527w1;
    public final boolean f40528x1;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.n1 = user;
        this.f40519o1 = chat2;
        this.f40520p1 = str;
        this.f40521q1 = inputPeer;
        this.f40522r1 = z10;
        this.f40523s1 = z11;
        this.f40524t1 = z12;
        this.f40525u1 = activity;
        this.f40526v1 = e2Var;
        this.f40527w1 = cVar;
        this.f40528x1 = z13;
    }

    @Override
    public final void I0() {
        c2.b(this.n1, this.f40519o1, this.f40520p1, this.f40521q1, false, this.f40522r1, this.f40523s1, this.f40524t1, this.f40525u1, this.f40526v1, this.f40527w1, false, true, this.f40528x1);
    }
}
