package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class nw implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final int f36594a;
    public final long f36595b;
    public final boolean f36596c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public nw(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, long j10, boolean z4) {
        this.d = d2Var;
        this.e = p2Var;
        this.f36594a = i10;
        this.f36595b = j10;
        this.f36596c = z4;
    }

    @Override
    public void run(boolean z4) {
        qy qyVar = (qy) this.d;
        long j10 = this.f36595b;
        boolean z10 = this.f36596c;
        qy.t0(this.f36594a, j10, (TLRPC.Chat) this.e, qyVar, z10, z4);
    }

    public nw(qy qyVar, int i10, TLRPC.Chat chat, long j10, boolean z4) {
        this.d = qyVar;
        this.f36594a = i10;
        this.e = chat;
        this.f36595b = j10;
        this.f36596c = z4;
    }

    @Override
    public void run(long j10) {
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.e;
        ((org.telegram.ui.ActionBar.d2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f36594a).linkCommunity(-j10, this.f36595b, this.f36596c, new kh.l(p2Var, j10, 3));
    }
}
