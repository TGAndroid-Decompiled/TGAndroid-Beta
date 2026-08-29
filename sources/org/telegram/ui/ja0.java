package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ja0 implements MessagesController.MessagesLoadedCallback {
    public final x60 f39492a;
    public final boolean[] f39493b;
    public final Bundle f39494c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f39495e;

    public ja0(LaunchActivity launchActivity, x60 x60Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f39495e = launchActivity;
        this.f39492a = x60Var;
        this.f39493b = zArr;
        this.f39494c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f39495e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.o2) j7.l1.i(1, launchActivity.Z), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f39492a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f39492a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (this.f39493b[0]) {
            return;
        }
        tn tnVar = new tn(this.f39494c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            tnVar.G5 = chatInvite;
        }
        ((ActionBarLayout) this.f39495e.O()).P(tnVar);
    }
}
