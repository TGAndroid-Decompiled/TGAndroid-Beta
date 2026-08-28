package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
public final class c2 extends j70 {
    public final TLRPC.User f33464c;
    public final TLRPC.Chat d;
    public final String f33465e;
    public final TLRPC.InputPeer f33466f;
    public final boolean h;
    public final boolean f33467n;
    public final Activity f33468r;
    public final org.telegram.ui.ActionBar.o2 f33469s;
    public final AccountInstance v;

    public c2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f33464c = user;
        this.d = chat2;
        this.f33465e = str;
        this.f33466f = inputPeer;
        this.h = z10;
        this.f33467n = z11;
        this.f33468r = activity;
        this.f33469s = o2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        e2.b(this.f33464c, this.d, this.f33465e, this.f33466f, true, this.h, this.f33467n, false, this.f33468r, this.f33469s, this.v, false, false, false);
    }
}
