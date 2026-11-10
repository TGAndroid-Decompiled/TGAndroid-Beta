package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v60;
public final class x1 extends v60 {
    public final TLRPC.User f39624m1;
    public final TLRPC.Chat n1;
    public final String f39625o1;
    public final TLRPC.InputPeer f39626p1;
    public final boolean f39627q1;
    public final boolean f39628r1;
    public final boolean f39629s1;
    public final Activity f39630t1;
    public final org.telegram.ui.ActionBar.f2 f39631u1;
    public final org.telegram.messenger.c f39632v1;
    public final boolean f39633w1;

    public x1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar, boolean z12) {
        super(context, chat);
        this.f39624m1 = user;
        this.n1 = chat2;
        this.f39625o1 = str;
        this.f39626p1 = inputPeer;
        this.f39627q1 = z9;
        this.f39628r1 = z10;
        this.f39629s1 = z11;
        this.f39630t1 = activity;
        this.f39631u1 = f2Var;
        this.f39632v1 = cVar;
        this.f39633w1 = z12;
    }

    @Override
    public final void I0() {
        y1.b(this.f39624m1, this.n1, this.f39625o1, this.f39626p1, false, this.f39627q1, this.f39628r1, this.f39629s1, this.f39630t1, this.f39631u1, this.f39632v1, false, true, this.f39633w1);
    }
}
