package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class cb0 implements MessagesController.MessagesLoadedCallback {
    public final d20 f34526a;
    public final String f34527b;
    public final org.telegram.ui.ActionBar.m2 f34528c;
    public final long d;
    public final Integer e;
    public final Bundle f34529f;
    public final LaunchActivity f34530g;

    public cb0(LaunchActivity launchActivity, d20 d20Var, String str, org.telegram.ui.ActionBar.m2 m2Var, long j10, Integer num, Bundle bundle) {
        this.f34530g = launchActivity;
        this.f34526a = d20Var;
        this.f34527b = str;
        this.f34528c = m2Var;
        this.d = j10;
        this.e = num;
        this.f34529f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f34530g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.m2) i2.d.h(1, launchActivity.f31811d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f34526a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f34526a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f34530g;
        if (!launchActivity.isFinishing()) {
            String str = this.f34527b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.m2 m2Var = this.f34528c;
            if (str == null || !(m2Var instanceof fo) || ((fo) m2Var).a() != j10) {
                if (m2Var instanceof fo) {
                    fo foVar = (fo) m2Var;
                    if (foVar.a() == j10 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(foVar.f35861x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        sk skVar = foVar.Y;
                        for (int i10 = 0; i10 < skVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(skVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = foVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                m2Var = new fo(this.f34529f);
                ((ActionBarLayout) launchActivity.O()).P(m2Var);
            }
            AndroidUtilities.runOnUIThread(new bi.b8(this, this.f34527b, this.d, m2Var, 14), 150L);
        }
    }
}
