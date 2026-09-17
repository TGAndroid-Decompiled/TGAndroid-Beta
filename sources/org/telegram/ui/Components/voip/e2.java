package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class e2 extends z70 {
    public final TLRPC.User f28911c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28912f;
    public final boolean h;
    public final boolean f28913n;
    public final boolean f28914r;
    public final Activity f28915s;
    public final org.telegram.ui.ActionBar.o2 v;
    public final AccountInstance f28916w;
    public final boolean f28917x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f28911c = user;
        this.d = chat2;
        this.e = str;
        this.f28912f = inputPeer;
        this.h = z10;
        this.f28913n = z11;
        this.f28914r = z12;
        this.f28915s = activity;
        this.v = o2Var;
        this.f28916w = accountInstance;
        this.f28917x = z13;
    }

    @Override
    public final void m() {
        f2.b(this.f28911c, this.d, this.e, this.f28912f, false, this.h, this.f28913n, this.f28914r, this.f28915s, this.v, this.f28916w, false, true, this.f28917x);
    }
}
