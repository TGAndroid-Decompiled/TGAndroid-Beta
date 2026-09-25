package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class e51 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.yk0 {
    public final a71 f33277a;

    public e51(a71 a71Var) {
        this.f33277a = a71Var;
    }

    @Override
    public void a() {
        this.f33277a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        a71 a71Var = this.f33277a;
        int i11 = a71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        a71Var.B(false, true, true);
    }
}
