package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class la0 implements MessagesController.MessagesLoadedCallback {
    public final f80 f39206a;
    public final boolean[] f39207b;
    public final Bundle f39208c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public la0(LaunchActivity launchActivity, f80 f80Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f39206a = f80Var;
        this.f39207b = zArr;
        this.f39208c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.f5.u0((org.telegram.ui.ActionBar.o2) i2.o1.i(1, launchActivity.f33463d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f39206a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f39206a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f39207b[0]) {
            return;
        }
        sn snVar = new sn(this.f39208c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            snVar.W5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).Q(snVar);
    }
}
