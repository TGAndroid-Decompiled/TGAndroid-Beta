package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class lw implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final int f36149a;
    public final long f36150b;
    public final boolean f36151c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public lw(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, long j10, boolean z4) {
        this.d = d2Var;
        this.e = p2Var;
        this.f36149a = i10;
        this.f36150b = j10;
        this.f36151c = z4;
    }

    @Override
    public void run(boolean z4) {
        oy oyVar = (oy) this.d;
        long j10 = this.f36150b;
        boolean z10 = this.f36151c;
        oy.t0(this.f36149a, j10, (TLRPC.Chat) this.e, oyVar, z10, z4);
    }

    public lw(oy oyVar, int i10, TLRPC.Chat chat, long j10, boolean z4) {
        this.d = oyVar;
        this.f36149a = i10;
        this.e = chat;
        this.f36150b = j10;
        this.f36151c = z4;
    }

    @Override
    public void run(long j10) {
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.e;
        ((org.telegram.ui.ActionBar.d2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f36149a).linkCommunity(-j10, this.f36150b, this.f36151c, new kh.l(p2Var, j10, 3));
    }
}
