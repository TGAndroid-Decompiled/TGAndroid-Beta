package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e90;
public final class e2 extends e90 {
    public final TLRPC.User f31670c;
    public final TLRPC.Chat d;
    public final String f31671e;
    public final TLRPC.InputPeer f31672f;
    public final boolean h;
    public final boolean f31673n;
    public final Activity f31674r;
    public final org.telegram.ui.ActionBar.m2 f31675s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.m2 m2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31670c = user;
        this.d = chat2;
        this.f31671e = str;
        this.f31672f = inputPeer;
        this.h = z10;
        this.f31673n = z11;
        this.f31674r = activity;
        this.f31675s = m2Var;
        this.v = accountInstance;
    }

    @Override
    public final void o() {
        g2.b(this.f31670c, this.d, this.f31671e, this.f31672f, true, this.h, this.f31673n, false, this.f31674r, this.f31675s, this.v, false, false, false);
    }
}
