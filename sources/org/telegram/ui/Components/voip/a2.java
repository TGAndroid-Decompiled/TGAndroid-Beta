package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l70;
public final class a2 extends l70 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f40862o1;
    public final String f40863p1;
    public final TLRPC.InputPeer f40864q1;
    public final boolean f40865r1;
    public final boolean f40866s1;
    public final boolean f40867t1;
    public final Activity f40868u1;
    public final org.telegram.ui.ActionBar.g2 f40869v1;
    public final org.telegram.messenger.c f40870w1;
    public final boolean f40871x1;

    public a2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.n1 = user;
        this.f40862o1 = chat2;
        this.f40863p1 = str;
        this.f40864q1 = inputPeer;
        this.f40865r1 = z10;
        this.f40866s1 = z11;
        this.f40867t1 = z12;
        this.f40868u1 = activity;
        this.f40869v1 = g2Var;
        this.f40870w1 = cVar;
        this.f40871x1 = z13;
    }

    @Override
    public final void J0() {
        b2.b(this.n1, this.f40862o1, this.f40863p1, this.f40864q1, false, this.f40865r1, this.f40866s1, this.f40867t1, this.f40868u1, this.f40869v1, this.f40870w1, false, true, this.f40871x1);
    }
}
