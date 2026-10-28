package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w80;
public final class e2 extends w80 {
    public final TLRPC.User f33892c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f33893f;
    public final boolean h;
    public final boolean f33894n;
    public final Activity f33895r;
    public final org.telegram.ui.ActionBar.r2 f33896s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.r2 r2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f33892c = user;
        this.d = chat2;
        this.e = str;
        this.f33893f = inputPeer;
        this.h = z10;
        this.f33894n = z11;
        this.f33895r = activity;
        this.f33896s = r2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f33892c, this.d, this.e, this.f33893f, true, this.h, this.f33894n, false, this.f33895r, this.f33896s, this.v, false, false, false);
    }
}
