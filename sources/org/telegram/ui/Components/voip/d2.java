package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b90;
public final class d2 extends b90 {
    public final TLRPC.User f31965c;
    public final TLRPC.Chat d;
    public final String f31966e;
    public final TLRPC.InputPeer f31967f;
    public final boolean h;
    public final boolean f31968n;
    public final Activity f31969r;
    public final org.telegram.ui.ActionBar.n2 f31970s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31965c = user;
        this.d = chat2;
        this.f31966e = str;
        this.f31967f = inputPeer;
        this.h = z10;
        this.f31968n = z11;
        this.f31969r = activity;
        this.f31970s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void o() {
        f2.b(this.f31965c, this.d, this.f31966e, this.f31967f, true, this.h, this.f31968n, false, this.f31969r, this.f31970s, this.v, false, false, false);
    }
}
