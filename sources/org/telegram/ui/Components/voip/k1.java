package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;
public final class k1 extends m70 {
    public final TLRPC.User f31502j1;
    public final TLRPC.Chat f31503k1;
    public final String l1;
    public final TLRPC.InputPeer f31504m1;
    public final boolean f31505n1;
    public final boolean f31506o1;
    public final Activity f31507p1;
    public final org.telegram.ui.ActionBar.k2 f31508q1;
    public final org.telegram.messenger.c f31509r1;

    public k1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.f31502j1 = user;
        this.f31503k1 = chat2;
        this.l1 = str;
        this.f31504m1 = inputPeer;
        this.f31505n1 = z10;
        this.f31506o1 = z11;
        this.f31507p1 = activity;
        this.f31508q1 = k2Var;
        this.f31509r1 = cVar;
    }

    @Override
    public final void I0() {
        m1.b(this.f31502j1, this.f31503k1, this.l1, this.f31504m1, true, this.f31505n1, this.f31506o1, false, this.f31507p1, this.f31508q1, this.f31509r1, false, false, false);
    }
}
