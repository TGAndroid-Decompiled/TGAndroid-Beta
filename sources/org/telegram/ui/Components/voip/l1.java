package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q60;
public final class l1 extends q60 {
    public final TLRPC.User k1;
    public final TLRPC.Chat f39456l1;
    public final String m1;
    public final TLRPC.InputPeer f39457n1;
    public final boolean f39458o1;
    public final boolean f39459p1;
    public final Activity f39460q1;
    public final org.telegram.ui.ActionBar.d2 f39461r1;
    public final org.telegram.messenger.c f39462s1;

    public l1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.k1 = user;
        this.f39456l1 = chat2;
        this.m1 = str;
        this.f39457n1 = inputPeer;
        this.f39458o1 = z10;
        this.f39459p1 = z11;
        this.f39460q1 = activity;
        this.f39461r1 = d2Var;
        this.f39462s1 = cVar;
    }

    @Override
    public final void I0() {
        n1.b(this.k1, this.f39456l1, this.m1, this.f39457n1, true, this.f39458o1, this.f39459p1, false, this.f39460q1, this.f39461r1, this.f39462s1, false, false, false);
    }
}
