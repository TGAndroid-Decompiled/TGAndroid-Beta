package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
public final class z1 extends j70 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f41373o1;
    public final String f41374p1;
    public final TLRPC.InputPeer f41375q1;
    public final boolean f41376r1;
    public final boolean f41377s1;
    public final Activity f41378t1;
    public final org.telegram.ui.ActionBar.h2 f41379u1;
    public final org.telegram.messenger.c f41380v1;

    public z1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.n1 = user;
        this.f41373o1 = chat2;
        this.f41374p1 = str;
        this.f41375q1 = inputPeer;
        this.f41376r1 = z10;
        this.f41377s1 = z11;
        this.f41378t1 = activity;
        this.f41379u1 = h2Var;
        this.f41380v1 = cVar;
    }

    @Override
    public final void J0() {
        b2.b(this.n1, this.f41373o1, this.f41374p1, this.f41375q1, true, this.f41376r1, this.f41377s1, false, this.f41378t1, this.f41379u1, this.f41380v1, false, false, false);
    }
}
