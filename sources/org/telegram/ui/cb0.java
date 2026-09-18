package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cb0 implements MessagesController.MessagesLoadedCallback {
    public final y80 f32621a;
    public final boolean[] f32622b;
    public final Bundle f32623c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public cb0(LaunchActivity launchActivity, y80 y80Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f32621a = y80Var;
        this.f32622b = zArr;
        this.f32623c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) hg.k0.g(1, launchActivity.f31064d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f32621a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f32621a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f32622b[0]) {
            return;
        }
        zn znVar = new zn(this.f32623c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            znVar.K5 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).P(znVar);
    }
}
