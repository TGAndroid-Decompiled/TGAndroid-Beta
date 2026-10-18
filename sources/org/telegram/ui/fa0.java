package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class fa0 implements MessagesController.MessagesLoadedCallback {
    public final b80 f36874a;
    public final String f36875b;
    public final org.telegram.ui.ActionBar.n2 f36876c;
    public final long d;
    public final Integer e;
    public final Bundle f36877f;
    public final LaunchActivity f36878g;

    public fa0(LaunchActivity launchActivity, b80 b80Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j10, Integer num, Bundle bundle) {
        this.f36878g = launchActivity;
        this.f36874a = b80Var;
        this.f36875b = str;
        this.f36876c = n2Var;
        this.d = j10;
        this.e = num;
        this.f36877f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f36878g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.f5.t0((org.telegram.ui.ActionBar.n2) i2.d.h(1, launchActivity.f33156d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f36874a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f36874a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f36878g;
        if (!launchActivity.isFinishing()) {
            String str = this.f36875b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f36876c;
            if (str == null || !(n2Var instanceof sn) || ((sn) n2Var).a() != j10) {
                if (n2Var instanceof sn) {
                    sn snVar = (sn) n2Var;
                    if (snVar.a() == j10 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(snVar.f41454x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        hk hkVar = snVar.Y;
                        for (int i10 = 0; i10 < hkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(hkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = snVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                n2Var = new sn(this.f36877f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new ai.b2(this, this.f36875b, this.d, n2Var, 22), 150L);
        }
    }
}
