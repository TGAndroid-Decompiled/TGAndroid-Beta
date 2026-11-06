package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v60;
public final class x1 extends v60 {
    public final TLRPC.User f39561j1;
    public final TLRPC.Chat f39562k1;
    public final String l1;
    public final TLRPC.InputPeer f39563m1;
    public final boolean n1;
    public final boolean f39564o1;
    public final boolean f39565p1;
    public final Activity f39566q1;
    public final org.telegram.ui.ActionBar.f2 f39567r1;
    public final org.telegram.messenger.c f39568s1;
    public final boolean f39569t1;

    public x1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar, boolean z12) {
        super(context, chat);
        this.f39561j1 = user;
        this.f39562k1 = chat2;
        this.l1 = str;
        this.f39563m1 = inputPeer;
        this.n1 = z9;
        this.f39564o1 = z10;
        this.f39565p1 = z11;
        this.f39566q1 = activity;
        this.f39567r1 = f2Var;
        this.f39568s1 = cVar;
        this.f39569t1 = z12;
    }

    @Override
    public final void I0() {
        y1.b(this.f39561j1, this.f39562k1, this.l1, this.f39563m1, false, this.n1, this.f39564o1, this.f39565p1, this.f39566q1, this.f39567r1, this.f39568s1, false, true, this.f39569t1);
    }
}
