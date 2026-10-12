package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ab0 implements MessagesController.MessagesLoadedCallback {
    public final t70 f35748a;
    public final boolean[] f35749b;
    public final Bundle f35750c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f35751e;

    public ab0(LaunchActivity launchActivity, t70 t70Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f35751e = launchActivity;
        this.f35748a = t70Var;
        this.f35749b = zArr;
        this.f35750c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f35751e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) hg.c.h(1, launchActivity.f33620d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f35748a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f35748a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.f35749b[0]) {
            return;
        }
        eo eoVar = new eo(this.f35750c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            eoVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.f35751e.O()).P(eoVar);
    }
}
