package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class g1 implements org.telegram.ui.ActionBar.c2 {
    public final int f25014a;
    public final LaunchActivity f25015b;

    public g1(LaunchActivity launchActivity, int i10) {
        this.f25014a = i10;
        this.f25015b = launchActivity;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f25014a) {
            case 0:
                this.f25015b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f25015b.p0(new org.telegram.ui.d7());
                return;
            default:
                LaunchActivity launchActivity = this.f25015b;
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
