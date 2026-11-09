package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w60;
public final class x1 extends w60 {
    public final TLRPC.User f39703j1;
    public final TLRPC.Chat f39704k1;
    public final String l1;
    public final TLRPC.InputPeer f39705m1;
    public final boolean n1;
    public final boolean f39706o1;
    public final boolean f39707p1;
    public final Activity f39708q1;
    public final org.telegram.ui.ActionBar.f2 f39709r1;
    public final org.telegram.messenger.c f39710s1;
    public final boolean f39711t1;

    public x1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z9, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar, boolean z12) {
        super(context, chat);
        this.f39703j1 = user;
        this.f39704k1 = chat2;
        this.l1 = str;
        this.f39705m1 = inputPeer;
        this.n1 = z9;
        this.f39706o1 = z10;
        this.f39707p1 = z11;
        this.f39708q1 = activity;
        this.f39709r1 = f2Var;
        this.f39710s1 = cVar;
        this.f39711t1 = z12;
    }

    @Override
    public final void I0() {
        y1.b(this.f39703j1, this.f39704k1, this.l1, this.f39705m1, false, this.n1, this.f39706o1, this.f39707p1, this.f39708q1, this.f39709r1, this.f39710s1, false, true, this.f39711t1);
    }
}
