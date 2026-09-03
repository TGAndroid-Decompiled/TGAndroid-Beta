package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class g1 implements org.telegram.ui.ActionBar.c2 {
    public final int f27059a;
    public final LaunchActivity f27060b;

    public g1(LaunchActivity launchActivity, int i10) {
        this.f27059a = i10;
        this.f27060b = launchActivity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f27059a) {
            case 0:
                this.f27060b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f27060b.p0(new org.telegram.ui.b7());
                return;
            default:
                LaunchActivity launchActivity = this.f27060b;
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
