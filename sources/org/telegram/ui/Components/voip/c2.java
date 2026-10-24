package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s80;
public final class c2 extends s80 {
    public final TLRPC.User f31524c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31525f;
    public final boolean h;
    public final boolean f31526n;
    public final boolean f31527r;
    public final Activity f31528s;
    public final org.telegram.ui.ActionBar.o2 v;
    public final AccountInstance f31529w;
    public final boolean f31530x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31524c = user;
        this.d = chat2;
        this.e = str;
        this.f31525f = inputPeer;
        this.h = z10;
        this.f31526n = z11;
        this.f31527r = z12;
        this.f31528s = activity;
        this.v = o2Var;
        this.f31529w = accountInstance;
        this.f31530x = z13;
    }

    @Override
    public final void m() {
        d2.b(this.f31524c, this.d, this.e, this.f31525f, false, this.h, this.f31526n, this.f31527r, this.f31528s, this.v, this.f31529w, false, true, this.f31530x);
    }
}
