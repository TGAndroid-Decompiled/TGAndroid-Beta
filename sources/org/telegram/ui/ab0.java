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
    public final r80 f34370a;
    public final String f34371b;
    public final org.telegram.ui.ActionBar.n2 f34372c;
    public final long d;
    public final Integer f34373e;
    public final Bundle f34374f;
    public final LaunchActivity f34375g;

    public ab0(LaunchActivity launchActivity, r80 r80Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.f34375g = launchActivity;
        this.f34370a = r80Var;
        this.f34371b = str;
        this.f34372c = n2Var;
        this.d = j3;
        this.f34373e = num;
        this.f34374f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f34375g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.e5.u0((org.telegram.ui.ActionBar.n2) i2.g.h(1, launchActivity.f33429d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f34370a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f34370a.run();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        LaunchActivity launchActivity = this.f34375g;
        if (!launchActivity.isFinishing()) {
            String str = this.f34371b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f34372c;
            if (str == null || !(n2Var instanceof co) || ((co) n2Var).a() != j3) {
                if (n2Var instanceof co) {
                    co coVar = (co) n2Var;
                    if (coVar.a() == j3 && this.f34373e == null) {
                        AndroidUtilities.shakeViewSpring(coVar.f35473x0, 5.0f);
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
                n2Var = new co(this.f34374f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i21(this, this.f34371b, this.d, n2Var, 4), 150L);
        }
    }
}
