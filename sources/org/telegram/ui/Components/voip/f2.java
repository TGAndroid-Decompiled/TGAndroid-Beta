package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class f2 extends n80 {
    public final TLRPC.User f31851c;
    public final TLRPC.Chat d;
    public final String f31852e;
    public final TLRPC.InputPeer f31853f;
    public final boolean h;
    public final boolean f31854n;
    public final boolean f31855r;
    public final Activity f31856s;
    public final org.telegram.ui.ActionBar.n2 v;
    public final AccountInstance f31857w;
    public final boolean f31858x;

    public f2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f31851c = user;
        this.d = chat2;
        this.f31852e = str;
        this.f31853f = inputPeer;
        this.h = z10;
        this.f31854n = z11;
        this.f31855r = z12;
        this.f31856s = activity;
        this.v = n2Var;
        this.f31857w = accountInstance;
        this.f31858x = z13;
    }

    @Override
    public final void m() {
        g2.b(this.f31851c, this.d, this.f31852e, this.f31853f, false, this.h, this.f31854n, this.f31855r, this.f31856s, this.v, this.f31857w, false, true, this.f31858x);
    }
}
