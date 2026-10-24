package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ka0 implements MessagesController.MessagesLoadedCallback {
    public final f80 f38882a;
    public final String f38883b;
    public final org.telegram.ui.ActionBar.o2 f38884c;
    public final long d;
    public final Integer e;
    public final Bundle f38885f;
    public final LaunchActivity f38886g;

    public ka0(LaunchActivity launchActivity, f80 f80Var, String str, org.telegram.ui.ActionBar.o2 o2Var, long j10, Integer num, Bundle bundle) {
        this.f38886g = launchActivity;
        this.f38882a = f80Var;
        this.f38883b = str;
        this.f38884c = o2Var;
        this.d = j10;
        this.e = num;
        this.f38885f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f38886g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.d5.t0((org.telegram.ui.ActionBar.o2) i2.o1.i(1, launchActivity.f33465d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38882a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f38882a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f38886g;
        if (!launchActivity.isFinishing()) {
            String str = this.f38883b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.o2 o2Var = this.f38884c;
            if (str == null || !(o2Var instanceof sn) || ((sn) o2Var).a() != j10) {
                if (o2Var instanceof sn) {
                    sn snVar = (sn) o2Var;
                    if (snVar.a() == j10 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(snVar.f41734x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        gk gkVar = snVar.Y;
                        for (int i10 = 0; i10 < gkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(gkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = snVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                o2Var = new sn(this.f38885f);
                ((ActionBarLayout) launchActivity.O()).Q(o2Var);
            }
            AndroidUtilities.runOnUIThread(new ai.c3(this, this.f38883b, this.d, o2Var, 22), 150L);
        }
    }
}
