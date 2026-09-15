package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ab0 implements MessagesController.MessagesLoadedCallback {
    public final ma0 f31742a;
    public final String f31743b;
    public final org.telegram.ui.ActionBar.n2 f31744c;
    public final long d;
    public final Integer e;
    public final Bundle f31745f;
    public final LaunchActivity f31746g;

    public ab0(LaunchActivity launchActivity, ma0 ma0Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.f31746g = launchActivity;
        this.f31742a = ma0Var;
        this.f31743b = str;
        this.f31744c = n2Var;
        this.d = j3;
        this.e = num;
        this.f31745f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f31746g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.n2) hg.k0.h(1, launchActivity.f30820d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f31742a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f31742a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f31746g;
        if (!launchActivity.isFinishing()) {
            String str = this.f31743b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f31744c;
            if (str == null || !(n2Var instanceof bo) || ((bo) n2Var).a() != j3) {
                if (n2Var instanceof bo) {
                    bo boVar = (bo) n2Var;
                    if (boVar.a() == j3 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(boVar.f32524x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        mk mkVar = boVar.Y;
                        for (int i10 = 0; i10 < mkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(mkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = boVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                n2Var = new bo(this.f31745f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.j21(this, this.f31743b, this.d, n2Var, 4), 150L);
        }
    }
}
