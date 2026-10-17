package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ga0 implements MessagesController.MessagesLoadedCallback {
    public final b80 f37197a;
    public final boolean[] f37198b;
    public final Bundle f37199c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public ga0(LaunchActivity launchActivity, b80 b80Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f37197a = b80Var;
        this.f37198b = zArr;
        this.f37199c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.f5.t0((org.telegram.ui.ActionBar.n2) i0.a.h(1, launchActivity.f33149d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f37197a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f37197a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f37198b[0]) {
            return;
        }
        sn snVar = new sn(this.f37199c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            snVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(snVar);
    }
}
