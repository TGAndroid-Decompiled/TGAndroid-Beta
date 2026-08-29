package org.telegram.ui.Components;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;
public final class i1 implements org.telegram.ui.ActionBar.b2 {
    public final int f29295a;
    public final LaunchActivity f29296b;

    public i1(LaunchActivity launchActivity, int i10) {
        this.f29295a = i10;
        this.f29296b = launchActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f29295a) {
            case 0:
                this.f29296b.p0(new LanguageSelectActivity());
                return;
            case 1:
                this.f29296b.p0(new org.telegram.ui.x6());
                return;
            default:
                LaunchActivity launchActivity = this.f29296b;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    launchActivity.startActivity(intent);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }
}
