package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;
public final class m1 extends m70 {
    public final TLRPC.User f31601j1;
    public final TLRPC.Chat f31602k1;
    public final String l1;
    public final TLRPC.InputPeer f31603m1;
    public final boolean f31604n1;
    public final boolean f31605o1;
    public final boolean f31606p1;
    public final Activity f31607q1;
    public final org.telegram.ui.ActionBar.k2 f31608r1;
    public final org.telegram.messenger.c f31609s1;
    public final boolean f31610t1;

    public m1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, boolean z12, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar, boolean z13) {
        super(context, chat);
        this.f31601j1 = user;
        this.f31602k1 = chat2;
        this.l1 = str;
        this.f31603m1 = inputPeer;
        this.f31604n1 = z10;
        this.f31605o1 = z11;
        this.f31606p1 = z12;
        this.f31607q1 = activity;
        this.f31608r1 = k2Var;
        this.f31609s1 = cVar;
        this.f31610t1 = z13;
    }

    @Override
    public final void I0() {
        n1.b(this.f31601j1, this.f31602k1, this.l1, this.f31603m1, false, this.f31604n1, this.f31605o1, this.f31606p1, this.f31607q1, this.f31608r1, this.f31609s1, false, true, this.f31610t1);
    }
}
