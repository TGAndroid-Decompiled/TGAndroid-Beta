package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i70;
public final class b2 extends i70 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f40795o1;
    public final String f40796p1;
    public final TLRPC.InputPeer f40797q1;
    public final boolean f40798r1;
    public final boolean f40799s1;
    public final boolean f40800t1;
    public final Activity f40801u1;
    public final org.telegram.ui.ActionBar.g2 f40802v1;
    public final org.telegram.messenger.c f40803w1;
    public final boolean f40804x1;

    public b2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.n1 = user;
        this.f40795o1 = chat2;
        this.f40796p1 = str;
        this.f40797q1 = inputPeer;
        this.f40798r1 = z10;
        this.f40799s1 = z11;
        this.f40800t1 = z12;
        this.f40801u1 = activity;
        this.f40802v1 = g2Var;
        this.f40803w1 = cVar;
        this.f40804x1 = z13;
    }

    @Override
    public final void J0() {
        c2.b(this.n1, this.f40795o1, this.f40796p1, this.f40797q1, false, this.f40798r1, this.f40799s1, this.f40800t1, this.f40801u1, this.f40802v1, this.f40803w1, false, true, this.f40804x1);
    }
}
