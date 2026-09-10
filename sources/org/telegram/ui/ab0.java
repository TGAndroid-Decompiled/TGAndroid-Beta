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
    public final h90 f30855a;
    public final String f30856b;
    public final org.telegram.ui.ActionBar.p2 f30857c;
    public final long d;
    public final Integer e;
    public final Bundle f30858f;
    public final LaunchActivity f30859g;

    public ab0(LaunchActivity launchActivity, h90 h90Var, String str, org.telegram.ui.ActionBar.p2 p2Var, long j3, Integer num, Bundle bundle) {
        this.f30859g = launchActivity;
        this.f30855a = h90Var;
        this.f30856b = str;
        this.f30857c = p2Var;
        this.d = j3;
        this.e = num;
        this.f30858f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f30859g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.d5.u0((org.telegram.ui.ActionBar.p2) hc.b.i(1, launchActivity.f29933d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f30855a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f30855a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f30859g;
        if (!launchActivity.isFinishing()) {
            String str = this.f30856b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.p2 p2Var = this.f30857c;
            if (str == null || !(p2Var instanceof eo) || ((eo) p2Var).a() != j3) {
                if (p2Var instanceof eo) {
                    eo eoVar = (eo) p2Var;
                    if (eoVar.a() == j3 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(eoVar.f32542x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        ok okVar = eoVar.Y;
                        for (int i10 = 0; i10 < okVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(okVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.l actionBar = eoVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                p2Var = new eo(this.f30858f);
                ((ActionBarLayout) launchActivity.O()).P(p2Var);
            }
            AndroidUtilities.runOnUIThread(new ya0(this, this.f30856b, this.d, p2Var, 0), 150L);
        }
    }
}
