package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.t80;
public final class b2 extends t80 {
    public final TLRPC.User f31357c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31358f;
    public final boolean h;
    public final boolean f31359n;
    public final Activity f31360r;
    public final org.telegram.ui.ActionBar.n2 f31361s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31357c = user;
        this.d = chat2;
        this.e = str;
        this.f31358f = inputPeer;
        this.h = z10;
        this.f31359n = z11;
        this.f31360r = activity;
        this.f31361s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void n() {
        d2.b(this.f31357c, this.d, this.e, this.f31358f, true, this.h, this.f31359n, false, this.f31360r, this.f31361s, this.v, false, false, false);
    }
}
