package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.s80;
public final class b2 extends s80 {
    public final TLRPC.User f31512c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31513f;
    public final boolean h;
    public final boolean f31514n;
    public final Activity f31515r;
    public final org.telegram.ui.ActionBar.o2 f31516s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31512c = user;
        this.d = chat2;
        this.e = str;
        this.f31513f = inputPeer;
        this.h = z10;
        this.f31514n = z11;
        this.f31515r = activity;
        this.f31516s = o2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        d2.b(this.f31512c, this.d, this.e, this.f31513f, true, this.h, this.f31514n, false, this.f31515r, this.f31516s, this.v, false, false, false);
    }
}
