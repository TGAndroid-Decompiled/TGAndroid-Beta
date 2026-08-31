package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
public final class f2 extends d80 {
    public final TLRPC.User f32031c;
    public final TLRPC.Chat d;
    public final String f32032e;
    public final TLRPC.InputPeer f32033f;
    public final boolean h;
    public final boolean f32034n;
    public final boolean f32035r;
    public final Activity f32036s;
    public final org.telegram.ui.ActionBar.p2 v;
    public final AccountInstance f32037w;
    public final boolean f32038x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance, boolean z12) {
        super(context, chat);
        this.f32031c = user;
        this.d = chat2;
        this.f32032e = str;
        this.f32033f = inputPeer;
        this.h = z4;
        this.f32034n = z10;
        this.f32035r = z11;
        this.f32036s = activity;
        this.v = p2Var;
        this.f32037w = accountInstance;
        this.f32038x = z12;
    }

    @Override
    public final void m() {
        g2.b(this.f32031c, this.d, this.f32032e, this.f32033f, false, this.h, this.f32034n, this.f32035r, this.f32036s, this.v, this.f32037w, false, true, this.f32038x);
    }
}
