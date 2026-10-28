package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ma0 implements MessagesController.MessagesLoadedCallback {
    public final kz f41401a;
    public final boolean[] f41402b;
    public final Bundle f41403c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity e;

    public ma0(LaunchActivity launchActivity, kz kzVar, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.e = launchActivity;
        this.f41401a = kzVar;
        this.f41402b = zArr;
        this.f41403c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.r2) ic.a.g(1, launchActivity.f35553d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f41401a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f41401a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.f41402b[0]) {
            return;
        }
        wn wnVar = new wn(this.f41403c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            wnVar.f45050a6 = chatInvite;
        }
        ((ActionBarLayout) this.e.O()).R(wnVar);
    }
}
