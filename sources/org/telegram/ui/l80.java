package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class l80 implements org.telegram.messenger.vo {
    public final ly f47214a;
    public final boolean[] f47215b;
    public final Bundle f47216c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f47217e;

    public l80(LaunchActivity launchActivity, ly lyVar, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f47217e = launchActivity;
        this.f47214a = lyVar;
        this.f47215b = zArr;
        this.f47216c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f47217e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.t4.t0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity.f41291e0), null, org.telegram.messenger.bd.M0(2131749083, null), null);
        }
        try {
            this.f47214a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void j(boolean z10) {
        try {
            this.f47214a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f47215b[0]) {
            return;
        }
        wm wmVar = new wm(this.f47216c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            wmVar.f51257b6 = chatInvite;
        }
        ((ActionBarLayout) this.f47217e.M()).S(wmVar);
    }
}
