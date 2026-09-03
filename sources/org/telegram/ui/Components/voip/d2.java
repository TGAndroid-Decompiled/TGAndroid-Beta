package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c80;
public final class d2 extends c80 {
    public final TLRPC.User f29567c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f29568f;
    public final boolean h;
    public final boolean f29569n;
    public final Activity f29570r;
    public final org.telegram.ui.ActionBar.p2 f29571s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f29567c = user;
        this.d = chat2;
        this.e = str;
        this.f29568f = inputPeer;
        this.h = z4;
        this.f29569n = z10;
        this.f29570r = activity;
        this.f29571s = p2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        f2.b(this.f29567c, this.d, this.e, this.f29568f, true, this.h, this.f29569n, false, this.f29570r, this.f29571s, this.v, false, false, false);
    }
}
