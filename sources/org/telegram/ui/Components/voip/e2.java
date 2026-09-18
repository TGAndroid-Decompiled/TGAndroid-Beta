package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z70;
public final class e2 extends z70 {
    public final TLRPC.User f28914c;
    public final TLRPC.Chat d;
    public final String e;
    public final TLRPC.InputPeer f28915f;
    public final boolean h;
    public final boolean f28916n;
    public final boolean f28917r;
    public final Activity f28918s;
    public final org.telegram.ui.ActionBar.o2 v;
    public final AccountInstance f28919w;
    public final boolean f28920x;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.o2 o2Var, AccountInstance accountInstance, boolean z13) {
        super(context, chat);
        this.f28914c = user;
        this.d = chat2;
        this.e = str;
        this.f28915f = inputPeer;
        this.h = z10;
        this.f28916n = z11;
        this.f28917r = z12;
        this.f28918s = activity;
        this.v = o2Var;
        this.f28919w = accountInstance;
        this.f28920x = z13;
    }

    @Override
    public final void m() {
        f2.b(this.f28914c, this.d, this.e, this.f28915f, false, this.h, this.f28916n, this.f28917r, this.f28918s, this.v, this.f28919w, false, true, this.f28920x);
    }
}
