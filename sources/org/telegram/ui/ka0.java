package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ka0 implements MessagesController.MessagesLoadedCallback {
    public final sz f40869a;
    public final boolean[] f40870b;
    public final Bundle f40871c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public ka0(LaunchActivity launchActivity, sz szVar, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f40869a = szVar;
        this.f40870b = zArr;
        this.f40871c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.r2) ic.a.g(1, launchActivity.f35529d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f40869a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f40869a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f40870b[0]) {
            return;
        }
        un unVar = new un(this.f40871c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            unVar.W5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).R(unVar);
    }
}
