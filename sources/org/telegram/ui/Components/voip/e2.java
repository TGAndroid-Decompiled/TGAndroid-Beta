package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
public final class e2 extends d80 {
    public final TLRPC.User f32019c;
    public final TLRPC.Chat d;
    public final String f32020e;
    public final TLRPC.InputPeer f32021f;
    public final boolean h;
    public final boolean f32022n;
    public final Activity f32023r;
    public final org.telegram.ui.ActionBar.p2 f32024s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f32019c = user;
        this.d = chat2;
        this.f32020e = str;
        this.f32021f = inputPeer;
        this.h = z4;
        this.f32022n = z10;
        this.f32023r = activity;
        this.f32024s = p2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f32019c, this.d, this.f32020e, this.f32021f, true, this.h, this.f32022n, false, this.f32023r, this.f32024s, this.v, false, false, false);
    }
}
