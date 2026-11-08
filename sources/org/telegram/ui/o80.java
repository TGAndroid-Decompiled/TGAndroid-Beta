package org.telegram.ui;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class o80 implements org.telegram.messenger.ep {
    public final q10 f48324a;
    public final boolean[] f48325b;
    public final Bundle f48326c;
    public final TLRPC.ChatInvite d;
    public final LaunchActivity f48327e;

    public o80(LaunchActivity launchActivity, q10 q10Var, boolean[] zArr, Bundle bundle, TLRPC.ChatInvite chatInvite) {
        this.f48327e = launchActivity;
        this.f48324a = q10Var;
        this.f48325b = zArr;
        this.f48326c = bundle;
        this.d = chatInvite;
    }

    @Override
    public final void a() {
        LaunchActivity launchActivity = this.f48327e;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.v4.r0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity.f41260d0), null, org.telegram.messenger.id.M0(2131749076, null), null);
        }
        try {
            this.f48324a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void f(boolean z9) {
        try {
            this.f48324a.run();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.f48325b[0]) {
            return;
        }
        an anVar = new an(this.f48326c);
        TLRPC.ChatInvite chatInvite = this.d;
        if (chatInvite instanceof TLRPC.TL_chatInvitePeek) {
            anVar.f43728a6 = chatInvite;
        }
        ((ActionBarLayout) this.f48327e.M()).S(anVar);
    }
}
