package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v60;
public final class x1 extends v60 {
    public final TLRPC.User f39614j1;
    public final TLRPC.Chat f39615k1;
    public final String l1;
    public final TLRPC.InputPeer f39616m1;
    public final boolean n1;
    public final boolean f39617o1;
    public final boolean f39618p1;
    public final Activity f39619q1;
    public final org.telegram.ui.ActionBar.f2 f39620r1;
    public final org.telegram.messenger.c f39621s1;
    public final boolean f39622t1;

    public x1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar, boolean z12) {
        super(context, chat);
        this.f39614j1 = user;
        this.f39615k1 = chat2;
        this.l1 = str;
        this.f39616m1 = inputPeer;
        this.n1 = z9;
        this.f39617o1 = z10;
        this.f39618p1 = z11;
        this.f39619q1 = activity;
        this.f39620r1 = f2Var;
        this.f39621s1 = cVar;
        this.f39622t1 = z12;
    }

    @Override
    public final void I0() {
        y1.b(this.f39614j1, this.f39615k1, this.l1, this.f39616m1, false, this.n1, this.f39617o1, this.f39618p1, this.f39619q1, this.f39620r1, this.f39621s1, false, true, this.f39622t1);
    }
}
