package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class h1 implements org.telegram.ui.ActionBar.z1 {
    public final int f26923a;
    public final LaunchActivity f26924b;

    public h1(LaunchActivity launchActivity, int i10) {
        this.f26923a = i10;
        this.f26924b = launchActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f26923a) {
            case 0:
                this.f26924b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f26924b.p0(new org.telegram.ui.x6());
                return;
            default:
                LaunchActivity launchActivity = this.f26924b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
        }
    }
}
