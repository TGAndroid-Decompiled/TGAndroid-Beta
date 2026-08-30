package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class g1 implements org.telegram.ui.ActionBar.c2 {
    public final int f25012a;
    public final LaunchActivity f25013b;

    public g1(LaunchActivity launchActivity, int i10) {
        this.f25012a = i10;
        this.f25013b = launchActivity;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f25012a) {
            case 0:
                this.f25013b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f25013b.p0(new org.telegram.ui.b7());
                return;
            default:
                LaunchActivity launchActivity = this.f25013b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
        }
    }
}
