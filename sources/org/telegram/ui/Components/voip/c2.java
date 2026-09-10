package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
public final class c2 extends i80 {
    public final TLRPC.User f28076c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28077f;
    public final boolean h;
    public final boolean f28078n;
    public final Activity f28079r;
    public final org.telegram.ui.ActionBar.p2 f28080s;
    public final AccountInstance v;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f28076c = user;
        this.d = chat2;
        this.e = str;
        this.f28077f = inputPeer;
        this.h = z10;
        this.f28078n = z11;
        this.f28079r = activity;
        this.f28080s = p2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        e2.b(this.f28076c, this.d, this.e, this.f28077f, true, this.h, this.f28078n, false, this.f28079r, this.f28080s, this.v, false, false, false);
    }
}
