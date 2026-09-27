package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
public final class f2 extends m80 {
    public final TLRPC.User f29288c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29289f;
    public final boolean h;
    public final boolean f29290n;
    public final boolean f29291r;
    public final Activity f29292s;
    public final org.telegram.ui.ActionBar.o2 v;
    public final AccountInstance f29293w;
    public final boolean f29294x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f29288c = user;
        this.d = chat2;
        this.e = str;
        this.f29289f = inputPeer;
        this.h = z10;
        this.f29290n = z11;
        this.f29291r = z12;
        this.f29292s = activity;
        this.v = o2Var;
        this.f29293w = accountInstance;
        this.f29294x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f29288c, this.d, this.e, this.f29289f, false, this.h, this.f29290n, this.f29291r, this.f29292s, this.v, this.f29293w, false, true, this.f29294x);
    }
}
