package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class ja0 implements MessagesController.MessagesLoadedCallback {
    public final sz f40541a;
    public final String f40542b;
    public final org.telegram.ui.ActionBar.r2 f40543c;
    public final long d;
    public final Integer e;
    public final Bundle f40544f;
    public final LaunchActivity f40545g;

    public ja0(LaunchActivity launchActivity, sz szVar, String str, org.telegram.ui.ActionBar.r2 r2Var, long j10, Integer num, Bundle bundle) {
        this.f40545g = launchActivity;
        this.f40541a = szVar;
        this.f40542b = str;
        this.f40543c = r2Var;
        this.d = j10;
        this.e = num;
        this.f40544f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f40545g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.g5.t0((org.telegram.ui.ActionBar.r2) ic.a.g(1, launchActivity.f35529d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f40541a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f40541a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f40545g;
        if (!launchActivity.isFinishing()) {
            String str = this.f40542b;
            long j10 = this.d;
            org.telegram.ui.ActionBar.r2 r2Var = this.f40543c;
            if (str == null || !(r2Var instanceof un) || ((un) r2Var).a() != j10) {
                if (r2Var instanceof un) {
                    un unVar = (un) r2Var;
                    if (unVar.a() == j10 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(unVar.f44471x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        hk hkVar = unVar.Y;
                        for (int i10 = 0; i10 < hkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(hkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = unVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                r2Var = new un(this.f40544f);
                ((ActionBarLayout) launchActivity.O()).R(r2Var);
            }
            AndroidUtilities.runOnUIThread(new bi.y2(this, this.f40542b, this.d, r2Var, 22), 150L);
        }
    }
}
