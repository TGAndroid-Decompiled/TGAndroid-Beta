package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;
public final class l1 extends m70 {
    public final TLRPC.User f31522j1;
    public final TLRPC.Chat f31523k1;
    public final String l1;
    public final TLRPC.InputPeer f31524m1;
    public final boolean f31525n1;
    public final boolean f31526o1;
    public final boolean f31527p1;
    public final Activity f31528q1;
    public final org.telegram.ui.ActionBar.k2 f31529r1;
    public final org.telegram.messenger.c f31530s1;
    public final boolean f31531t1;

    public l1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.f31522j1 = user;
        this.f31523k1 = chat2;
        this.l1 = str;
        this.f31524m1 = inputPeer;
        this.f31525n1 = z10;
        this.f31526o1 = z11;
        this.f31527p1 = z12;
        this.f31528q1 = activity;
        this.f31529r1 = k2Var;
        this.f31530s1 = cVar;
        this.f31531t1 = z13;
    }

    @Override
    public final void I0() {
        m1.b(this.f31522j1, this.f31523k1, this.l1, this.f31524m1, false, this.f31525n1, this.f31526o1, this.f31527p1, this.f31528q1, this.f31529r1, this.f31530s1, false, true, this.f31531t1);
    }
}
