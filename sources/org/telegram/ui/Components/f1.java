package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class f1 implements org.telegram.ui.ActionBar.z1 {
    public final int f26162a;
    public final LaunchActivity f26163b;

    public f1(LaunchActivity launchActivity, int i10) {
        this.f26162a = i10;
        this.f26163b = launchActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f26162a) {
            case 0:
                this.f26163b.u0(new LanguageSelectActivity());
                return;
            case 1:
                this.f26163b.u0(new org.telegram.ui.c7());
                return;
            default:
                LaunchActivity launchActivity = this.f26163b;
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
