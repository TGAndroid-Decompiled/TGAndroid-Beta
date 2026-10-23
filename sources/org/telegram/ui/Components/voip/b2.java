package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u80;
public final class b2 extends u80 {
    public final TLRPC.User f31542c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f31543f;
    public final boolean h;
    public final boolean f31544n;
    public final Activity f31545r;
    public final org.telegram.ui.ActionBar.o2 f31546s;
    public final AccountInstance v;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f31542c = user;
        this.d = chat2;
        this.e = str;
        this.f31543f = inputPeer;
        this.h = z10;
        this.f31544n = z11;
        this.f31545r = activity;
        this.f31546s = o2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        d2.b(this.f31542c, this.d, this.e, this.f31543f, true, this.h, this.f31544n, false, this.f31545r, this.f31546s, this.v, false, false, false);
    }
}
