package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ia0 implements MessagesController.MessagesLoadedCallback {
    public final x60 f39182a;
    public final String f39183b;
    public final org.telegram.ui.ActionBar.o2 f39184c;
    public final long d;
    public final Integer f39185e;
    public final Bundle f39186f;
    public final LaunchActivity f39187g;

    public ia0(LaunchActivity launchActivity, x60 x60Var, String str, org.telegram.ui.ActionBar.o2 o2Var, long j10, Integer num, Bundle bundle) {
        this.f39187g = launchActivity;
        this.f39182a = x60Var;
        this.f39183b = str;
        this.f39184c = o2Var;
        this.d = j10;
        this.f39185e = num;
        this.f39186f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f39187g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.c5.u0((org.telegram.ui.ActionBar.o2) j7.l1.i(1, launchActivity.Z), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f39182a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f39182a.run();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        LaunchActivity launchActivity = this.f39187g;
        if (!launchActivity.isFinishing()) {
            String str = this.f39183b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.o2 o2Var = this.f39184c;
            if (str == null || !(o2Var instanceof tn) || ((tn) o2Var).a() != j10) {
                if (o2Var instanceof tn) {
                    tn tnVar = (tn) o2Var;
                    if (tnVar.a() == j10 && this.f39185e == null) {
                        AndroidUtilities.shakeViewSpring(tnVar.f42973t0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        dk dkVar = tnVar.U;
                        for (int i10 = 0; i10 < dkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(dkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.l actionBar = tnVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                o2Var = new tn(this.f39186f);
                ((ActionBarLayout) launchActivity.O()).P(o2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.sg(this, this.f39183b, this.d, o2Var, 10), 150L);
        }
    }
}
