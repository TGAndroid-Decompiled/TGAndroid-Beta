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
    public final oa0 f32713a;
    public final String f32714b;
    public final org.telegram.ui.ActionBar.o2 f32715c;
    public final long d;
    public final Integer e;
    public final Bundle f32716f;
    public final LaunchActivity f32717g;

    public cb0(LaunchActivity launchActivity, oa0 oa0Var, String str, org.telegram.ui.ActionBar.o2 o2Var, long j3, Integer num, Bundle bundle) {
        this.f32717g = launchActivity;
        this.f32713a = oa0Var;
        this.f32714b = str;
        this.f32715c = o2Var;
        this.d = j3;
        this.e = num;
        this.f32716f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f32717g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.o2) hg.k0.h(1, launchActivity.f30834d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f32713a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f32713a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f32717g;
        if (!launchActivity.isFinishing()) {
            String str = this.f32714b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.o2 o2Var = this.f32715c;
            if (str == null || !(o2Var instanceof bo) || ((bo) o2Var).a() != j3) {
                if (o2Var instanceof bo) {
                    bo boVar = (bo) o2Var;
                    if (boVar.a() == j3 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(boVar.f32502x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        nk nkVar = boVar.Y;
                        for (int i10 = 0; i10 < nkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(nkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = boVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                o2Var = new bo(this.f32716f);
                ((ActionBarLayout) launchActivity.O()).P(o2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k21(this, this.f32714b, this.d, o2Var, 4), 150L);
        }
    }
}
