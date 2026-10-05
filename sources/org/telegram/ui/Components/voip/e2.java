package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
public final class e2 extends n80 {
    public final TLRPC.User f31914c;
    public final TLRPC.Chat d;
    public final String f31915e;
    public final TLRPC.InputPeer f31916f;
    public final boolean h;
    public final boolean f31917n;
    public final Activity f31918r;
    public final org.telegram.ui.ActionBar.n2 f31919s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31914c = user;
        this.d = chat2;
        this.f31915e = str;
        this.f31916f = inputPeer;
        this.h = z10;
        this.f31917n = z11;
        this.f31918r = activity;
        this.f31919s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f31914c, this.d, this.f31915e, this.f31916f, true, this.h, this.f31917n, false, this.f31918r, this.f31919s, this.v, false, false, false);
    }
}
