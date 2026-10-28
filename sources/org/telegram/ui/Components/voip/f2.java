package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w80;
public final class f2 extends w80 {
    public final TLRPC.User f33901c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f33902f;
    public final boolean h;
    public final boolean f33903n;
    public final boolean f33904r;
    public final Activity f33905s;
    public final org.telegram.ui.ActionBar.r2 v;
    public final AccountInstance f33906w;
    public final boolean f33907x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.r2 r2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f33901c = user;
        this.d = chat2;
        this.e = str;
        this.f33902f = inputPeer;
        this.h = z10;
        this.f33903n = z11;
        this.f33904r = z12;
        this.f33905s = activity;
        this.v = r2Var;
        this.f33906w = accountInstance;
        this.f33907x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f33901c, this.d, this.e, this.f33902f, false, this.h, this.f33903n, this.f33904r, this.f33905s, this.v, this.f33906w, false, true, this.f33907x);
    }
}
