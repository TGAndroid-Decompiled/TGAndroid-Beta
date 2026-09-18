package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class d2 extends z70 {
    public final TLRPC.User f28895c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28896f;
    public final boolean h;
    public final boolean f28897n;
    public final Activity f28898r;
    public final org.telegram.ui.ActionBar.o2 f28899s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f28895c = user;
        this.d = chat2;
        this.e = str;
        this.f28896f = inputPeer;
        this.h = z10;
        this.f28897n = z11;
        this.f28898r = activity;
        this.f28899s = o2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        f2.b(this.f28895c, this.d, this.e, this.f28896f, true, this.h, this.f28897n, false, this.f28898r, this.f28899s, this.v, false, false, false);
    }
}
