package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b90;
public final class e2 extends b90 {
    public final TLRPC.User f31969c;
    public final TLRPC.Chat d;
    public final String f31970e;
    public final TLRPC.InputPeer f31971f;
    public final boolean h;
    public final boolean f31972n;
    public final Activity f31973r;
    public final org.telegram.ui.ActionBar.m2 f31974s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31969c = user;
        this.d = chat2;
        this.f31970e = str;
        this.f31971f = inputPeer;
        this.h = z10;
        this.f31972n = z11;
        this.f31973r = activity;
        this.f31974s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void o() {
        g2.b(this.f31969c, this.d, this.f31970e, this.f31971f, true, this.h, this.f31972n, false, this.f31973r, this.f31974s, this.v, false, false, false);
    }
}
