package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a90;
public final class d2 extends a90 {
    public final TLRPC.User f31900c;
    public final TLRPC.Chat d;
    public final String f31901e;
    public final TLRPC.InputPeer f31902f;
    public final boolean h;
    public final boolean f31903n;
    public final Activity f31904r;
    public final org.telegram.ui.ActionBar.n2 f31905s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31900c = user;
        this.d = chat2;
        this.f31901e = str;
        this.f31902f = inputPeer;
        this.h = z10;
        this.f31903n = z11;
        this.f31904r = activity;
        this.f31905s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void o() {
        f2.b(this.f31900c, this.d, this.f31901e, this.f31902f, true, this.h, this.f31903n, false, this.f31904r, this.f31905s, this.v, false, false, false);
    }
}
