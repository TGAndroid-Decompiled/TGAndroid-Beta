package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class cw implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final int f37232a;
    public final long f37233b;
    public final boolean f37234c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f37235e;

    public cw(org.telegram.ui.ActionBar.c2 c2Var, org.telegram.ui.ActionBar.o2 o2Var, int i10, long j10, boolean z10) {
        this.d = c2Var;
        this.f37235e = o2Var;
        this.f37232a = i10;
        this.f37233b = j10;
        this.f37234c = z10;
    }

    @Override
    public void run(boolean z10) {
        fy fyVar = (fy) this.d;
        long j10 = this.f37233b;
        boolean z11 = this.f37234c;
        fy.t0(this.f37232a, j10, (TLRPC.Chat) this.f37235e, fyVar, z11, z10);
    }

    public cw(fy fyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = fyVar;
        this.f37232a = i10;
        this.f37235e = chat;
        this.f37233b = j10;
        this.f37234c = z10;
    }

    @Override
    public void run(long j10) {
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f37235e;
        ((org.telegram.ui.ActionBar.c2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f37232a).linkCommunity(-j10, this.f37233b, this.f37234c, new ih.m(o2Var, j10, 3));
    }
}
