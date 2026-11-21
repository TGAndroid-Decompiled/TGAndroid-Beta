package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l70;
public final class z1 extends l70 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f41508o1;
    public final String f41509p1;
    public final TLRPC.InputPeer f41510q1;
    public final boolean f41511r1;
    public final boolean f41512s1;
    public final Activity f41513t1;
    public final org.telegram.ui.ActionBar.g2 f41514u1;
    public final org.telegram.messenger.c f41515v1;

    public z1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.n1 = user;
        this.f41508o1 = chat2;
        this.f41509p1 = str;
        this.f41510q1 = inputPeer;
        this.f41511r1 = z10;
        this.f41512s1 = z11;
        this.f41513t1 = activity;
        this.f41514u1 = g2Var;
        this.f41515v1 = cVar;
    }

    @Override
    public final void J0() {
        b2.b(this.n1, this.f41508o1, this.f41509p1, this.f41510q1, true, this.f41511r1, this.f41512s1, false, this.f41513t1, this.f41514u1, this.f41515v1, false, false, false);
    }
}
