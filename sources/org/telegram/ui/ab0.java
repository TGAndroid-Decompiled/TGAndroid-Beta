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
    public final r80 f34397a;
    public final String f34398b;
    public final org.telegram.ui.ActionBar.n2 f34399c;
    public final long d;
    public final Integer f34400e;
    public final Bundle f34401f;
    public final LaunchActivity f34402g;

    public ab0(LaunchActivity launchActivity, r80 r80Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.f34402g = launchActivity;
        this.f34397a = r80Var;
        this.f34398b = str;
        this.f34399c = n2Var;
        this.d = j3;
        this.f34400e = num;
        this.f34401f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f34402g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) i2.g.h(1, launchActivity.f33456d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f34397a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f34397a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        LaunchActivity launchActivity = this.f34402g;
        if (!launchActivity.isFinishing()) {
            String str = this.f34398b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f34399c;
            if (str == null || !(n2Var instanceof co) || ((co) n2Var).a() != j3) {
                if (n2Var instanceof co) {
                    co coVar = (co) n2Var;
                    if (coVar.a() == j3 && this.f34400e == null) {
                        AndroidUtilities.shakeViewSpring(coVar.f35500x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        mk mkVar = coVar.Y;
                        for (int i10 = 0; i10 < mkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(mkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = coVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                n2Var = new co(this.f34401f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i21(this, this.f34398b, this.d, n2Var, 4), 150L);
        }
    }
}
