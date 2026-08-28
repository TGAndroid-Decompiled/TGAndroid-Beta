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
    public final x20 f38194a;
    public final String f38195b;
    public final org.telegram.ui.ActionBar.o2 f38196c;
    public final long d;
    public final Integer f38197e;
    public final Bundle f38198f;
    public final LaunchActivity f38199g;

    public fa0(LaunchActivity launchActivity, x20 x20Var, String str, org.telegram.ui.ActionBar.o2 o2Var, long j10, Integer num, Bundle bundle) {
        this.f38199g = launchActivity;
        this.f38194a = x20Var;
        this.f38195b = str;
        this.f38196c = o2Var;
        this.d = j10;
        this.f38197e = num;
        this.f38198f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f38199g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.y4.u0((org.telegram.ui.ActionBar.o2) j3.r0.j(1, launchActivity.Z), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f38194a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f38194a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        LaunchActivity launchActivity = this.f38199g;
        if (!launchActivity.isFinishing()) {
            String str = this.f38195b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.o2 o2Var = this.f38196c;
            if (str == null || !(o2Var instanceof qn) || ((qn) o2Var).a() != j10) {
                if (o2Var instanceof qn) {
                    qn qnVar = (qn) o2Var;
                    if (qnVar.a() == j10 && this.f38197e == null) {
                        AndroidUtilities.shakeViewSpring(qnVar.f42077t0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ak akVar = qnVar.U;
                        for (int i9 = 0; i9 < akVar.getChildCount(); i9++) {
                            AndroidUtilities.shakeViewSpring(akVar.getChildAt(i9), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = qnVar.getActionBar();
                        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i10), 5.0f);
                        }
                    }
                }
                o2Var = new qn(this.f38198f);
                ((ActionBarLayout) launchActivity.O()).P(o2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.lg(this, this.f38195b, this.d, o2Var, 10), 150L);
        }
    }
}
