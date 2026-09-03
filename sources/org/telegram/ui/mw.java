package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class mw implements MessagesStorage.BooleanCallback, MessagesStorage.LongCallback {
    public final int f39124a;
    public final long f39125b;
    public final boolean f39126c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f39127e;

    public mw(org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.p2 p2Var, int i10, long j10, boolean z4) {
        this.d = d2Var;
        this.f39127e = p2Var;
        this.f39124a = i10;
        this.f39125b = j10;
        this.f39126c = z4;
    }

    @Override
    public void run(boolean z4) {
        py pyVar = (py) this.d;
        long j10 = this.f39125b;
        boolean z10 = this.f39126c;
        py.t0(this.f39124a, j10, (TLRPC.Chat) this.f39127e, pyVar, z10, z4);
    }

    public mw(py pyVar, int i10, TLRPC.Chat chat, long j10, boolean z4) {
        this.d = pyVar;
        this.f39124a = i10;
        this.f39127e = chat;
        this.f39125b = j10;
        this.f39126c = z4;
    }

    @Override
    public void run(long j10) {
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.f39127e;
        ((org.telegram.ui.ActionBar.d2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f39124a).linkCommunity(-j10, this.f39125b, this.f39126c, new lh.l(p2Var, j10, 3));
    }
}
