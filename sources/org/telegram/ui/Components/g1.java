package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class g1 implements org.telegram.ui.ActionBar.c2 {
    public final int f27068a;
    public final LaunchActivity f27069b;

    public g1(LaunchActivity launchActivity, int i10) {
        this.f27068a = i10;
        this.f27069b = launchActivity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27068a) {
            case 0:
                this.f27069b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f27069b.p0(new org.telegram.ui.b7());
                return;
            default:
                LaunchActivity launchActivity = this.f27069b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}
