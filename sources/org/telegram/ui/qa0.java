package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class qa0 implements MessagesController.MessagesLoadedCallback {
    public final g00 f37688a;
    public final String f37689b;
    public final org.telegram.ui.ActionBar.p2 f37690c;
    public final long d;
    public final Integer e;
    public final Bundle f37691f;
    public final LaunchActivity f37692g;

    public qa0(LaunchActivity launchActivity, g00 g00Var, String str, org.telegram.ui.ActionBar.p2 p2Var, long j10, Integer num, Bundle bundle) {
        this.f37692g = launchActivity;
        this.f37688a = g00Var;
        this.f37689b = str;
        this.f37690c = p2Var;
        this.d = j10;
        this.e = num;
        this.f37691f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f37692g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.z4.u0((org.telegram.ui.ActionBar.p2) kh.a2.i(1, launchActivity.f31614a0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f37688a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z4) {
        try {
            this.f37688a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f37692g;
        if (!launchActivity.isFinishing()) {
            String str = this.f37689b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.p2 p2Var = this.f37690c;
            if (str == null || !(p2Var instanceof xn) || ((xn) p2Var).a() != j10) {
                if (p2Var instanceof xn) {
                    xn xnVar = (xn) p2Var;
                    if (xnVar.a() == j10 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(xnVar.f40193u0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        jk jkVar = xnVar.V;
                        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = xnVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                p2Var = new xn(this.f37691f);
                ((ActionBarLayout) launchActivity.O()).P(p2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.ci(this, this.f37689b, this.d, p2Var, 9), 150L);
        }
    }
}
