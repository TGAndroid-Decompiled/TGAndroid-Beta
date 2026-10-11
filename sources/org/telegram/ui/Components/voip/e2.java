package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a90;
public final class e2 extends a90 {
    public final TLRPC.User f32033c;
    public final TLRPC.Chat d;
    public final String f32034e;
    public final TLRPC.InputPeer f32035f;
    public final boolean h;
    public final boolean f32036n;
    public final Activity f32037r;
    public final org.telegram.ui.ActionBar.m2 f32038s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f32033c = user;
        this.d = chat2;
        this.f32034e = str;
        this.f32035f = inputPeer;
        this.h = z10;
        this.f32036n = z11;
        this.f32037r = activity;
        this.f32038s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void o() {
        g2.b(this.f32033c, this.d, this.f32034e, this.f32035f, true, this.h, this.f32036n, false, this.f32037r, this.f32038s, this.v, false, false, false);
    }
}
