package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
public final class f2 extends d80 {
    public final TLRPC.User f32036c;
    public final TLRPC.Chat d;
    public final String f32037e;
    public final TLRPC.InputPeer f32038f;
    public final boolean h;
    public final boolean f32039n;
    public final boolean f32040r;
    public final Activity f32041s;
    public final org.telegram.ui.ActionBar.p2 v;
    public final AccountInstance f32042w;
    public final boolean f32043x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance, boolean z12) {
        super(context, chat);
        this.f32036c = user;
        this.d = chat2;
        this.f32037e = str;
        this.f32038f = inputPeer;
        this.h = z4;
        this.f32039n = z10;
        this.f32040r = z11;
        this.f32041s = activity;
        this.v = p2Var;
        this.f32042w = accountInstance;
        this.f32043x = z12;
    }

    @Override
    public final void m() {
        g2.b(this.f32036c, this.d, this.f32037e, this.f32038f, false, this.h, this.f32039n, this.f32040r, this.f32041s, this.v, this.f32042w, false, true, this.f32043x);
    }
}
