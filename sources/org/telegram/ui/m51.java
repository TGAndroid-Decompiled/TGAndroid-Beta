package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class m51 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.tl0 {
    public final j71 f39848a;

    public m51(j71 j71Var) {
        this.f39848a = j71Var;
    }

    @Override
    public void a() {
        this.f39848a.m();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        j71 j71Var = this.f39848a;
        int i11 = j71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        j71Var.B(false, true, true);
    }
}
