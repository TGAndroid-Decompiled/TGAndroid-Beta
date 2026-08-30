package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b80;
public final class d2 extends b80 {
    public final TLRPC.User f29595c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29596f;
    public final boolean h;
    public final boolean f29597n;
    public final Activity f29598r;
    public final org.telegram.ui.ActionBar.p2 f29599s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29595c = user;
        this.d = chat2;
        this.e = str;
        this.f29596f = inputPeer;
        this.h = z4;
        this.f29597n = z10;
        this.f29598r = activity;
        this.f29599s = p2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        f2.b(this.f29595c, this.d, this.e, this.f29596f, true, this.h, this.f29597n, false, this.f29598r, this.f29599s, this.v, false, false, false);
    }
}
