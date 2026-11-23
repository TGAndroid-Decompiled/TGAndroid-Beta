package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l70;
public final class z1 extends l70 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f41471o1;
    public final String f41472p1;
    public final TLRPC.InputPeer f41473q1;
    public final boolean f41474r1;
    public final boolean f41475s1;
    public final Activity f41476t1;
    public final org.telegram.ui.ActionBar.g2 f41477u1;
    public final org.telegram.messenger.c f41478v1;

    public z1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.n1 = user;
        this.f41471o1 = chat2;
        this.f41472p1 = str;
        this.f41473q1 = inputPeer;
        this.f41474r1 = z10;
        this.f41475s1 = z11;
        this.f41476t1 = activity;
        this.f41477u1 = g2Var;
        this.f41478v1 = cVar;
    }

    @Override
    public final void J0() {
        b2.b(this.n1, this.f41471o1, this.f41472p1, this.f41473q1, true, this.f41474r1, this.f41475s1, false, this.f41476t1, this.f41477u1, this.f41478v1, false, false, false);
    }
}
