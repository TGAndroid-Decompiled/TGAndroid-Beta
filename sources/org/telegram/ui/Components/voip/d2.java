package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class d2 extends z70 {
    public final TLRPC.User f28912c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28913f;
    public final boolean h;
    public final boolean f28914n;
    public final Activity f28915r;
    public final org.telegram.ui.ActionBar.n2 f28916s;
    public final AccountInstance v;

    public d2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f28912c = user;
        this.d = chat2;
        this.e = str;
        this.f28913f = inputPeer;
        this.h = z10;
        this.f28914n = z11;
        this.f28915r = activity;
        this.f28916s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        f2.b(this.f28912c, this.d, this.e, this.f28913f, true, this.h, this.f28914n, false, this.f28915r, this.f28916s, this.v, false, false, false);
    }
}
