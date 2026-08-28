package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
public final class d2 extends j70 {
    public final TLRPC.User f33472c;
    public final TLRPC.Chat d;
    public final String f33473e;
    public final TLRPC.InputPeer f33474f;
    public final boolean h;
    public final boolean f33475n;
    public final boolean f33476r;
    public final Activity f33477s;
    public final org.telegram.ui.ActionBar.o2 v;
    public final AccountInstance f33478w;
    public final boolean f33479x;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f33472c = user;
        this.d = chat2;
        this.f33473e = str;
        this.f33474f = inputPeer;
        this.h = z10;
        this.f33475n = z11;
        this.f33476r = z12;
        this.f33477s = activity;
        this.v = o2Var;
        this.f33478w = accountInstance;
        this.f33479x = z13;
    }

    @Override
    public final void m() {
        e2.b(this.f33472c, this.d, this.f33473e, this.f33474f, false, this.h, this.f33475n, this.f33476r, this.f33477s, this.v, this.f33478w, false, true, this.f33479x);
    }
}
