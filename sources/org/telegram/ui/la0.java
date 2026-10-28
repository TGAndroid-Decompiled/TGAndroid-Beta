package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class la0 implements MessagesController.MessagesLoadedCallback {
    public final kz f41062a;
    public final String f41063b;
    public final org.telegram.ui.ActionBar.r2 f41064c;
    public final long d;
    public final Integer e;
    public final Bundle f41065f;
    public final LaunchActivity f41066g;

    public la0(LaunchActivity launchActivity, kz kzVar, String str, org.telegram.ui.ActionBar.r2 r2Var, long j10, Integer num, Bundle bundle) {
        this.f41066g = launchActivity;
        this.f41062a = kzVar;
        this.f41063b = str;
        this.f41064c = r2Var;
        this.d = j10;
        this.e = num;
        this.f41065f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f41066g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.r2) ic.a.g(1, launchActivity.f35553d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f41062a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f41062a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f41066g;
        if (!launchActivity.isFinishing()) {
            String str = this.f41063b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.r2 r2Var = this.f41064c;
            if (str == null || !(r2Var instanceof wn) || ((wn) r2Var).a() != j10) {
                if (r2Var instanceof wn) {
                    wn wnVar = (wn) r2Var;
                    if (wnVar.a() == j10 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(wnVar.f45339x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        jk jkVar = wnVar.Y;
                        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = wnVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                r2Var = new wn(this.f41065f);
                ((ActionBarLayout) launchActivity.O()).R(r2Var);
            }
            AndroidUtilities.runOnUIThread(new bi.y2(this, this.f41063b, this.d, r2Var, 22), 150L);
        }
    }
}
