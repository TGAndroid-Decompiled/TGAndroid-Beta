package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class b2 extends z70 {
    public final TLRPC.User f31425c;
    public final TLRPC.Chat d;
    public final String f31426e;
    public final TLRPC.InputPeer f31427f;
    public final boolean h;
    public final boolean f31428n;
    public final Activity f31429r;
    public final org.telegram.ui.ActionBar.n2 f31430s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.n2 n2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31425c = user;
        this.d = chat2;
        this.f31426e = str;
        this.f31427f = inputPeer;
        this.h = z10;
        this.f31428n = z11;
        this.f31429r = activity;
        this.f31430s = n2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        d2.b(this.f31425c, this.d, this.f31426e, this.f31427f, true, this.h, this.f31428n, false, this.f31429r, this.f31430s, this.v, false, false, false);
    }
}
