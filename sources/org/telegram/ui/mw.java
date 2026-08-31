package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class mw implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final int f39231a;
    public final long f39232b;
    public final boolean f39233c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f39234e;

    public mw(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, long j10, boolean z4) {
        this.d = d2Var;
        this.f39234e = p2Var;
        this.f39231a = i10;
        this.f39232b = j10;
        this.f39233c = z4;
    }

    @Override
    public void run(boolean z4) {
        py pyVar = (py) this.d;
        long j10 = this.f39232b;
        boolean z10 = this.f39233c;
        py.t0(this.f39231a, j10, (TLRPC.Chat) this.f39234e, pyVar, z10, z4);
    }

    public mw(py pyVar, int i10, TLRPC.Chat chat, long j10, boolean z4) {
        this.d = pyVar;
        this.f39231a = i10;
        this.f39234e = chat;
        this.f39232b = j10;
        this.f39233c = z4;
    }

    @Override
    public void run(long j10) {
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f39234e;
        ((org.telegram.ui.ActionBar.d2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f39231a).linkCommunity(-j10, this.f39232b, this.f39233c, new lh.l(p2Var, j10, 3));
    }
}
