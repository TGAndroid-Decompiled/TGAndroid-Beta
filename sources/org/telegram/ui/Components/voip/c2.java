package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class c2 extends z70 {
    public final TLRPC.User f31467c;
    public final TLRPC.Chat d;
    public final String f31468e;
    public final TLRPC.InputPeer f31469f;
    public final boolean h;
    public final boolean f31470n;
    public final boolean f31471r;
    public final Activity f31472s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31473w;
    public final boolean f31474x;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31467c = user;
        this.d = chat2;
        this.f31468e = str;
        this.f31469f = inputPeer;
        this.h = z10;
        this.f31470n = z11;
        this.f31471r = z12;
        this.f31472s = activity;
        this.v = n2Var;
        this.f31473w = accountInstance;
        this.f31474x = z13;
    }

    @Override
    public final void m() {
        d2.b(this.f31467c, this.d, this.f31468e, this.f31469f, false, this.h, this.f31470n, this.f31471r, this.f31472s, this.v, this.f31473w, false, true, this.f31474x);
    }
}
