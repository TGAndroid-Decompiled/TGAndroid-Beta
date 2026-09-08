package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class n51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nk0 {
    public final j71 f38861a;

    public n51(j71 j71Var) {
        this.f38861a = j71Var;
    }

    @Override
    public void b() {
        this.f38861a.m();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        j71 j71Var = this.f38861a;
        int i11 = j71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        j71Var.B(false, true, true);
    }
}
