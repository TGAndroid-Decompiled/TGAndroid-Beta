package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a90;
public final class f2 extends a90 {
    public final TLRPC.User f32042c;
    public final TLRPC.Chat d;
    public final String f32043e;
    public final TLRPC.InputPeer f32044f;
    public final boolean h;
    public final boolean f32045n;
    public final boolean f32046r;
    public final Activity f32047s;
    public final org.telegram.ui.ActionBar.m2 v;
    public final AccountInstance f32048w;
    public final boolean f32049x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f32042c = user;
        this.d = chat2;
        this.f32043e = str;
        this.f32044f = inputPeer;
        this.h = z10;
        this.f32045n = z11;
        this.f32046r = z12;
        this.f32047s = activity;
        this.v = m2Var;
        this.f32048w = accountInstance;
        this.f32049x = z13;
    }

    @Override
    public final void o() {
        g2.b(this.f32042c, this.d, this.f32043e, this.f32044f, false, this.h, this.f32045n, this.f32046r, this.f32047s, this.v, this.f32048w, false, true, this.f32049x);
    }
}
