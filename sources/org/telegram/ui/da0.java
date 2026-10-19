package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class da0 implements MessagesController.MessagesLoadedCallback {
    public final z70 f36308a;
    public final String f36309b;
    public final org.telegram.ui.ActionBar.n2 f36310c;
    public final long d;
    public final Integer e;
    public final Bundle f36311f;
    public final LaunchActivity f36312g;

    public da0(LaunchActivity launchActivity, z70 z70Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j10, Integer num, Bundle bundle) {
        this.f36312g = launchActivity;
        this.f36308a = z70Var;
        this.f36309b = str;
        this.f36310c = n2Var;
        this.d = j10;
        this.e = num;
        this.f36311f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f36312g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.f5.t0((org.telegram.ui.ActionBar.n2) i2.e.h(1, launchActivity.f33155d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f36308a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f36308a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f36312g;
        if (!launchActivity.isFinishing()) {
            String str = this.f36309b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f36310c;
            if (str == null || !(n2Var instanceof qn) || ((qn) n2Var).a() != j10) {
                if (n2Var instanceof qn) {
                    qn qnVar = (qn) n2Var;
                    if (qnVar.a() == j10 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(qnVar.f40895x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        fk fkVar = qnVar.Y;
                        for (int i10 = 0; i10 < fkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(fkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = qnVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                n2Var = new qn(this.f36311f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new ai.c3(this, this.f36309b, this.d, n2Var, 22), 150L);
        }
    }
}
