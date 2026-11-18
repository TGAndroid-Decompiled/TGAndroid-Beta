package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class h91 extends org.telegram.ui.Components.j60 {
    public final long f48221v2;
    public final j91 f48222w2;

    public h91(j91 j91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.h2 h2Var, long j10) {
        super(context, i7, hVar, j3, h2Var, null);
        this.f48222w2 = j91Var;
        this.f48221v2 = j10;
    }

    @Override
    public final boolean S0() {
        TLRPC.Chat O0 = this.f48222w2.f48916b.getMessagesController().O0(Long.valueOf(this.f48221v2));
        if (O0 != null && org.telegram.messenger.v3.y(3, O0)) {
            return true;
        }
        return false;
    }
}
