package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class o51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xk0 {
    public final j71 f36191a;

    public o51(j71 j71Var) {
        this.f36191a = j71Var;
    }

    @Override
    public void a() {
        this.f36191a.m();
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        j71 j71Var = this.f36191a;
        int i11 = j71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        j71Var.B(false, true, true);
    }
}
