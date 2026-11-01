package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;
public final class l1 extends m70 {
    public final TLRPC.User f31581j1;
    public final TLRPC.Chat f31582k1;
    public final String l1;
    public final TLRPC.InputPeer f31583m1;
    public final boolean f31584n1;
    public final boolean f31585o1;
    public final Activity f31586p1;
    public final org.telegram.ui.ActionBar.k2 f31587q1;
    public final org.telegram.messenger.c f31588r1;

    public l1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.f31581j1 = user;
        this.f31582k1 = chat2;
        this.l1 = str;
        this.f31583m1 = inputPeer;
        this.f31584n1 = z10;
        this.f31585o1 = z11;
        this.f31586p1 = activity;
        this.f31587q1 = k2Var;
        this.f31588r1 = cVar;
    }

    @Override
    public final void I0() {
        n1.b(this.f31581j1, this.f31582k1, this.l1, this.f31583m1, true, this.f31584n1, this.f31585o1, false, this.f31586p1, this.f31587q1, this.f31588r1, false, false, false);
    }
}
