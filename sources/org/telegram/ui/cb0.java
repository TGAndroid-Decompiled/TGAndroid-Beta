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
    public final r80 f32697a;
    public final String f32698b;
    public final org.telegram.ui.ActionBar.n2 f32699c;
    public final long d;
    public final Integer e;
    public final Bundle f32700f;
    public final LaunchActivity f32701g;

    public cb0(LaunchActivity launchActivity, r80 r80Var, String str, org.telegram.ui.ActionBar.n2 n2Var, long j3, Integer num, Bundle bundle) {
        this.f32701g = launchActivity;
        this.f32697a = r80Var;
        this.f32698b = str;
        this.f32699c = n2Var;
        this.d = j3;
        this.e = num;
        this.f32700f = bundle;
    }

    @Override
    public final void onError() {
        LaunchActivity launchActivity = this.f32701g;
        if (!launchActivity.isFinishing()) {
            org.telegram.ui.Components.d5.u0((org.telegram.ui.ActionBar.n2) hg.k0.g(1, launchActivity.f31104d0), null, LocaleController.getString(R.string.JoinToGroupErrorNotExist), null);
        }
        try {
            this.f32697a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onMessagesLoaded(boolean z10) {
        try {
            this.f32697a.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        LaunchActivity launchActivity = this.f32701g;
        if (!launchActivity.isFinishing()) {
            String str = this.f32698b;
            long j3 = this.d;
            org.telegram.ui.ActionBar.n2 n2Var = this.f32699c;
            if (str == null || !(n2Var instanceof zn) || ((zn) n2Var).a() != j3) {
                if (n2Var instanceof zn) {
                    zn znVar = (zn) n2Var;
                    if (znVar.a() == j3 && this.e == null) {
                        AndroidUtilities.shakeViewSpring(znVar.f40530x0, 5.0f);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        lk lkVar = znVar.Y;
                        for (int i10 = 0; i10 < lkVar.getChildCount(); i10++) {
                            AndroidUtilities.shakeViewSpring(lkVar.getChildAt(i10), 5.0f);
                        }
                        org.telegram.ui.ActionBar.k actionBar = znVar.getActionBar();
                        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
                            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
                        }
                    }
                }
                n2Var = new zn(this.f32700f);
                ((ActionBarLayout) launchActivity.O()).P(n2Var);
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.x21(this, this.f32698b, this.d, n2Var, 4), 150L);
        }
    }
}
