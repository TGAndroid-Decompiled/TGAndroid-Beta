package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class n51 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ok0 {
    public final i71 f35951a;

    public n51(i71 i71Var) {
        this.f35951a = i71Var;
    }

    @Override
    public void a() {
        this.f35951a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        i71 i71Var = this.f35951a;
        int i11 = i71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        i71Var.B(false, true, true);
    }
}
