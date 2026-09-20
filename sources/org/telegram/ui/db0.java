package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class db0 implements MessagesController.MessagesLoadedCallback {
    public final r80 f32994a;
    public final boolean[] f32995b;
    public final Bundle f32996c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public db0(LaunchActivity launchActivity, r80 r80Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f32994a = r80Var;
        this.f32995b = zArr;
        this.f32996c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.d5.u0((org.telegram.ui.ActionBar.n2) hg.k0.g(1, launchActivity.f31104d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f32994a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f32994a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f32995b[0]) {
            return;
        }
        zn znVar = new zn(this.f32996c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            znVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(znVar);
    }
}
