package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class e2 extends z70 {
    public final TLRPC.User f28934c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28935f;
    public final boolean h;
    public final boolean f28936n;
    public final boolean f28937r;
    public final Activity f28938s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f28939w;
    public final boolean f28940x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f28934c = user;
        this.d = chat2;
        this.e = str;
        this.f28935f = inputPeer;
        this.h = z10;
        this.f28936n = z11;
        this.f28937r = z12;
        this.f28938s = activity;
        this.v = n2Var;
        this.f28939w = accountInstance;
        this.f28940x = z13;
    }

    @Override
    public final void m() {
        f2.b(this.f28934c, this.d, this.e, this.f28935f, false, this.h, this.f28936n, this.f28937r, this.f28938s, this.v, this.f28939w, false, true, this.f28940x);
    }
}
