package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w70;
public final class f2 extends w70 {
    public final TLRPC.User f33694c;
    public final TLRPC.Chat d;
    public final String f33695e;
    public final TLRPC.InputPeer f33696f;
    public final boolean h;
    public final boolean f33697n;
    public final Activity f33698r;
    public final org.telegram.ui.ActionBar.o2 f33699s;
    public final AccountInstance v;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f33694c = user;
        this.d = chat2;
        this.f33695e = str;
        this.f33696f = inputPeer;
        this.h = z10;
        this.f33697n = z11;
        this.f33698r = activity;
        this.f33699s = o2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        h2.b(this.f33694c, this.d, this.f33695e, this.f33696f, true, this.h, this.f33697n, false, this.f33698r, this.f33699s, this.v, false, false, false);
    }
}
