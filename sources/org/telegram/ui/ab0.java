package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ab0 implements MessagesController.MessagesLoadedCallback {
    public final q70 f35750a;
    public final boolean[] f35751b;
    public final Bundle f35752c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f35753e;

    public ab0(LaunchActivity launchActivity, q70 q70Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f35753e = launchActivity;
        this.f35750a = q70Var;
        this.f35751b = zArr;
        this.f35752c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f35753e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) hg.c.h(1, launchActivity.f33622d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f35750a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f35750a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.f35751b[0]) {
            return;
        }
        eo eoVar = new eo(this.f35752c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            eoVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.f35753e.O()).P(eoVar);
    }
}
