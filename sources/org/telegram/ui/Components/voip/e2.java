package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.AccountInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
public final class e2 extends d80 {
    public final TLRPC.User f32024c;
    public final TLRPC.Chat d;
    public final String f32025e;
    public final TLRPC.InputPeer f32026f;
    public final boolean h;
    public final boolean f32027n;
    public final Activity f32028r;
    public final org.telegram.ui.ActionBar.p2 f32029s;
    public final AccountInstance v;

    public e2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z4, boolean z10, Activity activity, org.telegram.ui.ActionBar.p2 p2Var, AccountInstance accountInstance) {
        super(context, chat);
        this.f32024c = user;
        this.d = chat2;
        this.f32025e = str;
        this.f32026f = inputPeer;
        this.h = z4;
        this.f32027n = z10;
        this.f32028r = activity;
        this.f32029s = p2Var;
        this.v = accountInstance;
    }

    @Override
    public final void m() {
        g2.b(this.f32024c, this.d, this.f32025e, this.f32026f, true, this.h, this.f32027n, false, this.f32028r, this.f32029s, this.v, false, false, false);
    }
}
