package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class b2 extends z70 {
    public final TLRPC.User f31426c;
    public final TLRPC.Chat d;
    public final String f31427e;
    public final TLRPC.InputPeer f31428f;
    public final boolean h;
    public final boolean f31429n;
    public final Activity f31430r;
    public final org.telegram.ui.ActionBar.n2 f31431s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31426c = user;
        this.d = chat2;
        this.f31427e = str;
        this.f31428f = inputPeer;
        this.h = z10;
        this.f31429n = z11;
        this.f31430r = activity;
        this.f31431s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        d2.b(this.f31426c, this.d, this.f31427e, this.f31428f, true, this.h, this.f31429n, false, this.f31430r, this.f31431s, this.v, false, false, false);
    }
}
