package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class e2 extends n80 {
    public final TLRPC.User f31847c;
    public final TLRPC.Chat d;
    public final String f31848e;
    public final TLRPC.InputPeer f31849f;
    public final boolean h;
    public final boolean f31850n;
    public final Activity f31851r;
    public final org.telegram.ui.ActionBar.n2 f31852s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31847c = user;
        this.d = chat2;
        this.f31848e = str;
        this.f31849f = inputPeer;
        this.h = z10;
        this.f31850n = z11;
        this.f31851r = activity;
        this.f31852s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f31847c, this.d, this.f31848e, this.f31849f, true, this.h, this.f31850n, false, this.f31851r, this.f31852s, this.v, false, false, false);
    }
}
