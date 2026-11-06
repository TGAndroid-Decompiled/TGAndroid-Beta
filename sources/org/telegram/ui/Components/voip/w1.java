package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v60;
public final class w1 extends v60 {
    public final TLRPC.User f39555j1;
    public final TLRPC.Chat f39556k1;
    public final String l1;
    public final TLRPC.InputPeer f39557m1;
    public final boolean n1;
    public final boolean f39558o1;
    public final Activity f39559p1;
    public final org.telegram.ui.ActionBar.f2 f39560q1;
    public final org.telegram.messenger.c f39561r1;

    public w1(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z9, boolean z10, Activity activity, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.f39555j1 = user;
        this.f39556k1 = chat2;
        this.l1 = str;
        this.f39557m1 = inputPeer;
        this.n1 = z9;
        this.f39558o1 = z10;
        this.f39559p1 = activity;
        this.f39560q1 = f2Var;
        this.f39561r1 = cVar;
    }

    @Override
    public final void I0() {
        y1.b(this.f39555j1, this.f39556k1, this.l1, this.f39557m1, true, this.n1, this.f39558o1, false, this.f39559p1, this.f39560q1, this.f39561r1, false, false, false);
    }
}
