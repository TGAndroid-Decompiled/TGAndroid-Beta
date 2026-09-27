package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m80;
public final class e2 extends m80 {
    public final TLRPC.User f29279c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29280f;
    public final boolean h;
    public final boolean f29281n;
    public final Activity f29282r;
    public final org.telegram.ui.ActionBar.o2 f29283s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29279c = user;
        this.d = chat2;
        this.e = str;
        this.f29280f = inputPeer;
        this.h = z10;
        this.f29281n = z11;
        this.f29282r = activity;
        this.f29283s = o2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f29279c, this.d, this.e, this.f29280f, true, this.h, this.f29281n, false, this.f29282r, this.f29283s, this.v, false, false, false);
    }
}
