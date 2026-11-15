package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x60;
public final class a2 extends x60 {
    public final TLRPC.User n1;
    public final TLRPC.Chat f40492o1;
    public final String f40493p1;
    public final TLRPC.InputPeer f40494q1;
    public final boolean f40495r1;
    public final boolean f40496s1;
    public final Activity f40497t1;
    public final org.telegram.ui.ActionBar.e2 f40498u1;
    public final org.telegram.messenger.c f40499v1;

    public a2(Context context, TLRPC.Chat chat, TLRPC.User user, TLRPC.Chat chat2, String str, TLRPC.InputPeer inputPeer, boolean z10, boolean z11, Activity activity, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.messenger.c cVar) {
        super(context, chat);
        this.n1 = user;
        this.f40492o1 = chat2;
        this.f40493p1 = str;
        this.f40494q1 = inputPeer;
        this.f40495r1 = z10;
        this.f40496s1 = z11;
        this.f40497t1 = activity;
        this.f40498u1 = e2Var;
        this.f40499v1 = cVar;
    }

    @Override
    public final void I0() {
        c2.b(this.n1, this.f40492o1, this.f40493p1, this.f40494q1, true, this.f40495r1, this.f40496s1, false, this.f40497t1, this.f40498u1, this.f40499v1, false, false, false);
    }
}
