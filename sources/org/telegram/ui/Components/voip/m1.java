package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q60;
public final class m1 extends q60 {
    public final TLRPC.User k1;
    public final TLRPC.Chat f39470l1;
    public final String m1;
    public final TLRPC.InputPeer f39471n1;
    public final boolean f39472o1;
    public final boolean f39473p1;
    public final boolean f39474q1;
    public final Activity f39475r1;
    public final org.telegram.ui.ActionBar.d2 f39476s1;
    public final org.telegram.messenger.c f39477t1;
    public final boolean f39478u1;

    public m1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.k1 = user;
        this.f39470l1 = chat2;
        this.m1 = str;
        this.f39471n1 = inputPeer;
        this.f39472o1 = z10;
        this.f39473p1 = z11;
        this.f39474q1 = z12;
        this.f39475r1 = activity;
        this.f39476s1 = d2Var;
        this.f39477t1 = cVar;
        this.f39478u1 = z13;
    }

    @Override
    public final void I0() {
        n1.b(this.k1, this.f39470l1, this.m1, this.f39471n1, false, this.f39472o1, this.f39473p1, this.f39474q1, this.f39475r1, this.f39476s1, this.f39477t1, false, true, this.f39478u1);
    }
}
