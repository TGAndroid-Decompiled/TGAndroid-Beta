package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;

public final class ja0 implements MessagesController.MessagesLoadedCallback {

    public final a30 f39315a;

    public final String f39316b;

    public final org.telegram.ui.ActionBar.n2 f39317c;
    public final long d;

    public final Integer f39318e;

    public final Bundle f39319f;

    public final LaunchActivity f39320g;

    public ja0(LaunchActivity launchActivity, a30 a30Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j10, Integer num, Bundle bundle) {
        this.f39320g = launchActivity;
        this.f39315a = a30Var;
        this.f39316b = str;
        this.f39317c = n2Var;
        this.d = j10;
        this.f39318e = num;
        this.f39319f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f39320g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.y4.u0((org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity.Z), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f39315a.run();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f39315a.run();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        LaunchActivity launchActivity = this.f39320g;
        if (launchActivity.isFinishing()) {
            return;
        }
        String str = this.f39316b;
        long j10 = this.d;
        org.telegram.ui.ActionBar.n2 rnVar = this.f39317c;
        if (str == null || !(rnVar instanceof rn) || ((rn) rnVar).a() != j10) {
            if (rnVar instanceof rn) {
                rn rnVar2 = (rn) rnVar;
                if (rnVar2.a() == j10 && this.f39318e == null) {
                    AndroidUtilities.shakeViewSpring(rnVar2.f42213t0, 5.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    ck ckVar = rnVar2.U;
                    for (int i10 = 0; i10 < ckVar.getChildCount(); i10++) {
                        AndroidUtilities.shakeViewSpring(ckVar.getChildAt(i10), 5.0f);
                    }
                    org.telegram.ui.ActionBar.k actionBar = rnVar2.getActionBar();
                    for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                        AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                    }
                } else {
                    rnVar = new rn(this.f39319f);
                    ((ActionBarLayout) launchActivity.O()).P(rnVar);
                }
            } else {
                rnVar = new rn(this.f39319f);
                ((ActionBarLayout) launchActivity.O()).P(rnVar);
            }
        }
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.pg(this, this.f39316b, this.d, rnVar, 10), 150L);
    }
}
